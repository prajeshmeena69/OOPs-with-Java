package Unit_1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyException {
    public static void main(String[] args) throws IOException {
        int x, y, z = 0;
        Scanner sc = new Scanner(System.in);

//        x = dis.readInt();
//        y = dis.readInt();
//        x = (x / y);
//        System.out.println("Exception Not Occur");

        try {
            x = sc.nextInt();
            y = sc.nextInt();
            x = (x / y);
            System.out.println("Exception Not Occur");
        }

        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Result is = " + z);
        }
    }
}