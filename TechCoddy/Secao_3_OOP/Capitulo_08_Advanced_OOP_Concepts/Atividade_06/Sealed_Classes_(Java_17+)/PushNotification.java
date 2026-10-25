final class PushNotification extends Notification {
    private String deviceId;

    public PushNotification (String receivedMessage, String receivedDeviceId){
        super(receivedMessage);

        deviceId = receivedDeviceId;
    }

    @Override
    public String deliver (){
        return "Sending push to device " + deviceId + ": " + getMessage();
    }
}

// TODO: Crie uma classe final PushNotification que estende Notification
// - Use a palavra-chave 'final' já que esta é uma subclasse permitida
// - Adicione um campo privado 'deviceId' (String)
// - Adicione um construtor que recebe message e deviceId
//   (chame super(message) para inicializar o pai)
// - Implement deliver() to return: "Sending push to device [deviceId]: [message]"

