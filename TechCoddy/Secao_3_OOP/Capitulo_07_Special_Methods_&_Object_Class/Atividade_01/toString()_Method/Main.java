import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        String name = scanner.nextLine();
        double price = scanner.nextDouble();
        int quantity = scanner.nextInt();

        Product p1 = new Product(name, price, quantity);

        System.out.println(p1);

        scanner.close();
        
        // TODO: Criar um objeto Product com os valores de entrada
        
        // TODO: Imprimir o objeto product diretamente
        // (Isso chamará automaticamente o seu método toString()!)
    }
}
