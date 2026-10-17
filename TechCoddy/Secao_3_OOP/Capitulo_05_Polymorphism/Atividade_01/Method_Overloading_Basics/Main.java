import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        String message = scanner.nextLine();
        int repeatCount = Integer.parseInt(scanner.nextLine());
        String prefix = scanner.nextLine();
        String suffix = scanner.nextLine();
        
        MessageFormatter f1 = new MessageFormatter();

        System.out.println(f1.format(message));
        System.out.println(f1.format(message, repeatCount));
        System.out.println(f1.format(message, prefix));
        System.out.println(f1.format(message, prefix, suffix));

        scanner.close();
        // TODO: Criar um objeto MessageFormatter
        
        // TODO: Chamar format apenas com message e imprimir o resultado
        
        // TODO: Chamar format com message e repeatCount e imprimir o resultado
        
        // TODO: Chamar format com message e prefix e imprimir o resultado
        
        // TODO: Chamar format com message, prefix, e suffix e imprimir o resultado
        
    }
}
