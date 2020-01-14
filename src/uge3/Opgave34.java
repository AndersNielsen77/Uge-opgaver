package uge3;
import java.util.*;

public class Opgave34 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		int a = console.nextInt();
		printnr(a);
	}
	public static int printnr (int a) {
		int i = 1;
		for (i = 1; i <= a; i++) {
			System.out.print("["+i+"]");
		}
		return i;
	}
	
}
