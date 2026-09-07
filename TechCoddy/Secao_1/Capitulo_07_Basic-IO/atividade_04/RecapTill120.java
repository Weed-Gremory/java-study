import java.util.Scanner;

public class RecapTill120 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code below

        int age = scanner.nextInt();
        
        int finalAge = 120 - age;

        System.out.printf("%d years till 120", finalAge);

        scanner.close();

    }
}
