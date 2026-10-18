// TODO: Crie uma classe Robot que implementa a interface Speaker

class Robot implements Speaker {

    private String model;

    public Robot (String receivedModel){
        model = receivedModel;
    }

    @Override
    public String speak (){
        return String.format("Robot %s says: Beep boop!", model);
    }
    // TODO: Adicione um campo privado para model (String)
    
    // TODO: Crie um construtor que recebe um parâmetro model
    
    // TODO: Implemente o método speak()
    // Ele deve retornar: "Robot [model] says: Beep boop!"
}
