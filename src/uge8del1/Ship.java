package uge8del1;

public class Ship{

	private String name;
	private int length;
	
	public Ship(String name, int length) {
		this.name = name;
		this.length = length;
	}
	
	public String toString (){
		return " Ship "+ name +" l="+ length ;
		}

}
