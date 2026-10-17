// Classe base para todos os veículos
class Vehicle {

    private String model;

    public Vehicle (String receivedModel){
        model = receivedModel;
    }

    public String getModel (){
        return model;
    }

    public void inspect (){
        System.out.println("Inspecting vehicle: " + model);
    }
    // TODO: Declare o campo model (String)
    
    // TODO: Crie um construtor que inicialize o model
    
    // TODO: Crie um método getter getModel()
    
    // TODO: Crie um método inspect() que imprima: Inspecting vehicle: [model]
}
