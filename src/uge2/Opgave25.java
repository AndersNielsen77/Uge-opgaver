package uge2;

public class Opgave25 {

	public static void main(String[] args) {
	    for(int i = 1; i <= 9; i+=2) {
	    	
	    	//Før 
	        for(int j = 0; j < (11 - i) / 2; j++)
	            System.out.print("-");
	            
	        for(int j = 0; j < i; j++)
	            System.out.print(i);
	        
	        //Efter
	        for(int j = 0; j < (11 - i) / 2; j++)
	            System.out.print("-");
	            
	        System.out.println();
	    }
	}
}

