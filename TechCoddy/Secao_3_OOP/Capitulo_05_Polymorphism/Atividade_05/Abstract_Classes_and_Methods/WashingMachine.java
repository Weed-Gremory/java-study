// Classe concreta que estende Appliance
class WashingMachine extends Appliance {

    private int capacity;

    public WashingMachine (String receivedBrand, int receivedWattage, int receivedCapacity){
        super(receivedBrand, receivedWattage);
        capacity = receivedCapacity;
    }

    @Override
    public void operate (){
        System.out.printf("%s washing machine is washing %dkg of clothes\n", getBrand(), capacity);
    }
    // TODO: Declare um campo privado para capacity (int) representando o tamanho da carga em kg
    
    // TODO: Crie um construtor que recebe brand, wattage e capacity
    // Use super() para inicializar os campos da classe pai
    
    // TODO: Implemente o método operate() para imprimir:
    // "[brand] washing machine is washing [capacity]kg of clothes"
}
