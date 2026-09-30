public class BankAccount {

    private String accountName;
    private double balance;

    public BankAccount (String accountNameReceived, double initialBalance){
        accountName = accountNameReceived;
        balance = initialBalance;
    }

    public String getAccountName (){
        return accountName;
    }

    public double getBalance (){
        return balance;
    }

    public void deposit (double depositReceived){
        if (depositReceived > 0){
            balance += depositReceived;
        }
    }

    public String withdraw (double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            
            return "Success";
        } else {
            return "Insufficient funds";
        }
    }
    // TODO: Create a private String field 'accountName'
    // TODO: Create a private double field 'balance'
    
    // TODO: Create a constructor that takes accountName and initialBalance
    // Assign them using 'this'
    
    // TODO: Create a getter getAccountName() that returns accountName
    
    // TODO: Create a getter getBalance() that returns balance
    
    // TODO: Create a deposit(double amount) method
    // Add amount to balance if amount > 0
    
    // TODO: Create a withdraw(double amount) method that returns a String
    // If amount > 0 and amount <= balance, subtract and return "Success"
    // Otherwise return "Insufficient funds"
}