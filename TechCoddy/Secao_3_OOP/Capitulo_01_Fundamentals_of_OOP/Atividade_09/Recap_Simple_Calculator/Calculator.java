public class Calculator {

    private String name;
    private double memory;
    private int operationCount;

    public Calculator (String receivedName){
        name = receivedName;
        memory = 0;
        operationCount = 0;
    }

    public Calculator (){
        this("Default");
    }

    public double getMemory (){
        return memory;
    }

    public int getOperationCount (){
        return operationCount;
    }

    public String getName (){
        return name;
    }

    public double add (double numb1, double numb2){
        memory = numb1 + numb2;
        operationCount++;
        return memory;
    }

    public double subtract (double numb1, double numb2){
        operationCount++;
        return numb1 - numb2;
    }

    public double multiply (double numb1, double numb2){
        operationCount++;
        return numb1 * numb2;
    }

    public double divide (double numb1, double numb2){
        operationCount++;

        if (numb2 == 0){
            return 0;
        }
        
        return numb1 / numb2;
    }

    public double power (double numb1, double numb2){
        operationCount++;
        return Math.pow(numb1, numb2);
    }
    // TODO: Create private fields:
    // - name (String)
    // - memory (double)
    // - operationCount (int)
    
    // TODO: Create a constructor with name parameter
    // Set name, memory = 0, operationCount = 0
    // Use 'this' keyword
    
    // TODO: Create a default constructor
    // Chain to the other constructor with name = "Default"
    
    // TODO: Create getters: getName(), getMemory(), getOperationCount()
    
    // TODO: Create add(double a, double b) - returns sum
    // Store result in memory, increment operationCount
    
    // TODO: Create subtract(double a, double b) - returns difference
    // Increment operationCount
    
    // TODO: Create multiply(double a, double b) - returns product
    // Increment operationCount
    
    // TODO: Create divide(double a, double b) - returns quotient
    // Return 0 if b is 0, increment operationCount
    
    // TODO: Create power(double base, double exponent) - returns base^exponent
    // Use Math.pow(), increment operationCount
}