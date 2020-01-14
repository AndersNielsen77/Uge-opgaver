package uge10.ArrayListX;

import java.util.ArrayList;

// File: ArrayListXTest.java
public class ArrayListXTest01 {
    public static void main(String[] args) {
        test01();
    }

    private static void test01() {
        ArrayList<Integer>	 l1 = new   ArrayList<Integer>();
        ArrayList<Integer>	 l2 = new   ArrayList<Integer>();

        l1.add(12);
        l1.add(14);
        l1.add(15);
        l1.add(17);
        l1.add(12);
        l1.add(19);
        l1.add(10);

        l2.add(22);
        l2.add(27);
        l2.add(23);
        l2.add(24);

        ArrayListX.printList(l1,"L1");
        ArrayListX.printList(l2,"L2");

        ArrayListX.append(l1, l2);
        ArrayListX.printList(l1,"L1 with L2");
        ArrayListX.printList(l2,"L2");
    }

    private static void test02() {
        ArrayList<Integer>	 l1 = new   ArrayList<Integer>();
        ArrayList<Integer>	 l2 = new   ArrayList<Integer>();

        l1.add(12);
        l1.add(14);
        l1.add(15);
        l1.add(17);
        l1.add(12);
        l1.add(19);
        l1.add(10);

        l2.add(22);
        l2.add(27);
        l2.add(23);
        l2.add(24);

        ArrayListX.printList(l1,"L1");
        ArrayListX.printList(l2,"L2");

        ArrayListX.append(l2, l1);
        ArrayListX.printList(l2,"L2 with L1");
        ArrayListX.printList(l1,"L1");
    }
    private static void test03() {
        ArrayList<Integer>	 l1 = new   ArrayList<Integer>();
        ArrayList<Integer>	 l2 = new   ArrayList<Integer>();

        l1.add(12);
        l1.add(14);
        l1.add(15);
        l1.add(17);
        l1.add(12);
        l1.add(19);
        l1.add(10);

        l2.add(22);
        l2.add(27);
        l2.add(23);
        l2.add(24);

        ArrayListX.printList(l1,"L1");
        ArrayListX.printList(l2,"L2");

        ArrayList<Integer> merger = ArrayListX.merge(l2, l1);
        ArrayListX.printList(merger,"Merged");
        ArrayListX.printList(l1,"L1");
        ArrayListX.printList(l2,"L2");
    }


}


