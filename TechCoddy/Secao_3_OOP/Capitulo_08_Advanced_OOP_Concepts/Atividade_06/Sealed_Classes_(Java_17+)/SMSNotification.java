non-sealed class SMSNotification extends Notification {
    private String phoneNumber;

    public SMSNotification (String receivedMessage, String receivedPhoneNumber){
        super(receivedMessage);

        phoneNumber = receivedPhoneNumber;
    }

    @Override
    public String deliver (){
        return "Sending SMS to " + phoneNumber + ": " + getMessage();
    }
}

// TODO: Crie uma classe non-sealed SMSNotification que estende Notification
// - Use a palavra-chave 'non-sealed' para permitir extensão futura
// - Adicione um campo privado 'phoneNumber' (String)
// - Adicione um construtor que recebe message e phoneNumber
//   (chame super(message) para inicializar o pai)
// - Implement deliver() to return: "Sending SMS to [phoneNumber]: [message]"

