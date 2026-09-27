import java.util.Scanner;

public class AdvancedStringFormatting {
    public static String formatData(String name, double price, int quantity, String format) {
        // Write your code here

        if (name == null || format == null) return "Invalid input";

        String result = switch (format){
            case "basic" -> String.format("ITEM: %s, PRICE: $%.2f", name, price);
            case "detailed" -> String.format("PRODUCT: %s\nPRICE: $%.2f\nQUANTITY: %d", name, price, quantity);
            case "total" -> String.format("TOTAL FOR %dx %s: $%.2f", quantity, name, price * quantity);
            default -> String.format("Invalid input");
        };

        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double price = Double.parseDouble(scanner.nextLine());
        int quantity = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();
        
        if (name.equals("null")) name = null;
        if (format.equals("null")) format = null;
        
        System.out.println(formatData(name, price, quantity, format));

        scanner.close();
    }
}
