// Subclasse que estende Notification para comportamento específico de e-mail
class EmailNotification extends Notification {

    private String recipient;

    public EmailNotification (String receivedeMessage, String receivedRecipient){
        super(receivedeMessage);
        recipient = receivedRecipient;
    }

    @Override
    public void send (){
        System.out.printf("Emailing %s: %s\n", recipient, getMessage());
    }
    // TODO: Adicione um campo privado para o endereço de e-mail do destinatário
    
    // TODO: Crie um construtor que receba message e recipient
    // Hint: Use super(message) para chamar o construtor pai
    
    // TODO: Sobrescreva o método send() usando a anotação @Override
    // Deve imprimir: Emailing [recipient]: [message]
}
