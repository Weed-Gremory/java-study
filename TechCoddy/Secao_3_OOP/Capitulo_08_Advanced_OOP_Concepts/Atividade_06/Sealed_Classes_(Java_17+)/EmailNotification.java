final class EmailNotification extends Notification {
    private String recipient;

    public EmailNotification (String receivedMessage, String receivedRecipient){
        super(receivedMessage);

        recipient = receivedRecipient;
    }

    @Override
    public String deliver (){
        return "Sending email to " + recipient + ": " + getMessage();
    }
}

// TODO: Crie uma classe final EmailNotification que estende Notification
// - Use a palavra-chave 'final' já que esta é uma subclasse permitida
// - Adicione um campo privado 'recipient' (String) para o endereço de e-mail
// - Adicione um construtor que recebe message e recipient
//   (chame super(message) para inicializar a classe pai)
// - Implemente deliver() para retornar: "Sending email to [recipient]: [message]"

