package Uge5;

public class Opgave54 {

	public static void main(String[] args) {
	}

	public static int gcd(int a, int b) {
		do {
			int x = b;
			b = a % b;
			a = x;
		} while (b != 0);
		if (a < 0) {
			return a*-1;
		}else 
		return a;
		
	}

}
