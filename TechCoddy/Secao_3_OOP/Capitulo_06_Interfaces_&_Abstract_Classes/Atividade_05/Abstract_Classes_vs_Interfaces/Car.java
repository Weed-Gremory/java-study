// Car estende Vehicle (relacionamento É-UM) e implementa Convertible (capacidade PODE-FAZER)
class Car extends Vehicle implements Convertible {

    private int numDoors;

    public Car (String receivedBrand, int receivedYear, int receivedNumDoors){
        super(receivedBrand, receivedYear);
    }

    @Override
    public String startEngine (){
        return String.format("%s car engine started", getBrand());
    }

    @Override
    public String openRoof (){
        return String.format("%s roof opening", getBrand());
    }

    @Override
    public String closeRoof(){
        return String.format("%s roof closing", getBrand());
    }
    // TODO: Declare o campo numDoors (int)
    
    // TODO: Crie um construtor que receba brand, year e numDoors
    // Use super() para inicializar os campos herdados
    
    // TODO: Implemente startEngine() para retornar: [brand] car engine started
    
    // TODO: Implemente openRoof() para retornar: [brand] roof opening
    
    // TODO: Implemente closeRoof() para retornar: [brand] roof closing
}
