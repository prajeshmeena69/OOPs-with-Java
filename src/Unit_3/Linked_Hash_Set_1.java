package Unit_3;

import java.util.LinkedHashSet;

public class Linked_Hash_Set_1 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("one");
        lhs.add("two");
        lhs.add("two");
        lhs.add("three");
        System.out.println(lhs);
    }
}