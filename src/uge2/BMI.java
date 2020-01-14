package uge2;

public class BMI {

	public static void main(String[] args) {
		int v = 70;
		int h = 180;
		double hMeter = h/100.0; // husk .0 eller regner det forker.
		double bmi = v / (hMeter*hMeter);
		System.out.println(bmi);
		

	}

}
