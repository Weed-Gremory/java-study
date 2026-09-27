import java.util.Scanner;

public class DesafioSwitchExpression {
    public static String getMealType(int hour, boolean abbreviated) {
        // Write your code here

        String mealType = switch (hour) {
            case 5, 6, 7, 8, 9, 10 -> abbreviated ? "BKT" : "BREAKFAST";
            case 11, 12, 13, 14, 15 -> abbreviated ? "LCH" : "LUNCH";
            case 16, 17, 18, 19, 20, 21 -> abbreviated ? "DNR" : "DINNER";
            default -> abbreviated ? "SNK" : "SNACK";
        };

        return mealType;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        boolean abbreviated = Boolean.parseBoolean(scanner.nextLine());
        
        System.out.println(getMealType(hour, abbreviated));

        scanner.close();
    }
}
