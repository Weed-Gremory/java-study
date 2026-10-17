import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler as entradas
        String deviceName = scanner.nextLine();
        String assistantName = scanner.nextLine();
        String songName = scanner.nextLine();

        SmartSpeaker s1 = new SmartSpeaker(deviceName, assistantName);

        s1.setSong(songName);
        s1.getFullInfo();
        s1.playSound();
        s1.voiceCommand("skip to next");

        scanner.close();
        
        // TODO: Criar um SmartSpeaker com deviceName e assistantName
        
        // TODO: Definir a música usando setSong()
        
        // TODO: Chamar getFullInfo()
        
        // TODO: Chamar playSound()
        
        // TODO: Chamar voiceCommand("skip to next")
    }
}
