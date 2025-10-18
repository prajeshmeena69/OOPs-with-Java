package Unit_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting_1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(7);
        al.add(6);
        al.add(3);
        al.add(4);
        al.add(0);
        al.add(2);
        al.add(1);
        al.add(5);
        Collections.sort(al); // ascending
        System.out.println("Array List in Ascending Order = " + al);
        Collections.sort(al, Comparator.reverseOrder());
        System.out.println("Array List in Descending Order = " + al);
    }
}
