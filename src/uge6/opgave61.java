package uge6;
import java.util.*;


public class opgave61 {

	public static void main(String[] args) {
        System.out.println(lastIndexOf(new int[]{74, 85, 102, 99, 101, 85, 56}, 85));
		
	}
	public static int lastIndexOf (int[] a , int v ) {
		int i = a.length;
		
		do {
			if (i == 0) {
				return -1; }
			i = i - 1;
		} while (a[i] != v);
		
		return i;
	}
}

