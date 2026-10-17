import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        String brand1 = scanner.nextLine();
        int wattage1 = scanner.nextInt();
        int capacity = scanner.nextInt();
        scanner.nextLine(); // consumir a quebra de linha
        String brand2 = scanner.nextLine();
        int power = scanner.nextInt();

        Appliance[] a1 = {new WashingMachine(brand1, wattage1, capacity), new Microwave(brand2, wattage1, power)};

        for (Appliance a2 : a1){
            System.out.println(a2.getInfo());
            a2.operate();
        }

        scanner.close();
        
        // TODO: Criar um objeto WashingMachine com brand1, wattage1 e capacity
        
        // TODO: Criar um objeto Microwave com brand2, wattage1 (ou a potência apropriada) e power
        
        // TODO: Criar um array de referências Appliance e armazenar ambos os objetos
        
        // TODO: Percorrer o array e para cada eletrodoméstico:
        // - Imprimir suas informações usando getInfo()
        // - Chamar operate()
    }
}
