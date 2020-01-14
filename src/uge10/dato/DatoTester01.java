package uge10.dato;
import java.util.Arrays;

public class DatoTester01 {
    public static void main(String[] args) {
        Dato[] datoer = {new Dato(2005,2,2), new Dato(1994,12,24), new Dato(2001,8,29)};
        System.out.println(Arrays.toString(datoer));
        Arrays.sort(datoer);
        System.out.println(Arrays.toString(datoer));
    }
}