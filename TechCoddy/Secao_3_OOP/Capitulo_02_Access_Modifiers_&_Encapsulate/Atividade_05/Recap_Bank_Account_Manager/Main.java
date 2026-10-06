import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read inputs
        String accountNumber = scanner.nextLine();
        String ownerName = scanner.nextLine();
        double depositAmount = scanner.nextDouble();
        double withdrawAmount1 = scanner.nextDouble();
        double withdrawAmount2 = scanner.nextDouble();

        BankAccount account1 = new BankAccount(accountNumber, ownerName);

        System.out.printf("Deposit: %b\nWithdraw 1: %b\nWithdraw 2: %b\n%s", account1.deposit(depositAmount), account1.withdraw(withdrawAmount1), account1.withdraw(withdrawAmount2), account1.getAccountSummary());

        scanner.close();
        
        // TODO: Create a BankAccount object with accountNumber and ownerName
        
        // TODO: Perform deposit and print result as "Deposit: true" or "Deposit: false"
        
        // TODO: Perform first withdrawal and print result as "Withdraw 1: true" or "Withdraw 1: false"
        
        // TODO: Perform second withdrawal and print result as "Withdraw 2: true" or "Withdraw 2: false"
        
        // TODO: Print the account summary
    }
}
