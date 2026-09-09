import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int lines = (n + 1) / 2;

        if (n % 2 != 0 && n >= 1 && n <= 1000){
            for(int i = 0; i < lines; i++){
                String pyramid = new String(new char[2 * i + 1]).replace("\0", "*");
                System.out.println(pyramid);
            }
        }

        scanner.close();
    }
}
