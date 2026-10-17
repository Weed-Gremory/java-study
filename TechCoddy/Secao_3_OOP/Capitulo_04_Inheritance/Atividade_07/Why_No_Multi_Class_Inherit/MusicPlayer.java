// MusicPlayer extends AudioDevice - herança simples
public class MusicPlayer extends AudioDevice {

    private String currentSong;

    public MusicPlayer (String receivedDeviceName){
        super(receivedDeviceName);
    }

    public void setSong (String song){
        currentSong = song;
    }

    @Override
    public void playSound (){
        System.out.printf("%s: Now playing - %s\n", getDeviceName(), currentSong);
    }
    // TODO: Adicionar campo private para currentSong (String)
    
    // TODO: Criar construtor que recebe o nome do dispositivo e chama super(deviceName)
    
    // TODO: Criar o método setSong(String song) que define a música atual
    
    // TODO: Sobrescrever playSound() para imprimir: [deviceName]: Now playing - [currentSong]
}
