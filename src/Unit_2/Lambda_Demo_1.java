package Unit_2;

public class Lambda_Demo_1 {
    public static void main(String[] args) {
        Numeric_Test isEven = (int n) -> n % 2 == 0;
        System.out.println(isEven.test(12));
    }
}
