class Password {

    private String password;
    private int minLength;

    public Password (int receivedMinLength){
        minLength = receivedMinLength;
    }

    public boolean setPassword (String receivedPassword){
        if (receivedPassword.length() >= minLength){
            password = receivedPassword;
            return true;
        } else {
            password = "";
            return false;
        }
    }

    public String getMaskedPassword (){
        StringBuilder masked = new StringBuilder();

        for (int i = 0; i < password.length(); i++){
            masked.append("*");
        }

        return masked.toString();
    }

    public boolean checkPassword (String possiblePassword){
        if (possiblePassword.equals(password)){
            return true;
        } else {
            return false;
        }
    }

    public int getLength (){
        return password.length();
    }
    // TODO: Declare private field for storing the password
    
    // TODO: Declare private field for minimum length requirement
    
    // TODO: Create constructor that takes minimum length requirement
    
    // TODO: Create setPassword method that validates and sets the password
    // Return true if password meets minimum length, false otherwise
    
    // TODO: Create getMaskedPassword method that returns asterisks instead of actual password
    // Never expose the actual password!
    
    // TODO: Create checkPassword method that compares attempt with stored password
    
    // TODO: Create getLength method that returns password length (or 0 if not set)
    
}

