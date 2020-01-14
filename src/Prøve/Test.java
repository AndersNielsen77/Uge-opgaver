package Prøve;
public class Test {
    public static void main(String[] args) {
        System.out.println(opg3(6,20));
        System.out.println(opg4(6,20));

    }

    private static int opg4(int l, int r) {
        if (l>r) {
            return l-r;
        }else {
         return r-l;
        }
    }

    public static int opg3 (int l, int r) {
        if(r < l) return -opg3(r, l);
        int c = 0;
        for(int i = l; i<r; i++) {
            c++;
        }
        return c;
    }
}

