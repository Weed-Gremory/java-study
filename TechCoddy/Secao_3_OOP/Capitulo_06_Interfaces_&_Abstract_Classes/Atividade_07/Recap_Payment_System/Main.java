import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler entradas
        String cardNumber = scanner.nextLine();  // Últimos 4 dígitos
        String email = scanner.nextLine();       // E-mail do PayPal
        double amount = scanner.nextDouble();    // Valor do pagamento

        PaymentProcessor pr1 = new PaymentProcessor();
        CreditCard c1 = new CreditCard(cardNumber);
        PayPal p1 = new PayPal(email);

        System.out.println(pr1.processPayment(c1, amount));
        System.out.println(pr1.processPayment(p1, amount));

        scanner.close();
        
        // TODO: Criar um PaymentProcessor
        
        // TODO: Criar um CreditCard com o cardNumber
        
        // TODO: Criar uma conta PayPal com o email
        
        // TODO: Processar o pagamento com CreditCard e imprimir o resultado
        
        // TODO: Processar o pagamento com PayPal e imprimir o resultado
    }
}
