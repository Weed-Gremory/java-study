import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler entradas
        String customerName = scanner.nextLine();
        String itemName = scanner.nextLine();
        double itemPrice = scanner.nextDouble();
        
        double discount = 10.0;

        ShoppingCart client = new ShoppingCart(customerName);
        ShoppingCart.Item cart = client.new Item(itemName, itemPrice);

        System.out.println(client.checkout(cart, discount));

        scanner.close();
        
        // TODO: Criar um ShoppingCart com o nome do cliente
        
        // TODO: Criar um Item usando: cart.new Item(itemName, itemPrice)
        
        // TODO: Chamar checkout() com o item e o desconto, depois imprimir o resultado
        
    }
}
