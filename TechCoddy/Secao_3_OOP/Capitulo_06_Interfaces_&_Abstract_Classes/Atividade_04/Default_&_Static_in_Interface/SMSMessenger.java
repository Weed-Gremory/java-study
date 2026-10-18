// TODO: Criar a classe SMSMessenger que implementa Messenger
// 1. Adicione um campo String chamado 'phoneNumber'
// 2. Crie um construtor que inicialize o número de telefone
// 3. Implemente sendMessage() para imprimir: "SMS to [phoneNumber]: [message]"
// 4. Sobrescreva sendWithTimestamp() para imprimir: "[URGENT] " e então chamar sendMessage(message)

class SMSMessenger implements Messenger {

    private String phoneNumber;

    public SMSMessenger (String receivedPhoneNumber){
        phoneNumber = receivedPhoneNumber;
    }

    @Override
    public void sendMessage(String message){
        System.out.printf("SMS to %s: %s", phoneNumber, message);
    }

    @Override
    public void sendWithTimestamp(String message){
        System.out.print("[URGENT] ");
        sendMessage(message);
    }
    // TODO: Adicionar o campo phoneNumber
    
    // TODO: Criar o construtor
    
    // TODO: Implementar o método sendMessage
    
    // TODO: Sobrescrever o método sendWithTimestamp com comportamento personalizado
}
