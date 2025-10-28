package Unit_2;

public class String_Comparison {
    public static void main(String[] args) {
        String str1 = "Geeks for Geeks";
        String str2 = """
                Geeks for Geeks""";

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        System.out.println("\nComparisons");
        System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1 == str2);
    }
}
