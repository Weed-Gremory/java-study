class BankAccount {

    private final String accountNumber;
    private double balance = 0.0;
    private String ownerName;

    public BankAccount (String accountNumberReceived, String ownerNameReceived){
        accountNumber = accountNumberReceived;
        ownerName = ownerNameReceived;
    }

    public String getAccountNumber (){
        return accountNumber; 
    }

    public String getOwnerName (){
        return ownerName;
    }

    public double getBalance (){
        return balance;
    }

    public boolean deposit (double amount){
        if (amount > 0){
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw (double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public String getAccountSummary (){
        return String.format("Account %s | Owner: %s | Balance: $%.2f", accountNumber, ownerName, balance);
    }
    // TODO: Declare an immutable (final) account number
    
    // TODO: Declare a private balance initialized to 0.0
    
    // TODO: Declare a private owner name
    
    // TODO: Create a constructor that takes accountNumber and ownerName
    
    // TODO: Create a getter for account number
    
    // TODO: Create a getter for owner name
    
    // TODO: Create a getter for balance
    
    // TODO: Create deposit method that returns true if amount is positive, false otherwise
    // Only add to balance if amount is positive
    
    // TODO: Create withdraw method that returns true if amount is positive AND sufficient funds exist
    // Only subtract from balance if conditions are met
    
    // TODO: Create getAccountSummary method
    // Return format: "Account [accountNumber] | Owner: [ownerName] | Balance: $[balance]"
    // Use String.format("%.2f", balance) for formatting balance to 2 decimal places
}
