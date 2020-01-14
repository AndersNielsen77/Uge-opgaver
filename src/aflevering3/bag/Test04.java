package aflevering3.bag;

import java.text.DecimalFormat;

public class Test04{
    private static DecimalFormat df5 = new DecimalFormat("00000");

    public static void main(String[] args) {
        test_04();
    }
    private static void test_00() {
        System.out.println("------ 00");
        SimpleBag sb = new SimpleBag();
        sb.addString("This");
        boolean b0 = sb.addString("problem");
        sb.addString("is");
        sb.addString("nice");
        boolean b1 = sb.addString("Nice");
        sb.addString("nice");

        printnice(sb);
        System.out.println(b0 + " " + b1);

    }

    private static void test_01() {
        System.out.println("------ 01");
        BagWithoutRepetitions sb = new BagWithoutRepetitions();
        sb.addString("This");
        sb.addString("problem");
        sb.addString("is");
        sb.addString("nice");
        sb.addString("Nice");
        sb.addString("nice");

        printnice(sb);

    }

    private static void test_02() {
        System.out.println("------  02");
        OrderedBag sb = new OrderedBag();
        sb.addString("This");
        sb.addString("problem");
        sb.addString("is");
        sb.addString("nice");
        sb.addString("Nice");
        sb.addString("nice");

        printnice(sb);

    }

    private static void test_03() {
        System.out.println("------ 03");
        OrderedBagWithoutRepetitions sb = new OrderedBagWithoutRepetitions();
        sb.addString("This");
        sb.addString("problem");
        sb.addString("is");
        sb.addString("nice");
        sb.addString("Nice");
        sb.addString("nice");

        printnice(sb);

    }

    private static void test_04() {
        System.out.println("------ 04");
        OrderedBagWithoutRepetitions sb = new OrderedBagWithoutRepetitions();
        sb.addString("This");
        sb.addString("problem");
        sb.addString("is");
        sb.addString("nice");
        sb.addString("Nice");
        sb.addString("nice");

        sb.removeAllOccurrences("is");

        printnice(sb);

    }

    private static void test_05() {
        System.out.println("------ 05");
        SimpleBag sb = new SimpleBag();
        System.out.println(sb.addString("This"));
        System.out.println(sb.addString("problem"));
        System.out.println(sb.addString("is"));
        System.out.println(sb.addString("nice"));
        System.out.println(sb.addString("Nice"));
        System.out.println(sb.addString("nice"));

    }


    private static void printfirstmiddellast(Bag sb) {
        System.out.println(sb.getString(0));
        System.out.println(sb.getString(sb.noOfElements() / 2));
        System.out.println(sb.getString(sb.noOfElements() - 1));

    }

    /**
     * @param sb
     */
    private static void printnice(Bag sb) {
        for (int i = 0; i < sb.noOfElements(); i++) {
            System.out.println(sb.getString(i));
        }

    }


}

