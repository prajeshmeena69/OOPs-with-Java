package Unit_3;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array = ");
        int a[] = new int[sc.nextInt()];

        System.out.print("Enter elements of the Array = ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("The elements of Array are = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
