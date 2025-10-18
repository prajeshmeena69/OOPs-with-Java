package Unit_3;

import java.util.HashMap;
import java.util.Scanner;

public class Hash_Map_1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String key = sc.next();
            int val = sc.nextInt();
            hm.put(key, val);
        }

        for (String k: hm.keySet()) {
            System.out.println(k + " " + hm.get(k));
        }
    }
}
