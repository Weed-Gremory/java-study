import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt(); // Don't change this line
        int height = scanner.nextInt(); // Don't change this line
        boolean hasAdult = scanner.nextBoolean(); // Don't change this line

        // Write your code below
        
        if (age >= 12){
            if (height > 150){
                if (age < 15){
                    if (hasAdult == true){
                        System.out.println("You can ride with adult supervision!");
                    } else {
                        System.out.println("Sorry, you need an adult with you");
                    }
                } else {
                    System.out.println("You can ride by yourself!");
                }
            } else {
                System.out.println("Sorry, you're not tall enough");
            }
        } else {
            System.out.println("Sorry, you're too young");
        }

        scanner.close();
    }
}
