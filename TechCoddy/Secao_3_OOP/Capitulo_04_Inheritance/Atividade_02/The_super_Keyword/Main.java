import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        String brand = scanner.nextLine();
        int wattage = scanner.nextInt();
        int capacity = scanner.nextInt();

        WashingMachine a1 = new WashingMachine(brand, wattage, capacity);

        System.out.printf("%s", a1.getInfo());

        scanner.close();
        
        // TODO: Criar um objeto WashingMachine com os valores de entrada
        
        // TODO: Imprimir o resultado da chamada de getInfo() na máquina de lavar
    }
}
