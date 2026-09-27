import java.util.Scanner;

public class DesafioGuardClauses {
    public static String validateUsername(String username) {
        // Write your code here using guard clauses

        if (username == null) return "Username cannot be null";
        if (username.isEmpty()) return "Username cannot be empty";
        if (username.length() < 5 || username.length() > 15) return "Username must be between 5 and 15 characters";
        if (!Character.isLetter(username.charAt(0))) return "Username must start with a letter";
        if (!username.matches("[a-zA-Z0-9]+")) return "Username cannot contain special characters";

        return "Valid username";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        if (username.equals("null")) {
            username = null;
        }
        System.out.println(validateUsername(username));

        scanner.close();
    }
}
