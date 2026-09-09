import java.util.Scanner;

public class StringMethodsPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String delimiter = scanner.nextLine();
        // Write your code below

        String[] split = text.split(" ");
        String together = String.join(delimiter, split);

        System.out.println(together);

        scanner.close();
    }
}
