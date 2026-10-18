import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        String emailRecipient = scanner.nextLine();
        String phoneNumber = scanner.nextLine();
        String message = scanner.nextLine();

        String formattedMessage = Messenger.formatMessage(message);

        EmailMessenger em1 = new EmailMessenger(emailRecipient);
        SMSMessenger sm1 = new SMSMessenger(phoneNumber);

        em1.sendWithTimestamp(formattedMessage);
        sm1.sendWithTimestamp(formattedMessage);

        scanner.close();
        
        // TODO: Use Messenger.formatMessage() para formatar a mensagem e armazená-la
        
        // TODO: Crie um EmailMessenger com o destinatário do e-mail
        
        // TODO: Crie um SMSMessenger com o número de telefone
        
        // TODO: Chame sendWithTimestamp() no EmailMessenger com a mensagem formatada
        
        // TODO: Chame sendWithTimestamp() no SMSMessenger com a mensagem formatada
    }
}
