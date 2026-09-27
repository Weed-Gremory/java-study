import java.util.Scanner;

public class RegularExpressionsBasics {
    public static String validateInput(String text, String type) {
        // Write your code here

        if (text == null) return "Invalid input";
        if (!type.equals("number") && !type.equals("word") && !type.equals("email") && !type.equals("phone")) return "Invalid type";

        if (type.equals("number")) {
            if (text.matches("[0-9]+")){
                return "Valid";
            } else {
                return "Invalid";
            }
        }
        if (type.equals("word")){
            if (text.matches("[a-zA-Z]+")){
                return "Valid";
            } else {
                return "invalid";
            }
        }
        if (type.equals("email")){
            if (text.matches(".+@.+")){
                return "Valid";
            } else {
                return "Invalid";
            }
        }
        if (type.equals("phone")){
            if (text.matches("[0-9]{10}")){
                return "Valid";
            } else {
                return "Invalid";
            }
        }

        return "";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String type = scanner.nextLine();
        
        if (text.equals("null")) text = null;
        System.out.println(validateInput(text, type));

        scanner.close();
    }
}
