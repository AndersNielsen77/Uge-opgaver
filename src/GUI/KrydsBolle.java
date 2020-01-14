package GUI;

import java.net.Socket;
import java.net.UnknownHostException;
import java.io.*;
import java.util.*;

public class KrydsBolle {

	public static void main(String[] args) {
		Socket sock = null;
		String textline = "";
		Scanner netin = null;
		Scanner console = null;
		PrintWriter pw = null;
		
		// det tjekkes om serveren kan kontaktes
		try
		{
			sock = new Socket("130.225.75.112", 1102);
			netin = new Scanner(sock.getInputStream());
			pw = new PrintWriter(sock.getOutputStream());
			console = new Scanner(System.in);

			// printer de f�rste 3 linjer fra serveren med tilh�rende board.
			for (int i = 1; i <= 3; i++) {
				textline = netin.nextLine();
				System.out.println(textline);
				if (textline.substring(0,5).equals("BOARD")) {
					printBoard(textline);
				}


			}
		} catch (UnknownHostException uhEx)
		{
			System.out.println(
					"Could not find host");
		} catch (IOException ioEx)
		{
			System.out.println(
					"Could not find: 130.225.75.112");
		}




		// printer serverens beskeder, samt giver mulighed for at indtaste v�rdi
		// ift. hvor man vil s�tte sit kryds eller bolle - og sender denne til serveren.
		// printer desuden boardet efter hver tur.
		while (tester(textline) == true) {
			pw.print(console.nextInt()+"\r\n");
			pw.flush();
			textline = netin.nextLine();
			System.out.println(textline);
			printBoard(textline);
			textline = netin.nextLine();
			System.out.println(textline);

		}
		
		// det tjekkes om det er muligt at lukke socket.
		try {
			sock.close();
		}	catch (IOException ioEx)
		{
			System.out.println("could not find socket!");
		}





	}
	// tjekker hvorn�r spillet er slut, idet serveren slutter linjen med WINS,
	// n�r spillet slutter. Dette bruges til vores while-l�kke.
	public static boolean tester(String s) {
		if (s.endsWith("WINS")){
			return false;
		}
		return true;

	}

	// printer spillepladen.
	public static void printBoard(String s) {	
		s = s.substring(9);
		for (int i = 0; i <=2; i++) {
			System.out.println("+---+---+---+");
			cool(i*3+1,i*3+2,i*3+3);
			System.out.println("| "+s.charAt(i*3)+" | "+s.charAt(i*3+1)+" | "+s.charAt(i*3+2)+" |");
			System.out.println("|   |   |   |");
		}
		System.out.println("+---+---+---+");
	}

	// bruges til boardet
	public static void cool(int i, int j, int k) {
		System.out.println("|"+i+"  |"+j+"  |"+k+"  |");
	}
}
