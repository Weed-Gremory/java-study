import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        String name = scanner.nextLine();
        int year = scanner.nextInt();
        scanner.nextLine(); // consumir a quebra de linha
        String brand = scanner.nextLine();

        Gadget item1G = new Gadget(name, year);
        Smartphone item1S = new Smartphone(name, year, brand);

        System.out.printf("%s\n%b\n%s", item1G.getClass().getSimpleName(), item1G.toString().contains("@"), item1S.toString());

        scanner.close();
        
        // TODO: Criar um objeto Gadget com name e year
        
        // TODO: Criar um objeto Smartphone com name, year, e brand
        
        // TODO: Imprimir o nome da classe do gadget usando getClass().getSimpleName()
        
        // TODO: Imprimir se o toString() do gadget contém "@" (true ou false)
        
        // TODO: Imprimir o smartphone (usa o toString() sobrescrito)
        
    }
}
