package Unit_1;

public class MyStudent {
    public static void main(String[] args) {
        Student_1 st = new Student_1("A", 105, "Kartik");
        System.out.println("name = " + st.name);
        System.out.println("grade = " + st.getGrade());
    }
}
