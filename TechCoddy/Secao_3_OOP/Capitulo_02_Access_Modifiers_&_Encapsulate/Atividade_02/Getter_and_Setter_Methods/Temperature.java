class Temperature {

    private double celsius;
    private boolean valid;

    public double getCelsius (){
        return celsius;
    }

    public void setCelsius (double receivedCelsius){
        if (receivedCelsius >= -273.15){
            valid = true;
            celsius = receivedCelsius;
        } else {
            valid = false;
        }
    }

    public boolean isValid (){
        return valid;
    }

    public double getFahrenheit (){
        return (celsius * 9/5) + 32;
    }
    
    // TODO: Declare private field for celsius (double)
    
    // TODO: Declare private field for valid (boolean)
    
    // TODO: Implement getCelsius() getter
    
    // TODO: Implement setCelsius() setter
    // - Only accept values at or above absolute zero (-273.15)
    // - If valid, set celsius and set valid to true
    // - If invalid, don't change celsius and set valid to false
    
    // TODO: Implement isValid() getter (boolean getters use "is" prefix)
    
    // TODO: Implement getFahrenheit() getter
    // - Convert celsius to Fahrenheit using: (celsius * 9/5) + 32
}
