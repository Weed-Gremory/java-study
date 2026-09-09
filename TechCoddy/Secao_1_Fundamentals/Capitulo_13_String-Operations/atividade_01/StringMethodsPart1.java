import java.util.Scanner;

public class StringMethodsPart1 {
    public static void analyzeString(String str) {
        // Write your code here

        int length = str.length();
        char character = str.charAt(4);
        String sub1 = str.substring(7);
        String sub2 = str.substring(3, 6);
        boolean end = str.endsWith(".");
        String upper = str.toUpperCase();

        System.out.printf("Length: %d\nChar at 4: %c\nSubstring: %s\nSubstring 2: %s\nEnds with dot: %b\nUppercase: %s", length, character, sub1, sub2, end, upper);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        analyzeString(message);

        scanner.close();
    }
}
