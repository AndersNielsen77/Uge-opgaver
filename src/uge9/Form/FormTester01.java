package uge9.Form;

public class FormTester01 {
    public static void main(String[] args) {
        Form[] f = {new Cirkel(1.5), new Rektangel(2.0,3.0), new Kvadrat(2.5)};
        System.out.println("areal:");
        for(int i = 0 ; i<f.length; i++) {
            System.out.println(f[i].areal());
        }
    }
}
