// TODO: Criar a classe EmailMessenger que implementa Messenger
// 1. Adicione um campo String chamado 'recipient'
// 2. Crie um construtor que inicialize o recipient
// 3. Implemente sendMessage() para imprimir: "Email to [recipient]: [message]"
// 4. Esta classe usa o método padrão sendWithTimestamp() como está (nenhuma sobrescrita é necessária)

class EmailMessenger implements Messenger {

    private String recipient;

    public EmailMessenger (String receivedRecipient){
        recipient = receivedRecipient;
    }

    @Override
    public void sendMessage(String message){
        System.out.printf("Email to %s: %s\n", recipient, message);
    }
    // TODO: Adicionar o campo recipient
    
    // TODO: Criar o construtor
    
    // TODO: Implementar o método sendMessage
}
