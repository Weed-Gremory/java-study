// Classe base para todas as notificações
class Notification {

    private String recipient;

    public Notification (String receivedRecipient){
        recipient = receivedRecipient;
    }

    public String getRecipient (){
        return recipient;
    }

    public void send (){
        System.out.printf("Sending notification to %s\n", recipient);
    }
    // TODO: Adicione o campo recipient (String)
    
    // TODO: Crie um construtor que inicialize o recipient
    
    // TODO: Crie um método getter para recipient
    
    // TODO: Crie um método send() que imprima:
    // "Sending notification to [recipient]"
}
