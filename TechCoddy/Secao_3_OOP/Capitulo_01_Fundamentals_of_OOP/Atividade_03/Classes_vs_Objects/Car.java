public class Car {
    // TODO: Create String field 'brand'
    // TODO: Create int field 'year'

    String brand;
    int year;

    public Car(String receiveBrand, int receiveYear){
        brand = receiveBrand;
        year = receiveYear;
    }

    public String getInfo(){
        return String.format("%s (%d)", brand, year);
    }
    
    // TODO: Create a constructor that takes brand and year and assigns them
    
    // TODO: Create a method getInfo() that returns: "<brand> (<year>)"
}