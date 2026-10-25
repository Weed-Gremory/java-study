sealed abstract class Notification permits EmailNotification, SMSNotification, PushNotification {
    protected String message;

    public Notification (String receivedMessage){
        message = receivedMessage;
    }

    public String getMessage (){
        return message;
    }

    abstract String deliver ();
}

// TODO: Crie uma classe abstrata sealed Notification
// - Use a palavra-chave 'sealed' e 'permits' para permitir apenas:
//   EmailNotification, SMSNotification, PushNotification
// - Adicione um campo protected 'message' (String)
// - Adicione um construtor que inicializa a message
// - Adicione um método getter getMessage()
// - Adicione um método abstrato deliver() que retorna String

