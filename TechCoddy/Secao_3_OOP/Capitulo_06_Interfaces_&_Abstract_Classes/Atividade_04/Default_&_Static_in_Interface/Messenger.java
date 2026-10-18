// TODO: Definir a interface Messenger
// 1. Declarar um método abstrato: void sendMessage(String message)
// 2. Adicionar um método default: sendWithTimestamp(String message)
//    - Deve imprimir "[TIMESTAMP] " e depois chamar sendMessage(message)
// 3. Adicionar um método estático: String formatMessage(String message)
//    - Deve retornar a mensagem convertida para letras maiúsculas

interface Messenger {

    void sendMessage(String message);

    default void sendWithTimestamp(String message){
        System.out.print("[TIMESTAMP] ");
        sendMessage(message);
    }

    static String formatMessage(String message){
        return message.toUpperCase();
    }
    // TODO: Declarar o método abstrato sendMessage
    
    // TODO: Adicionar o método default sendWithTimestamp
    
    // TODO: Adicionar o método estático formatMessage
}
