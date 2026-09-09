import java.util.Scanner;

public class FormattedOutput {
    public static void main(String[] args) {
        
        System.out.println("Calculator App");

        Scanner scanner = new Scanner(System.in);
        
        double numb1 = scanner.nextDouble();
        //System.out.println("First number: " + numb1);

        double numb2 = scanner.nextDouble();
        //System.out.println("Second number: " + numb2);

        double sum = numb1 + numb2;
        System.out.printf("Sum: %.2f\n", sum);

        double difference = numb1 - numb2;
        System.out.printf("Difference: %.2f\n", difference);

        double product = numb1 * numb2;
        System.out.printf("Product: %.2f\n", product);

        double quotient = numb1 / numb2;
        System.out.printf("Quotient: %.2f\n", quotient);

        scanner.close();
    }
}
