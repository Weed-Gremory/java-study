// Classe de notificação por SMS que estende Notification
class SMSNotification extends Notification {

    private String phoneNumber;

    public SMSNotification (String receivedRecipient, String receivedPhoneNumber){
        super(receivedRecipient);
        phoneNumber = receivedPhoneNumber;
    }

    @Override
    public void send (){
        System.out.printf("Texting %s for %s\n", phoneNumber, getRecipient());
    }
    // TODO: Adicione o campo phoneNumber (String)
    
    // TODO: Crie um construtor que receba recipient e phoneNumber
    // Use super() para inicializar a classe pai
    
    // TODO: Sobrescreva o método send() para imprimir:
    // "Texting [phoneNumber] for [recipient]"
}
