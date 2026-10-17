// Classe Car que estende Vehicle
class Car extends Vehicle {

    private int numDoors;

    public Car (String receivedModel, int receivedNumDoors){
        super(receivedModel);
        numDoors = receivedNumDoors;
    }

    public void checkDoors (){
        System.out.printf("%s has %d doors\n", getModel(), numDoors);
    }
    // TODO: Declare o campo numDoors (int)
    
    // TODO: Crie um construtor que receba model e numDoors
    // Lembre-se de usar super() para a inicialização da classe pai
    
    // TODO: Crie um método checkDoors() que imprima: [model] tem [numDoors] portas
}
