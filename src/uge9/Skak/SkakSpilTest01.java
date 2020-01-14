package uge9.Skak;

public class SkakSpilTest01 {

    public static void main(String[] args) {
        Loeber hl1 = new Loeber(5, 3, "hvid");
        System.out.println(hl1);
        hl1.translate(2, -2);
        System.out.println(hl1);

    }
}

