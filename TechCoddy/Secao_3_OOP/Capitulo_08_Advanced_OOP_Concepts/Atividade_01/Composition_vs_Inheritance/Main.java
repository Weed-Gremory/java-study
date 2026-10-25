import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        String processorBrand = scanner.nextLine();
        double processorSpeed = Double.parseDouble(scanner.nextLine());
        String memoryType = scanner.nextLine();
        int memorySize = Integer.parseInt(scanner.nextLine());

        Processor p1 = new Processor(processorBrand, processorSpeed);
        Memory m1 = new Memory(memoryType, memorySize);
        Computer pc1 = new Computer(p1, m1);

        System.out.printf("%s\n%s", pc1.boot(), pc1.getSpecs());

        scanner.close();
        
        // TODO: Criar um Processor com a marca e velocidade
        
        // TODO: Criar uma Memory com o tipo e tamanho
        
        // TODO: Criar um Computer compondo o Processor e a Memory
        
        // TODO: Imprimir o resultado de boot()
        
        // TODO: Imprimir o resultado de getSpecs()
    }
}
