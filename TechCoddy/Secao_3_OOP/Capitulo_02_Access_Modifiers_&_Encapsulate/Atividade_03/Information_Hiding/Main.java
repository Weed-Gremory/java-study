import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the password to set
        String passwordToSet = scanner.nextLine();
        // Read the password attempt to check
        String passwordAttempt = scanner.nextLine();

        Password p1 = new Password(6);


        System.out.printf("Set: %b\nMasked: %s\nMatch: %b", p1.setPassword(passwordToSet), p1.getMaskedPassword(), p1.checkPassword(passwordAttempt));

        scanner.close();
        
        // TODO: Create a Password object with minimum length of 6
        
        // TODO: Set the password and print the result ("Set: true" or "Set: false")
        
        // TODO: Print the masked password ("Masked: ******")
        
        // TODO: Check the password attempt and print the result ("Match: true" or "Match: false")
        
    }
}
