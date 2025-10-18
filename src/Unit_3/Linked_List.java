package Unit_3;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("1st");
        ll.add("2nd");
        ll.add("3rd");
        ll.add("4th");
        Iterator itr = ll.descendingIterator();
        while (itr.hasNext())
            System.out.println(itr.next());
        ll.remove("3rd");
        ll.addFirst("0th");
        ll.addLast("5th");
        System.out.println(ll);
    }
}
