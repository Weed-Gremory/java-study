import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brand = scanner.nextLine();

        Motorcycle m = new Motorcycle(brand);

        m.start();
        m.wheelie();
        
        // TODO: Crie um objeto Motorcycle com a brand
        
        // TODO: Chame o método start() herdado
        
        // TODO: Chame o método wheelie()

        scanner.close();
    }
}
