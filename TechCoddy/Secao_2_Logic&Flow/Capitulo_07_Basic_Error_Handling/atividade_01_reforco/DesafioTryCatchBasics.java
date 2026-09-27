import java.util.Scanner;

public class DesafioTryCatchBasics {
    public static String multiplyNumbers(String num1, String num2, int index) {
        // Write your code here using try-catch

        int[] result = new int[3];

        try {
            int number1 = Integer.parseInt(num1);
            int number2 = Integer.parseInt(num2);
            
            result[index] = number1 * number2;
            
            return String.valueOf(result[index]);
        } catch (NumberFormatException e){
            return "Error: Invalid number format";
        } catch (ArrayIndexOutOfBoundsException e){
            return "Error: Invalid array index";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();
        int index = Integer.parseInt(scanner.nextLine());

        System.out.println(multiplyNumbers(num1, num2, index));

        scanner.close();
    }
}
