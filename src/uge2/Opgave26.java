package uge2;
public class Opgave26 {
	
public static final int TRIN = 10;
public static final int TRINIALT = TRIN * 5;

	public static void main(String[] args) {
		for (int i = 1; i <= TRIN; i++) {
			
			//loop for mellemrum, når hovedet er print
	        for (int j=1; j<=TRINIALT+(i*(-5)); j++){ 
	            System.out.print(" ");
	        }
	        hoved();
			
	        //----------Mellemrum mellem, og laver stjerne til sidst------------
	        for (int j = 1; j <= (i-1)*5; j++) {
				System.out.print(" ");
			}
	        System.out.println("*");
	      
			//loop for mellemrum, når krop er print
	        for (int j=1; j<=TRINIALT+(i*(-5)); j++){ 
	            System.out.print(" ");
	        }
	        krop();
			
	        //----------Mellemrum mellem, og laver stjerne til sidst------------
	        for (int j = 1; j <= (i-1)*5; j++) {
				System.out.print(" ");
			}
	        System.out.println("*");
			
			//loop for mellemrum, når krop er print
	        for (int j=1; j<=TRINIALT+(i*(-5)); j++){ 
	            System.out.print(" ");
	        }
	        ben();
			
	        //----------Mellemrum mellem, og laver stjerne til sidst------------
	        for (int j = 1; j <= (i-1)*5; j++) {
				System.out.print(" ");
			}
	        System.out.println("*");
			
		}
		for (int j = 1; j <=TRINIALT+7 ; j++) {
		    System.out.print("*");

		}
	    }
	
	
	public static void hoved() {
		System.out.print("  O  ******");
	}
	
	public static void krop() {
		System.out.print(" /|\\ *     ");
	}
	
	public static void ben() {
		System.out.print(" / \\ *     ");
	}
}
