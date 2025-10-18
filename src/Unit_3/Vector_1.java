package Unit_3;

import java.util.Vector;

public class Vector_1 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>(1, 5);
        vec.add("1st");
        vec.add("2nd");
        vec.add("3rd");
        vec.add("4th");
        System.out.println(vec.capacity());
        System.out.println(vec.size());
    }
}
