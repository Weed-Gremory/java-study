import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code below
        
        double numb = scanner.nextDouble();

        while (numb >= 3.5){
            numb = numb / 2;
        }
        System.out.printf("" + numb);
        scanner.close();
    }
}
