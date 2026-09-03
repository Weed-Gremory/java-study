import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wind = scanner.nextInt(); // Don't change this line
        String status = "unset";
        // Type your code below
        
        if (wind < 8) {
            status = "Calm";
        } else if (wind >= 8 && wind <= 31){
            status = "Breeze";
        } else if (wind >= 32 && wind <= 63){
            status = "Gale";
        } else {
            status = "Storm";
        }
        
        // Don't change the line below
        System.out.println("status = " + status);
        scanner.close(); // Closing the scanner after use
    }
}
