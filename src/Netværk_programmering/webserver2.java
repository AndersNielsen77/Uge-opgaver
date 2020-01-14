package Netværk_programmering;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.StringTokenizer;

class WebServer2 implements Runnable {

    static final File WEB_ROOT = new File("/home/andersnielsen/Downloads/website");
    static final String DEFAULT_FILE = "index.html";
    static final String FILE_NOT_FOUND = "fejl.html";
    static final String METHOD_NOT_SUPPORTED = "not_supported.html";

    private Socket connect;

    public WebServer2(Socket accept) {
        connect = accept;
    }

    public static void main(String[] args) {
        //Inicilere
        ServerSocket MyServerSocket = null;
        int PORT = 8080;
        //Try catch for at opsamle fejl.
        try {
            ServerSocket serverConnect = new ServerSocket(PORT);
            System.out.println("Server start!");
            System.out.println("Venter på forbindelse på port: " + PORT );
            System.out.println("-----------------------------------");

            while (true) {
                WebServer2 myServer = new WebServer2(serverConnect.accept());
                System.out.println("Forbindelse åben. (" + new Date() + ")");
                Thread thread = new Thread(myServer);
                thread.start();
            }
        } catch (IOException e) {
            System.err.println("Server forbindelses fejl: " + e.getMessage());
        }
    }

    @Override
    public void run() {
        BufferedReader ind = null;
        PrintWriter ud = null;
        BufferedOutputStream dataUd = null;
        String fileRequested = null;

        try {
            ind = new BufferedReader(new InputStreamReader(connect.getInputStream()));
            ud = new PrintWriter(connect.getOutputStream());
            dataUd = new BufferedOutputStream(connect.getOutputStream());

            String input = ind.readLine();
            StringTokenizer parse = new StringTokenizer(input);
            String method = parse.nextToken().toUpperCase();
            fileRequested = parse.nextToken().toLowerCase();

            if (!method.equals("HEAD") && !method.equals("GET")) {
                System.out.println("501 Not Implemented : " + method + " method.");
                File file = new File(WEB_ROOT, METHOD_NOT_SUPPORTED);

                int fileL = (int) file.length();

                String contentMimeType = "text/html";
                byte[] fileData = readFileData(file, fileL);

                ud.println("HTTP/1.1 501 Not Implemented");
                ud.println("Server: Java HTTP Server: 1.0");
                ud.println("Date: " + new Date());
                ud.println("Content-type: " + contentMimeType);
                ud.println("Content-length: " + fileL);
                ud.println();
                ud.flush();


                dataUd.write(fileData, 0, fileL);
                dataUd.flush();

            } else {
                File file = new File(WEB_ROOT, fileRequested);
                int fileL = (int) file.length();
                String content = getContentType(fileRequested);

                if (method.equals("GET")) {
                    byte[] fileData = readFileData(file, fileL);

                    ud.println("HTTP/1.1 200 OK");
                    ud.println("Server: Java HTTP Server: 1.0");
                    ud.println("Date: " + new Date());
                    ud.println("Content-type: " + content);
                    ud.println("Content-length: " + fileL);
                    ud.println();
                    ud.flush();


                    dataUd.write(fileData, 0, fileL);
                    dataUd.flush();
                }
            }

        } catch (FileNotFoundException fnfe) {
            try {
                fileNotFound(ud, dataUd, fileRequested);
            } catch (IOException ioe) {
                System.err.println("Error with file not found exception : " + ioe.getMessage());
            }
        } catch (IOException ioe) {
            System.err.println("Server fejl: " + ioe);
        } finally {
            try {
                ind.close();
                ud.close();
                dataUd.close();
                connect.close();
            } catch (Exception e) {
                System.err.println("Fejl vedlukke serve: " + e.getMessage());
            }
            System.out.println("Forbindelse lukket.");
        }
    }

    private byte[] readFileData(File file, int fileLength) throws IOException {
        FileInputStream fileIn = null;
        byte[] fileData = new byte[fileLength];

        try {
            fileIn = new FileInputStream(file);
            fileIn.read(fileData);
        } finally {
            if (fileIn != null)
                fileIn.close();
        }
        return fileData;
    }

    private void fileNotFound(PrintWriter out, OutputStream dataOut, String fileRequested) throws IOException {
        File file = new File(WEB_ROOT, FILE_NOT_FOUND);
        int fileLength = (int) file.length();
        String content = "text/html";
        byte[] fileData = readFileData(file, fileLength);

        out.println("HTTP/1.1 404 File Not Found");
        out.println("Server: Java HTTP Server from SSaurel : 1.0");
        out.println("Date: " + new Date());
        out.println("Content-type: " + content);
        out.println("Content-length: " + fileLength);
        out.println(); // blank line between headers and content, very important !
        out.flush(); // flush character output stream buffer

        dataOut.write(fileData, 0, fileLength);
        dataOut.flush();

        System.out.println("File " + fileRequested + " not found");

    }

    private String getContentType(String fileRequested) {
        if (fileRequested.endsWith(".html") || fileRequested.endsWith(".htm"))
            return "text/html";
        else if (fileRequested.endsWith(".txt") || fileRequested.endsWith(".java"))
            return "text/plain";
        else if (fileRequested.endsWith(".gif"))
            return "image/gif";
        else if (fileRequested.endsWith(".class"))
            return "application/octet-stream";
        else if (fileRequested.endsWith(".jpg") || fileRequested.endsWith(".jpeg"))
            return "image/jpeg";
        else
            return "text/plain";
    }
}

