package uge6;

public class opgave63 {

	public static void main(String[] args) {
        System.out.println(mode(new int[] {27, 15, 15, 11, 27}));

		System.out.println(modeX(new int[] {-270, 150, 150, 110, -270}));
		
	}
	public static int mode(int[] a) {
		int temp;
		int max = 0;
		int[] antal = new int[100];

		for (int i = 0; i < a.length; i++) {
			temp = a[i];
			int next = 0;
			antal[temp]++;
		}
		for (int j = 0; j < antal.length; j++) {
			if(antal[j]>max) {
				max = antal[j];
			}
		}
		for (int k = 0; k < antal.length; k++) {
			if (antal[k] == max) {
				return k;
			}
		}
		return max;
	}
	
	public static int modeX(int[] a) {
		int temp;
		int max = 0;
		int[] antal = new int[300];
		

		for (int t = 0; t >= 100; t++) {
			
		}

		for (int i = 0; i < a.length; i++) {
			temp = a[i];
			int next = 0;
			antal[temp]++;
		}
		for (int j = 0; j < antal.length; j++) {
			if(antal[j]>max) {
				max = antal[j];
			}
		}
		for (int k = 0; k < antal.length; k++) {
			if (antal[k] == max) {
				return k;
			}
		}
		return max;
	}
}
