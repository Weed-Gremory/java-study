// Classe pai para notificações genéricas
class Notification {
    private String message;

    public Notification (String receivedMessage){
        message = receivedMessage;
    }

    public String getMessage (){
        return message;
    }

    public void send (){
        System.out.printf("Sending notification: %s\n", message);
    }
    // TODO: Adicionar campo privado para message
    
    // TODO: Criar construtor que aceita a message
    
    // TODO: Criar o método getMessage() que retorna a message
    
    // TODO: Criar o método send() que imprime: Sending notification: [message]
}
