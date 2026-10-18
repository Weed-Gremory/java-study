// Motorcycle estende Vehicle, mas NÃO implementa Convertible
// (motocicletas não têm tetos para converter!)
class Motorcycle extends Vehicle {

    private boolean hasSidecar;

    public Motorcycle (String receivedBrand, int receivedYear, boolean receivedHasSidecar){
        super(receivedBrand, receivedYear);
        hasSidecar = receivedHasSidecar;
    }

    @Override
    public String startEngine (){
        return String.format("%s motorcycle engine roaring", getBrand());
    }
    // TODO: Declare o campo hasSidecar (boolean)
    
    // TODO: Crie um construtor que aceite brand, year e hasSidecar
    // Use super() para inicializar os campos herdados
    
    // TODO: Implemente startEngine() para retornar: [brand] motorcycle engine roaring
}
