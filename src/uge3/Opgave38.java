package uge3;
import java.util.*;

public class Opgave38 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter your full name:");
		String fulde_navn = console.nextLine();
		
		fulde_navn.split(" ");
		String firstname = fulde_navn.split(" ")[0]; 
		String lastname = fulde_navn.split(" ")[1]; 

		
		System.out.println("Your name in reverse order is " + lastname + ", " + firstname);
	}
}
