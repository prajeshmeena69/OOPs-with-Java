package Unit_2;

public class Switch_Expression {
    public static void main(String[] args) {
        String day = "Wednesday";
        String category = get_Day_Category(day);
        System.out.println(day + " is a " + category + ".");
    }

    public static String get_Day_Category(String day) {
        return switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
            case "Saturday", "Sunday" -> "Weekend";
            default -> "Unknown";
        };
    }
}
