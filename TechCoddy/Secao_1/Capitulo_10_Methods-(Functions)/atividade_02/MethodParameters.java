import java.util.Scanner;

public class MethodParameters {
    // Method declaration
    
    public static void multiplication(int number1, int number2){
        int result = number1 * number2;
        System.out.print(result);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // Call the method with a and b as arguments
        
        multiplication(a, b);
        
        scanner.close();
    }
}
