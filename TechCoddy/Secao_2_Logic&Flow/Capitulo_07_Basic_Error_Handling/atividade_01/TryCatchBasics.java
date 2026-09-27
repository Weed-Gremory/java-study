import java.util.Scanner;

public class TryCatchBasics {
    public static String divideNumbers(String num1, String num2, int index) {
        // Write your code here

        int[] result = new int[2];

        try {
            int number1 = Integer.parseInt(num1);
            int number2 = Integer.parseInt(num2);
            
            result[index] = number1 / number2;
            
            return String.valueOf(result[index]);
        } catch (NumberFormatException e){
            return "Error: Invalid number format";
        } catch (ArithmeticException e){
            return "Error: Division by zero";
        } catch (ArrayIndexOutOfBoundsException e){
            return "Error: Invalid array index";
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();
        int index = Integer.parseInt(scanner.nextLine());
        
        System.out.println(divideNumbers(num1, num2, index));

        scanner.close();
    }
}
