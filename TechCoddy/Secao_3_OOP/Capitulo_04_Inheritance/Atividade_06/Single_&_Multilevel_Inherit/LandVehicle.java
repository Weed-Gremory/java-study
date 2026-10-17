// Classe de nível médio que estende Vehicle
public class LandVehicle extends Vehicle {

    private int wheels;

    public LandVehicle (String receivedBrand, int receivedWheels){
        super(receivedBrand);
        wheels = receivedWheels;
    }

    public int getWheels (){
        return wheels;
    }

    public void honk (){
        System.out.printf("%s honks!\n", getBrand());
    }
    // TODO: Adicionar campo privado para wheels (int)
    
    // TODO: Criar construtor que recebe brand e wheels
    // Lembre-se de usar super(brand) para a parte do pai
    
    // TODO: Criar o método getWheels() que retorna a contagem de rodas
    
    // TODO: Criar o método honk() que imprime: [brand] honks!
}
