import java.util.Scanner;

public class RecapIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Don't change this line
        int n1 = scanner.nextInt(); // Don't change this line
        int n2 = scanner.nextInt(); // Don't change this line
        scanner.nextLine(); // Don't change this line
        String op = scanner.nextLine(); // Don't change this line
        
        // Write your code below
        double result = 0;
        
        if (op.equals("+")){
            result = n1 + n2;
        } else if (op.equals("-")){
            result = n1 - n2;
        } else if (op.equals("/")){
            result = n1 / n2;
        } else if (op.equals("*")){
            result = n1 * n2;
        }
        
        
        System.out.println(result);
        scanner.close();
    }
}
