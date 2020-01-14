package uge12;

public class Rekursion {
    public static void main(String[] args) {
        mysteryI(42);
        //System.out.println(mysteryII(6,13));
    }
    public static void mysteryI(int n){
        if (n <= 1) {
            System.out.print(n);
        } else {
            mysteryI(n/2);
            System.out.print(", "+n);
        }
    }

    public static int mysteryII(int x, int y){ //modelus
        if (x<y){
            return x;
        } else {
            return mysteryII(x-y, y);
        }
    }
}
