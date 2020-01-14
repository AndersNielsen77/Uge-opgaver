package uge4;

import java.util.*;

public class opgave43 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String name = console.nextLine();
	    
		if (name.contains("java") || name.contains("nova")) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	} 

}
