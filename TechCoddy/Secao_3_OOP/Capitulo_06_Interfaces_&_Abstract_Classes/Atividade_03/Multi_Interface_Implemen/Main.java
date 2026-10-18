import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        String brand = scanner.nextLine();
        int volumeLevel = scanner.nextInt();

        SmartTV s1 = new SmartTV(brand);

        s1.powerOn();
        s1.setVolume(volumeLevel);
        System.out.println("Current volume: " + s1.getVolume());
        s1.powerOff();

        scanner.close();
        
        // TODO: Criar uma SmartTV com a marca fornecida
        
        // TODO: Chamar powerOn()
        
        // TODO: Chamar setVolume() com o nível fornecido
        
        // TODO: Imprimir: Current volume: [volume] usando getVolume()
        
        // TODO: Chamar powerOff()
        
    }
}
