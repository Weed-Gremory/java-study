// Classe concreta que estende Appliance
class Microwave extends Appliance {

    private int power;

    public Microwave (String receivedBrand, int receivedWattage, int receivedPower){
        super(receivedBrand, receivedWattage);
        power = receivedPower;
    }

    @Override
    public void operate (){
        System.out.printf("%s microwave is heating at %d%% power\n", getBrand(), power);
    }
    // TODO: Declare um campo privado para power (int) representando a porcentagem do nível de potência
    
    // TODO: Crie um construtor que receba brand, wattage e power
    // Use super() para inicializar os campos da classe pai
    
    // TODO: Implemente o método operate() para imprimir:
    // "[brand] microwave is heating at [power]% power"
}
