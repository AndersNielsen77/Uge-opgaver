package aflevering;

import java.util.Scanner;

public class NextPrime {

    public static void main(String[] args) {
        Scanner brugerinput = new Scanner(System.in);
        int n = brugerinput.nextInt();
        System.out.println("Next Prime:" + nextPrime(n));
    }

    public static int nextPrime(int n){
        int temp = 1;
        boolean negativ = false;

        if (n == 1 || n== -1 || n==0){
            temp = 0;
        }
        if (n < 0){
            n = n*-1;
            negativ = true;

        }

        int mod = 0;
        int m = n+1;

        do {
            temp = temp+1;
            mod = m % temp;

            if (mod == 0 && m > temp){
                m = m+1;
                temp = 1;
            }
        }while (m != temp);

        if (negativ == true){
            return m*-1;
        }else
        return m;
    }
}
