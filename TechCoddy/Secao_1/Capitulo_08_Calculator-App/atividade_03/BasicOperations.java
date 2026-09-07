import java.util.Scanner;

public class BasicOperations {
    public static void main(String[] args) {
        
        System.out.println("Calculator App");

        Scanner scanner = new Scanner(System.in);
        
        double numb1 = scanner.nextDouble();
        //System.out.println("First number: " + numb1);

        double numb2 = scanner.nextDouble();
        //System.out.println("Second number: " + numb2);

        double sum = numb1 + numb2;
        System.out.println("Sum: " + sum);

        double difference = numb1 - numb2;
        System.out.println("Difference: " + difference);

        double product = numb1 * numb2;
        System.out.println("Product: " + product);

        double quotient = numb1 / numb2;
        System.out.println("Quotient: " + quotient);

        scanner.close();
    }
}
