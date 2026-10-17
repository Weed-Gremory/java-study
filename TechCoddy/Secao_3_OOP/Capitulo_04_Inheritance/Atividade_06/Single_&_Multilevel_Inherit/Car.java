// Classe de nível inferior que estende LandVehicle
public class Car extends LandVehicle {

    private String model;

    public Car (String receivedBrand, int receivedWheels, String receivedModel){
        super(receivedBrand, receivedWheels);
        model = receivedModel;
    }

    public String getModel (){
        return model;
    }

    public void displayInfo (){
        System.out.printf("%s %s with %d wheels\n", getBrand(), model, getWheels());
    }
    // TODO: Adicione um campo privado para model (String)
    
    // TODO: Crie um construtor que receba brand, wheels e model
    // Lembre-se de usar super(brand, wheels) para a parte do pai
    
    // TODO: Crie o método getModel() que retorna o model
    
    // TODO: Crie o método displayInfo() que imprime: [brand] [model] with [wheels] wheels
}
