import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leia as quatro entradas
        String message = scanner.nextLine();
        String email = scanner.nextLine();
        String phoneNumber = scanner.nextLine();
        String deviceId = scanner.nextLine();

        Notification[] n1 = {new EmailNotification(message, email), new SMSNotification(message, phoneNumber), new PushNotification(message, deviceId)};

        for (Notification n : n1){
            System.out.println(n.deliver());
        }

        scanner.close();
        
        // TODO: Crie um de cada tipo de notificação usando a mesma mensagem
        // - EmailNotification com message e email
        // - SMSNotification com message e phoneNumber
        // - PushNotification com message e deviceId
        
        // TODO: Armazene todas as três notificações em um array Notification[]
        // Isso demonstra polimorfismo com sealed classes
        
        // TODO: Itere pelo array e imprima o resultado de deliver()
        // para cada notificação
        
    }
}
