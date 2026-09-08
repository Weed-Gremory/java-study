import java.util.Scanner;

public class RecapValidationFunction {
    public static boolean is_valid(String username, String password) {
        // Write your code below
        
        if ((username.equals("user") && password.equals("qweasd")) || (username.equals("admin"))){
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        String pass = scanner.nextLine();
        boolean res = is_valid(user, pass);
        System.out.println(res);

        scanner.close();
    }
}
