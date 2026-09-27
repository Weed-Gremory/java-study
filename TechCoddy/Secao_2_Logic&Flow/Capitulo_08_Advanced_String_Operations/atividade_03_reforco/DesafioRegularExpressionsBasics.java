import java.util.Scanner;

public class DesafioRegularExpressionsBasics {
    public static String validatePassword(String password) {
        // Write your code here

        if (password == null) return "Invalid input";
        if (password.length() < 8) return "Too short";
        if (password.length() > 20) return "Too long";
        if (!password.matches(".*[A-Z].*")) return "No uppercase";
        if (!password.matches(".*[a-z].*")) return "No lowercase";
        if (!password.matches(".*[0-9].*")) return "No digit";
        if (!password.matches(".*[@#$%^&+=].*")) return "No special character";
        if (password.matches(".*\\s.*")) return "Contains space";

        return "Valid";
    }
    
    public static String getPasswordStrength(String password) {
        // Write your code here

        int numSpecial = password.replaceAll("[^@#$%^&+=]", "").length();
        String result = "";

        if (password.length() > 16 && numSpecial >= 3){
            result = "Strong";
        } else if (password.length() > 12 && numSpecial >= 2){
            result = "Medium";
        } else {
            result = "Weak";
        }

        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        
        if (password.equals("null")) password = null;
        
        String validation = validatePassword(password);
        System.out.println(validation);
        
        if (validation.equals("Valid")) {
            System.out.println(getPasswordStrength(password));
        }

        scanner.close();
    }
}
