package uge8del1;

public class ContainerShip extends Ship{
	
	private int teu;
	
	public ContainerShip(String name, int lenght, int teu) {
		super(name, lenght);
		this.teu = teu;
	}
	
	public String toString (){
		return super.toString ()+" container carrier with "+ teu +" TEU";
		}


}
