import java.util.Scanner;

public class ReturnTypes {
    public static double bigger(double arg1, double arg2) {
        // Complete the method
        if (arg1 >= arg2){
            return arg1;
        } else {
            return arg2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();        
        
        for (int i = 0; i < iterations; i++) {
            // Write your code below            
            
            double maiorNum = bigger(num1, num2);
            
            if (num1 < 2 || num2 < 2){
                break;
            }

            if (maiorNum == num1){
              maiorNum = maiorNum / 2;
              num1 = maiorNum;
            } else {
                maiorNum = maiorNum / 2;
                num2 = maiorNum;
            }
            

            System.out.println(maiorNum);

        }
        
        scanner.close();
    }
}
