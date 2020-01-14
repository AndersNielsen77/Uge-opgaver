package uge6;

public class opgave62 {

	public static void main(String[] args) {
		System.out.println(countInRange(new int[] { 14, 1, 22, 17, 36, 7, 43, 5 }, 4, 17));

	}
	public static int countInRange (int[] a , int min , int max ) {
		int antal = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] >= min && a[i] <= max) {
				antal = antal +1;
			}
		}
		return antal;
	}

}
