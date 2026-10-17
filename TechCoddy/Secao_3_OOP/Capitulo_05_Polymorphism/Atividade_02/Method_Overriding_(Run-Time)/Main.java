import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        String recipient = scanner.nextLine();
        String subject = scanner.nextLine();
        String phoneNumber = scanner.nextLine();

        Notification[] n1 = {new Notification(recipient), new EmailNotification(recipient, subject), new SMSNotification(recipient, phoneNumber)};
        
        for (Notification message : n1){
            message.send();
        }

        scanner.close();
        // TODO: Criar um array de referências Notification com 3 elementos
        // O array deve conter (nesta ordem):
        // 1. Um objeto Notification base
        // 2. Um objeto EmailNotification
        // 3. Um objeto SMSNotification
        // Todos usando o mesmo recipient
        
        // TODO: Percorrer o array e chamar send() em cada elemento
        // Isso demonstra o polimorfismo em tempo de execução!
    }
}
