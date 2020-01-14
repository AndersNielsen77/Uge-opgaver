package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Opg2 extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    public static Socket MySocket = null; // Vi initilisere vores socket
    // Declare components for the program's window
    public static JButton b1;
    public static JButton b2;
    public static JButton b3;
    public static JButton b4;
    public static JButton b5;
    public static JButton b6;
    public static JButton b7;
    public static JButton b8;
    public static JButton b9;
    static int t = 0;
    JFrame f;

    Opg2(){

        f = new JFrame();
        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3,3));


        b1 = new JButton(".");
        b2 = new JButton(".");
        b3 = new JButton(".");
        b4 = new JButton(".");
        b5 = new JButton(".");
        b6 = new JButton(".");
        b7 = new JButton(".");
        b8 = new JButton(".");
        b9 = new JButton(".");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        p1.add(b1);p1.add(b2);p1.add(b3);
        p1.add(b4);p1.add(b5);p1.add(b6);
        p1.add(b7);p1.add(b8);p1.add(b9);

        JTextArea Tekst = new JTextArea();
        Tekst.setText("Fisk");

        content.add(p1, BorderLayout.CENTER);
        content.add(Tekst, BorderLayout.SOUTH);

        f.setContentPane(content);

        f.setSize(400,400);
        f.setVisible(true);
    }

    public static void main(String[] args) {

        new Opg2();

        try {
            // Bestemmer sværhedsgrad (Hvilken server man vil forbinde til, og efterfølgende spille med)
            Scanner player = new Scanner(System.in); // Opretter en scanner for spilleren
            System.out.println("Bestem sværhedsgrad!");
            System.out.println("Skriv let eller svær:");
            //String neu = player.nextLine();

            MySocket = new Socket("itkomsrv.fotonik.dtu.dk", 1102);
            System.out.println("--------------------------------");

            //Spillet begynder, og vi opretter en scanner som modtager input fra serveren
            Scanner netin = new Scanner(MySocket.getInputStream());
            for (int i = 0; i < 3; i++) { //Første forbindelse til serveren har 3 linjer text
                String textline = netin.nextLine();
                System.out.println(textline);
                if (textline.substring(0,5).equals("BOARD")) {
                    String s = textline.substring(9);

                    b1.setText(String.valueOf(s.charAt(0)));
                    b2.setText(String.valueOf(s.charAt(1)));
                    b3.setText(String.valueOf(s.charAt(2)));
                    b4.setText(String.valueOf(s.charAt(3)));
                    b5.setText(String.valueOf(s.charAt(4)));
                    b6.setText(String.valueOf(s.charAt(5)));
                    b7.setText(String.valueOf(s.charAt(6)));
                    b8.setText(String.valueOf(s.charAt(7)));
                    b9.setText(String.valueOf(s.charAt(8)));
                }
            }
            // Initialisere værdier til while loopet.
            String textline2 = "Initialize";
            String Win = "SERVER WINS";
            String Win2 = "PLAYER WINS";
            String Win3 = "NOBODY WINS";
            int var1 = 0;

            while ((var1 != Win.compareTo(textline2)) && (var1 != Win2.compareTo(textline2))
                    && (var1 != Win3.compareTo(textline2))) {
                for (int i = 0; i < 2; i++) {
                    textline2 = netin.nextLine();
                    System.out.println(textline2);
                    if (textline2.substring(0, 5).equals("BOARD")) {
                        String s = textline2.substring(9);

                        b1.setText(String.valueOf(s.charAt(0)));
                        b2.setText(String.valueOf(s.charAt(1)));
                        b3.setText(String.valueOf(s.charAt(2)));
                        b4.setText(String.valueOf(s.charAt(3)));
                        b5.setText(String.valueOf(s.charAt(4)));
                        b6.setText(String.valueOf(s.charAt(5)));
                        b7.setText(String.valueOf(s.charAt(6)));
                        b8.setText(String.valueOf(s.charAt(7)));
                        b9.setText(String.valueOf(s.charAt(8)));
                    }
                }
                // Spiillet gentages så længe at en vinder ikke er fundet, eller at brættet er fyldt ud.
            }
            try { // Lukker kommunikationen mellem client og server, når spillet er slut
                if (var1 == Win.compareTo(textline2)) {
                    MySocket.close();
                    System.exit(0);
                } if (var1 == Win2.compareTo(textline2)) {
                    MySocket.close();
                    System.exit(0);
                } if (var1 == Win3.compareTo(textline2)) {
                    MySocket.close();
                    System.exit(0);
                }

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
    public void actionPerformed(ActionEvent e) {
        Scanner netin2 = null;
        try {
            netin2 = new Scanner(MySocket.getInputStream());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        String textline2 = "Initialize";

        PrintWriter pw2 = null; //Opretter printwriter som kan skrive til serveren
        try {
            pw2 = new PrintWriter(MySocket.getOutputStream());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    if(e.getSource() == b1) {
        t = 1;
        pw2.print(t + "\r\n");
        pw2.flush();
    } else if (e.getSource() == b2){
        t = 2;
        pw2.print(t + "\r\n");
        pw2.flush();
    } else if (e.getSource() == b3){
        t = 3;
        pw2.print(t + "\r\n");
        pw2.flush();
    } else if (e.getSource() == b4){
        t = 4;
        pw2.print(t + "\r\n");
        pw2.flush();
    } else if (e.getSource() == b5){
        t = 5;
        pw2.print(t + "\r\n");
        pw2.flush();
    } else if (e.getSource() == b6){
        t = 6;
        pw2.print(t + "\r\n");
        pw2.flush();
    } else if (e.getSource() == b7){
        t = 7;
        pw2.print(t + "\r\n");
        pw2.flush();
    } else if (e.getSource() == b8){
        t = 8;
        pw2.print(t + "\r\n");
        pw2.flush();
    } else if (e.getSource() == b9){
        t = 9;
        pw2.print(t + "\r\n");
        pw2.flush();
    }
    }
}