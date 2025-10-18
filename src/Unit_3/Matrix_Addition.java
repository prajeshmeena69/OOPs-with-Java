package Unit_3;

import java.util.Scanner;

public class Matrix_Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row = ");
        int r = sc.nextInt();
        System.out.print("Enter Column = ");
        int c = sc.nextInt();

        int a[][] = new int[r][c];
        System.out.print("Enter elements of 1st Matrix = ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int b[][] = new int[r][c];
        System.out.print("Enter elements of 2nd Matrix = ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nThe Sum of Matrix = ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print((a[i][j] + b[i][j]) + " ");
            }
            System.out.print("\n");
        }
    }
}
