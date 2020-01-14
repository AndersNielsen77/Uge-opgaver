package GUI;


/*
 * Gruppe: Mads Ptak, Mikkel Rahbek og Anders Nielsen
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;

public class KrydsogBoll {

    public static void main(String[] args) {
        Socket MySocket = null; // Vi initilisere vores socket

        try {
            // Bestemmer sværhedsgrad (Hvilken server man vil forbinde til, og efterfølgende spille med)
            Scanner player = new Scanner(System.in); // Opretter en scanner for spilleren
            System.out.println("Bestem sværhedsgrad!");
            System.out.println("Skriv let eller svær:");
            String neu = player.nextLine();
            if (neu.equals("let")) {
                System.out.println("Du har valgt let sværhedsgrad!");
                MySocket = new Socket("itkomsrv.fotonik.dtu.dk", 1102);
            } else if (neu.equals("svær")) {
                System.out.println("Du har valgt svær sværhedsgrad!");
                MySocket = new Socket("itkomsrv.fotonik.dtu.dk", 1105);
            } else {
                // Kaster fejl, hvis bruger hverken skriver "svær" eller "let".
                throw new IllegalArgumentException();
            }

            System.out.println("--------------------------------");


            //Spillet begynder, og vi opretter en scanner som modtager input fra serveren
            Scanner netin = new Scanner(MySocket.getInputStream());
            for (int i = 0; i < 3; i++) { //Første forbindelse til serveren har 3 linjer text
                String textline = netin.nextLine();
                System.out.println(textline);
            }

            // Initialisere værdier til while loopet.
            String textline2 = "Initialize";
            String Win = "SERVER WINS";
            String Win2 = "PLAYER WINS";
            String Win3 = "NOBODY WINS";
            int var1 = 0;

            // Spiillet gentages så længe at en vinder ikke er fundet, eller at brættet er fyldt ud.
            while ((var1 != Win.compareTo(textline2)) && (var1 != Win2.compareTo(textline2))
                    && (var1 != Win3.compareTo(textline2))) {

                PrintWriter pw2 = new PrintWriter(MySocket.getOutputStream()); //Opretter printwriter som kan skrive til serveren
                int t = player.nextInt(); //via en scanner fortæller brugeren hvilken felt man vil placere sin brik på.
                pw2.print(t + "\r\n"); //Linje som skal sendes til serveren
                pw2.flush(); //Sender alt i printwriteren til serveren
                //Loop som printer de 2 linjer serveren kommunikere tilbage til spilleren
                for (int i = 0; i < 2; i++) {
                    textline2 = netin.nextLine();
                    System.out.println(textline2);
                }
            }
            try { // Lukker kommunikationen mellem client og server, når spillet er slut
                MySocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (UnknownHostException e) { //Hvis clienten ikke kan finde nogen server
            System.out.println("could not find local address!");
        } catch (IOException e) {
            System.out.println("could not find local address!v2");
        } catch (IllegalArgumentException e) { //Hvis bruger ikke opfylder kravet om sværhedsgrad
            System.out.println("Ingen sværhedsgrad valgt");
        }
    }
}
