import java.util.Scanner;

public class FormattingOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rnd = scanner.nextLine();
        
        // Write your code below
        
        System.out.printf("The input is: %s", rnd);

        scanner.close();
    }
}
