package uge10;
import java.util.ArrayList;

public class syntax {

    public static void main (String[] args) {
        int simple_array[] = new int[5];

        ArrayList<Integer> myList = new ArrayList<Integer>(5);
        myList.add(1);
        myList.add(2);
        myList.add(6);
        myList.add(7);
        myList.add(10);

        for (Integer x : myList)
            System.out.println(x);
        System.out.println("size = "+myList.size());

        myList.clear();

        for (Integer x : myList)
            System.out.println(x);
        System.out.println("size = "+myList.size());

    }

}
