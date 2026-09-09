import java.util.Scanner;

public class StringFormatting {
    public static String createFormattedString(String productName, int quantity, double unitPrice) {
        // Write your code here

        double convquantity = quantity;

        String result = String.format("Product: %s, Quantity: %.1f, Unit Price: %.5f", productName, convquantity, unitPrice);

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int qty = scanner.nextInt();
        double price = scanner.nextDouble();
        String formattedString = createFormattedString(product, qty, price);
        System.out.println(formattedString);

        scanner.close();
    }
}
