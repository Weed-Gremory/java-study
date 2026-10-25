import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler entradas
        String customerName = scanner.nextLine();
        String sizeName = scanner.nextLine();
        CoffeeSize size = CoffeeSize.valueOf(sizeName);

        Order order = new Order(customerName, size);

        System.out.println(order.getReceipt());
        System.out.println();

        for (CoffeeSize c : CoffeeSize.values()) {
            System.out.println(c.getDescription());
        }

        scanner.close();
        
        // TODO: Converta sizeName para o enum CoffeeSize usando valueOf()
        
        // TODO: Crie um Order com o nome do cliente e o tamanho
        
        // TODO: Imprima o recibo
        
        // TODO: Imprima uma linha vazia
        
        // TODO: Exiba o menu completo iterando por todos os valores de CoffeeSize
        // Dica: Use CoffeeSize.values() para obter todas as constantes do enum
        
    }
}
