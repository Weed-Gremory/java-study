import java.util.Scanner;

public class RecapDynamicInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code below

        int count = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < count; i++) {
            sum += scanner.nextInt();
            scanner.nextLine();
        }
        
        System.out.print(sum);
    }
}
