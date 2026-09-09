import java.util.Scanner;

public class GettingNumbers {
    public static void main(String[] args) {
        
        System.out.println("Calculator App");

        Scanner scanner = new Scanner(System.in);
        
        double numb1 = scanner.nextDouble();
        System.out.printf("First number: " + numb1 + "\n");

        double numb2 = scanner.nextDouble();
        System.out.printf("Second number: " + numb2 + "\n");

        scanner.close();
    }
}
