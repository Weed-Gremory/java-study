import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        String message = scanner.nextLine();
        String recipient = scanner.nextLine();

        Notification m1 = new Notification(message);
        EmailNotification r1 = new EmailNotification(message, recipient);

        m1.send();
        r1.send();

        scanner.close();
        
        // TODO: Criar um objeto Notification com a mensagem
        
        // TODO: Criar um objeto EmailNotification com a mensagem e o destinatário
        
        // TODO: Chamar send() no objeto Notification
        
        // TODO: Chamar send() no objeto EmailNotification
    }
}
