package Netværk_programmering;

import java.net.*;
import java.util.Date;
import java.util.StringTokenizer;
import java.io.*;

@SuppressWarnings("InfiniteLoopStatement")
public class webservermik {

    @SuppressWarnings("InfiniteLoopStatement")
    public static void main(String[] args) {
        final int PORT = 8084;
        ServerSocket MyServerSocket = null; // Erklæring af en serversocket
        final File Fil = new File("/home/andersnielsen/Downloads/website");

        try {
            MyServerSocket = new ServerSocket(PORT);
            System.out.println("Venter på forbindelse");


            while (true) {
                Socket klientSocket = MyServerSocket.accept();
                System.out.println("Forbundet");
                BufferedReader input = new BufferedReader(new InputStreamReader(klientSocket.getInputStream()));
                PrintWriter output = new PrintWriter(klientSocket.getOutputStream());
                BufferedOutputStream dataOutput = new BufferedOutputStream(klientSocket.getOutputStream());
                String inputserver = input.readLine();
                StringTokenizer str = new StringTokenizer(inputserver);
                String f = str.nextToken();
                String fileReq = str.nextToken();
                System.out.println(fileReq);
                File file = new File(Fil, fileReq);
                int fileLength = (int) file.length();
                byte[] fileData = readFile(file, fileLength);
                String content = "text/html";
                output.println("HTTP/1.1 200 OK");
                output.println("Server: HTTP Server 1.0");
                output.println("Date: " + new Date());
                output.println("Content-type: " + content);
                output.println("Content-length: " + fileLength);
                output.println("");
                output.flush();
                dataOutput.write(fileData, 0, fileLength);
                dataOutput.flush();
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static byte[] readFile(File file, int fileLength) throws IOException {
        FileInputStream fin = null;
        byte[] buffer = new byte[fileLength];
        try {
            fin = new FileInputStream(file);
            fin.read(buffer);
        } finally {
            if (fin != null)
                fin.close();
        }
        return buffer;
    }
}