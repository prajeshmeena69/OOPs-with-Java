package Unit_1;

public class Student_1 {
    private String grade;
    public int roll_no;
    public String name;

    public Student_1(String grade, int roll_no, String name) {
        this.grade = grade;
        this.roll_no = roll_no;
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
