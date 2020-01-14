package Uge5;

public class Opgave53 {

	public static void main(String[] args) {
		
	}
	public static int computeIndex(int n) {

		int i = 0;
		while (n > i) {
			i++;
			int j = i*(i+1)/2;
			if (n <= j) {
				n = i;
				return n;
			}
		}
		return n;
	}
	
}
