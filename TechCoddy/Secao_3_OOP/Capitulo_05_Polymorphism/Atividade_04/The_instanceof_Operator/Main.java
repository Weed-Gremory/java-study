import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        String carModel = scanner.nextLine();
        int numDoors = Integer.parseInt(scanner.nextLine());
        String motorcycleModel = scanner.nextLine();
        boolean hasSidecar = Boolean.parseBoolean(scanner.nextLine());

        Vehicle[] v1 = {new Car(carModel, numDoors), new Motorcycle(motorcycleModel, hasSidecar)};

        for (Vehicle v2 : v1){

            v2.inspect();
            
            if (v2 instanceof Car c1){
                c1.checkDoors();
            } else if (v2 instanceof Motorcycle m1){
                m1.checkSidecar();
            }
        }

        scanner.close();
        
        // TODO: Criar um objeto Car com carModel e numDoors
        
        // TODO: Criar um objeto Motorcycle com motorcycleModel e hasSidecar
        
        // TODO: Criar um array de referências Vehicle contendo o Car e a Motorcycle
        
        // TODO: Percorrer o array e para cada veículo:
        // 1. Chamar o método inspect()
        // 2. Usar instanceof para verificar se é um Car, então fazer o downcast e chamar checkDoors()
        // 3. Usar instanceof para verificar se é uma Motorcycle, então fazer o downcast e chamar checkSidecar()
    }
}
