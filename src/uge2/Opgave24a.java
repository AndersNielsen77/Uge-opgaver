package uge2;

public class Opgave24a {

	public static void main(String[] args) {
		int f0 = 1;
		int f1 = 1;
		
		System.out.print(f0 + " ");
		System.out.print(f1 + " ");
		
		for (int fk = f1 + f0; fk < 12; fk = f1 + f0) {
			System.out.print(fk + " ");
			f0 = f1;
			f1 = fk;
			
		}
	}

}
