// Classe Motorcycle que estende Vehicle
class Motorcycle extends Vehicle {

    private boolean hasSidecar;

    public Motorcycle (String receivedModel, boolean receivedHasSidecar){
        super(receivedModel);
        hasSidecar = receivedHasSidecar;
    }

    public void checkSidecar (){
        if (hasSidecar){
            System.out.printf("%s has a sidecar", getModel());
        } else {
            System.out.printf("%s has no sidecar", getModel());
        }
    }
    // TODO: Declare o campo hasSidecar (boolean)
    
    // TODO: Crie um construtor que receba model e hasSidecar
    // Lembre-se de usar super() para a inicialização do pai
    
    // TODO: Crie um método checkSidecar() que imprima:
    // "[model] has a sidecar" se hasSidecar for true
    // "[model] has no sidecar" se hasSidecar for false
}
