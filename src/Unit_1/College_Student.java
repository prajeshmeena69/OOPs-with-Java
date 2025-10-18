package Unit_1;

public class College_Student extends Student {
    public College_Student(String name, int roll_no) {
        super(name, roll_no);
    }

    public void attend_class() {
        System.out.println(name + " attended class.");
    }

    public void give_exam() {
        System.out.println(roll_no + " give exam in online mode.");
    }
}
