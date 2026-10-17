// Classe base para todos os dispositivos de reprodução de áudio
public class AudioDevice {

    private String deviceName;

    public AudioDevice (String receivedDeviceName){
        deviceName = receivedDeviceName;
    }

    public String getDeviceName (){
        return deviceName;
    }

    public void playSound (){
        System.out.printf("%s: Playing audio\n", deviceName);
    }
    // TODO: Adicione um campo privado para deviceName (String)
    
    // TODO: Crie um construtor que aceite o nome do dispositivo
    
    // TODO: Crie o método getDeviceName() que retorna o nome
    
    // TODO: Crie o método playSound() que imprime: [deviceName]: Reproduzindo áudio
}
