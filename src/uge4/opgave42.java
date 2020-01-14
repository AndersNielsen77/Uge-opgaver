package uge4;

import java.util.*;

public class opgave42 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();

		System.out.println(min4Digits(n));
	}

	private static String min4Digits(int n) {

		String min = Integer.toString(n); // Laver int om til string.
		String padded;
		if (n < 0) {
			padded = String.format("%05d", n);
		} else {
			padded = String.format("%04d", n);
		}
		return padded;

		// Forkert shit
		/*
		 * if (.length() == 4) { System.out.println(min); } else if (min.length() == 3)
		 * { System.out.println("0" + min); } else if (min.length() == 2) {
		 * System.out.println("00" + min); } else if (min.length() == 4) {
		 * System.out.println("000" + min); }
		 */
	}
}
