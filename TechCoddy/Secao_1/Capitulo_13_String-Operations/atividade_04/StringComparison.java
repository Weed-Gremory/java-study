import java.util.Scanner;

public class StringComparison {
    public static void compareStrings(String str1, String str2) {
        // Write your code here
        
        boolean comp1 = str1.equals(str2);
        boolean comp2 = str1.equalsIgnoreCase(str2);
        int comp3 = str1.compareTo(str2);
        int comp4 = str1.compareToIgnoreCase(str2);

        System.out.printf("%s equals %s: %b\n%s equalsIgnoreCase %s: %b\n%s compareTo %s: %d\n%s compareToIgnoreCase %s: %d", str1, str2, comp1, str1, str2,comp2, str1, str2, comp3, str1, str2, comp4);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        compareStrings(str1, str2);

        scanner.close();
    }
}
