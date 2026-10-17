// Classe pai que representa qualquer eletrodoméstico
class Appliance {

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
        return String.format("%s - %dW", brand, wattage);
    }
    // TODO: Declare campos privados para brand (String) e wattage (int)
    
    // TODO: Crie um construtor que aceite brand e wattage e os inicialize
    
    // TODO: Crie o método getBrand() que retorna a marca (brand)
    
    // TODO: Crie o método getWattage() que retorna a potência (wattage)
    
    // TODO: Crie o método getInfo() que retorna: "[brand] - [wattage]W"
}
