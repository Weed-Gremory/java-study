// TODO: Criar uma classe Human que implementa a interface Speaker

class Human implements Speaker {

    private String name;

    public Human (String receivedName){
        name = receivedName;
    }

    @Override
    public String speak (){
        return String.format("%s says: Hello everyone!", name);
    }
    // TODO: Adicionar um campo privado para name (String)
    
    // TODO: Criar um construtor que recebe um parâmetro name
    
    // TODO: Implementar o método speak()
    // Ele deve retornar: "[name] says: Hello everyone!"
}
