// Classe filha que estende Appliance
class WashingMachine extends Appliance {

    private int capacity;

    public WashingMachine (String receivedBrand, int receivedWattage, int receivedCapacity){
        super (receivedBrand, receivedWattage);
        capacity = receivedCapacity;
    }

    public int getCapacity (){
        return capacity;
    }

    public String getInfo (){
        return String.format("%s, Capacity: %dkg", super.getInfo(), capacity);
    }
    // TODO: Declare um campo privado para capacity (int)
    
    // TODO: Crie um construtor que receba brand, wattage e capacity
    // Use super(brand, wattage) para chamar o construtor pai
    // Em seguida, inicialize o campo capacity
    
    // TODO: Crie o método getCapacity() que retorna a capacity
    
    // TODO: Sobrescreva o método getInfo()
    // Chame super.getInfo() para obter as informações do pai
    // Retorno: "[parent info], Capacity: [capacity]kg"
}
