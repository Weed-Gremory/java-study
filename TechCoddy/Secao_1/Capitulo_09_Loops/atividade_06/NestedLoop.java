import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        // Write your code below

        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++){
                
                System.out.print("*");

            }

            System.out.println("");

            scanner.close();
        }
    }
}
