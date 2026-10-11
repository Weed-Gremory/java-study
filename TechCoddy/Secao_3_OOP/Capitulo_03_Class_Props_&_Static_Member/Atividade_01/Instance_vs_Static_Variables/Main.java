import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs for three books
        String title1 = scanner.nextLine();
        double price1 = Double.parseDouble(scanner.nextLine());
        String title2 = scanner.nextLine();
        double price2 = Double.parseDouble(scanner.nextLine());
        String title3 = scanner.nextLine();
        double price3 = Double.parseDouble(scanner.nextLine());

        Book b1 = new Book(title1, price1);
        Book b2 = new Book(title2, price2);
        Book b3 = new Book(title3, price3);

        System.out.printf("%s: $%.2f\n%s: $%.2f\n%s: $%.2f\nTotal books: %d", b1.getTitle(), b1.getPrice(), b2.getTitle(), b2.getPrice(), b3.getTitle(), b3.getPrice(), Book.getTotalBooks());

        scanner.close();
        
        // TODO: Create three Book objects using the inputs above
        
        // TODO: Print each book's title and price in format: [title]: $[price]
        // Use String.format("%.2f", price) for formatting the price to 2 decimal places
        
        // TODO: Print the total number of books using the static method
        // Format: Total books: [count]
        // Remember to access static method through class name: Book.getTotalBooks()
    }
}
