package uge11.Fib;

public class Fibonacci {
/*    public static int fib(int n) {
        //langsomt ved 40.
        if (n < 0) {
            throw new IllegalArgumentException("intet " + n + "'te Fibbonaccital");
        }
        if (n == 0) return 1;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    private static int[] fibHelper(int n) {

    }*/

    private static int[] fibHelper(int i ){
        int[] res = new int[2];
        if (i == 0){
            res[1] = 1;
        }else {
            int[] previous = fibHelper(i-1);
            res[0] = previous[1];
            res[1] = previous[0]+previous[1];

        }
        return res;
    }
    public static int fibII(int i) {
        return fibHelper(i)[1];
    }

}

