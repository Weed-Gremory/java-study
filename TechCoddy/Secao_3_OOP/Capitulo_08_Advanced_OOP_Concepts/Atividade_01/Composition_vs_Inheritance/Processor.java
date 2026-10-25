public class Processor {

    private String brand;
    private double speedGHz;

    public Processor (String receivedBrand, double receivedSpeedGHz){
        brand = receivedBrand;
        speedGHz = receivedSpeedGHz;
    }

    public String getBrand (){
        return brand;
    }

    public double getSpeedGHz (){
        return speedGHz;
    }

    public String process (){
        return brand + " processing at " + speedGHz + " GHz";
    }
    // TODO: Declare campos privados: brand (String) e speedGHz (double)
    
    // TODO: Crie um construtor que inicialize ambos os campos
    
    // TODO: Crie métodos getter para brand e speedGHz
    
    // TODO: Crie um método process() que retorne:
    // "[brand] processing at [speedGHz] GHz"
}
