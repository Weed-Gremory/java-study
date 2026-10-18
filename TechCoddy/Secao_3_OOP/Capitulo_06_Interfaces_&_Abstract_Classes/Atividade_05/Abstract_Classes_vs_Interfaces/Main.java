import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        String carBrand = scanner.nextLine();
        int carYear = scanner.nextInt();
        scanner.nextLine(); // consumir a quebra de linha
        String motorcycleBrand = scanner.nextLine();
        int motorcycleYear = scanner.nextInt();

        Car c1 = new Car(carBrand, carYear, 4);
        Motorcycle m1 = new Motorcycle(motorcycleBrand, motorcycleYear, false);

        System.out.printf("%s\n%s\n%s\n%s\n%s\n%s", c1.getInfo(), m1.getInfo(), c1.startEngine(), m1.startEngine(), c1.openRoof(), c1.closeRoof());

        scanner.close();
        
        
        // TODO: Criar um Car com 4 portas
        
        // TODO: Criar uma Motorcycle sem sidecar (false)
        
        // TODO: Imprimir getInfo() para ambos os veículos (demonstra o comportamento compartilhado da classe abstrata)
        
        // TODO: Imprimir startEngine() para ambos os veículos (demonstra diferentes implementações)
        
        // TODO: Imprimir openRoof() e closeRoof() apenas para o carro (demonstra a capacidade da interface)
    }
}
