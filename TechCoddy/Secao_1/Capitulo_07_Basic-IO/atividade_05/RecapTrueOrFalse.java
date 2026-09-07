import java.util.Scanner;

public class RecapTrueOrFalse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code below

        String numb = scanner.nextLine();

        if (numb.equals("1")){
            System.out.printf("T");
        } else {
        System.out.printf("F");
        }

        scanner.close();
    }
}
