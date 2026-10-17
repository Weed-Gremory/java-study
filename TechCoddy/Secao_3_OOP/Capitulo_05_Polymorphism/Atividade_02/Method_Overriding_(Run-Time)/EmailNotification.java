// Classe de notificação por e-mail que estende Notification
class EmailNotification extends Notification {

    private String subject;

    public EmailNotification (String receivedRecipient, String receivedSubject){
        super(receivedRecipient);
        subject = receivedSubject;
    }

    @Override
    public void send (){
        System.out.printf("Emailing %s: %s\n", getRecipient(), subject);
    }

    
    // TODO: Adicione o campo subject (String)
    
    // TODO: Crie um construtor que receba recipient e subject
    // Use super() para inicializar a classe pai
    
    // TODO: Sobrescreva o método send() para imprimir:
    // "Emailing [recipient]: [subject]"
}
