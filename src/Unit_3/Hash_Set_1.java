package Unit_3;

import java.util.HashSet;
import java.util.Scanner;

public class Hash_Set_1 {
    public static void main(String[] args) {
        HashSet<String> hs1 = new HashSet<>();
        HashSet<String> hs2 = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of hs1 = ");
        int n = sc.nextInt();
        System.out.print("Enter the size of hs2 = ");
        int m = sc.nextInt();

        System.out.print("Enter the elements in hs1 = ");
        for (int i = 0; i < n; i++)
            hs1.add(sc.next());

        System.out.print("Enter the elements in hs2 = ");
        for (int i = 0; i < m; i++)
            hs2.add(sc.next());

//        System.out.println(hs2);
//        hs1.removeAll(hs2);
//        System.out.print(hs1);

        hs1.remove(hs2);
        System.out.println(hs1);
        hs1.removeIf(str -> str.contains("aa"));
    }
}