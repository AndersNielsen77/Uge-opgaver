package uge2;

public class Uge2sluttavle {

	public static void main(String[] args) {
		for (int linje=0; linje < 5; linje++) {
			//Skrive minusser
			skriveMinusser(5-linje);
			//Skrive tal
			int antal = 2*linje+1;
			for(int i = 0; i<antal;i++)
				System.out.print(antal);
			
			//Skrive minusser
			skriveMinusser(5-linje);
			//Skrive linje
			System.out.println();	
		}
	}
	public static void skriveMinusser(int antalMinusser ) {
		for (int i = 0; i < antalMinusser; i++) {
			System.out.print("-");
		}
	}
}
