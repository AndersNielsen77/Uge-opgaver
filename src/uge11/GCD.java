package uge11;

public class GCD {

    public static void main(String[] a) {
        System.out.println(GCD.gcd(4, 6));
    }

    public static int gcd(int a, int b) {
        if (a < 0 || b < 0) {
            return gcd(Math.abs(a), Math.abs(b));
        } else if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}

