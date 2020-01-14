package uge8del1;

public class Tanker extends Ship{
	
	private int barrels;

	public Tanker(String name, int lenght, int barrels) {
		super(name, lenght);
		this.barrels = barrels;
	}
	
	public String toString (){
		return super.toString ()+" tanker with "+ barrels +" barrels capacity";
		}


}
