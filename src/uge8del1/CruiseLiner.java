package uge8del1;

public class CruiseLiner extends Ship{
	
	private int noOfPassegers;
	
	public CruiseLiner(String name, int length, int noOfPassegers) {
		super(name, length);
		this.noOfPassegers= noOfPassegers;
	}

	
	public String toString (){
		return super.toString ()+" cruise liner with "+ noOfPassegers +" passenger capacity";
		}

}
