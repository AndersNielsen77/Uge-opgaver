package Netværk_programmering;
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class WebServer {

    public static void main(String[] args) {
        //Inicilere
        ServerSocket MyServerSocket = null;
        int PORT = 8080;
        //Try catch for at opsamle fejl.
        try {
            MyServerSocket = new ServerSocket(PORT);
            System.out.println("Server start!");
            System.out.println("Venter på forbindelse på port: " + PORT );
            System.out.println("-----------------------------------");
            //Kører loopet til MyServerSocket lukker.
            while (true){
                    Socket klientSocket = MyServerSocket.accept();
                    Scanner netin = new Scanner(klientSocket.getInputStream());
                    PrintWriter pw = new PrintWriter(klientSocket.getOutputStream());
                    //Kører til mere input i getInputStream.
                    while (netin.hasNextLine()) {
                        String info = netin.nextLine();
                        System.out.println(info);
                        //Sender til server.
                        pw.flush();
                        klientSocket.close();
                    }
                    MyServerSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
