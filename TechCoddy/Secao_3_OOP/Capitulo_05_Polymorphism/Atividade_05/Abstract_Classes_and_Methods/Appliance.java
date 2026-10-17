// Classe abstrata que serve como o modelo para todos os eletrodomésticos
abstract class Appliance {

    private String brand;
    private int wattage;

    public Appliance (String receivedBrand, int receivedWattage){
        brand = receivedBrand;
        wattage = receivedWattage;
    }

    public String getBrand (){
        return brand;
    }

    public int getWattage (){
        return wattage;
    }

    public String getInfo (){
        return brand + " - " + wattage + "W";
    }

    public abstract void operate ();
    // TODO: Declare campos protegidos para brand (String) e wattage (int)
    
    // TODO: Crie um construtor que inicialize ambos os campos
    
    // TODO: Crie métodos getter para brand e wattage
    
    // TODO: Crie um método getInfo() que retorna: "[brand] - [wattage]W"
    
    // TODO: Declare um método abstrato operate() que as subclasses devem implementar
}
