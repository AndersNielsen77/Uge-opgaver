package uge11;
import java.util.Scanner;

public class Syntaxtavle {

    public static void main(String[] args){

        System.out.println(facRec(15));
    }

    public static void reverse(Scanner input){
        if(input.hasNextLine()){
            String line = input.nextLine();
            reverse(input);
            System.out.println(line);
        }
    }

    public static int facRec(int n){
        if (n <= 1){
            return 1;
        } else {
            return n* facRec(n-1);
        }
    }





}
