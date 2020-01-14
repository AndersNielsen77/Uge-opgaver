package uge2;

public class Stairs {   

public static final int HEIGHT= 5;

public static final int TOTALHEIGHT= HEIGHT*5;

public static void main(String[] args){
    //Main Outer Loop
    for(int i=1; i<=HEIGHT; i++){

        //Loop for the spaces before, then print the head
        for(int j=1; j<=TOTALHEIGHT+(i*(-5)); j++){ 
            System.out.print(" ");
        }
        printTop();

        //Loop for spaces after, then print asterisk
        for(int j=1; j<=(i-1)*5; j++){ 
            System.out.print(" ");
        }
        System.out.println("*");

        //Loop for the spaces before, then print the body
        for(int j=1; j<=TOTALHEIGHT+(i*(-5)); j++){ 
            System.out.print(" ");
        }
        printMiddle();

        //Loop for spaces after, then print asterisk
        for(int j=1; j<=(i-1)*5; j++){ 
            System.out.print(" ");
        }
        System.out.println("*");

        //Loop for spaces before, then print the legs
        for(int j=1; j<=TOTALHEIGHT+(i*(-5)); j++){ 
            System.out.print(" ");
        }
        printBottom();

        //Loop for spaces after, then print asterisk
        for(int j=1; j<=(i-1)*5; j++){ 
            System.out.print(" ");
        }
        System.out.println("*");            
    }

    // for loop for printing the floor of asterisks
    for(int i=1; i<= TOTALHEIGHT+7; i++){
        System.out.print("*");
    }
}   

public static void printTop() {
    System.out.print("  o  ******");
}

public static void printMiddle() {
    System.out.print(" /|\\ *     ");
}

public static void printBottom() {
    System.out.print(" / \\ *     ");
}
}
