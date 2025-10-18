package Unit_3;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_2 {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(12, "Nikhil", 26));
        al.add(new Student(13, "Harshit", 95));
        al.add(new Student(15, "Hemang", 77));
        al.add(new Student(63, "Prajesh", 136));
        Collections.sort(al);
        for (Student st : al) {
            System.out.println("Name = " + st.name + ", Age = " + st.age + ", Roll No. = " + st.roll_no);
        }
    }
}
