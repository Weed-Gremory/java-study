import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        String brand = scanner.nextLine();
        int wheels = scanner.nextInt();
        scanner.nextLine(); // consome a quebra de linha
        String model = scanner.nextLine();

        Car c1 = new Car(brand, wheels, model);

        c1.move();
        c1.honk();
        c1.displayInfo();

        scanner.close();
        
        // TODO: Criar um objeto Car com os valores de entrada
        
        // TODO: Chamar move() - herdado de Vehicle (avô)
        
        // TODO: Chamar honk() - herdado de LandVehicle (pai)
        
        // TODO: Chamar displayInfo() - definido no próprio Car
    }
}
