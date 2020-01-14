package uge12;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        int k,n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        k = s.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        if (k > n){
            k = k-n;
        }

        System.out.println(Arrays.toString(Arrays(k, n, arr)));
    }
    private static int[] Arrays(int k, int n, int[] arr) {
        int[] rot = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (k+i >= n){
                rot[i]=arr[j];
                j++;
            }else{
                rot[i] = arr[k+i];
            }
        }
        return rot;
    }
}
