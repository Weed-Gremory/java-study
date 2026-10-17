import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler entradas
        String name = scanner.nextLine();
        double price = scanner.nextDouble();
        int warrantyYears = scanner.nextInt();

        Electronics item1 = new Electronics(name, price, warrantyYears);

        System.out.printf("%s", item1.getDetails());

        scanner.close();
        
        // TODO: Criar um objeto Electronics usando todos os três parâmetros
        
        // TODO: Imprimir o resultado de getDetails()
    }
}
