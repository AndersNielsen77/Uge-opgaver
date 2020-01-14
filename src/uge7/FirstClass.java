package uge7;
import java.util.*;

/* Skeleton for the exercise */

public class FirstClass {
	private String navn;
	private int id;
	// Put the field declarations here
		
	//Contructor
	public FirstClass(String navn, int id){
		// Add body
		this.navn=navn;
		this.id=id;
		
	}
	
	// Method
	
	public String toString() {
		return id+" - "+navn;
	}
	
}
