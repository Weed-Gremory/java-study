package TechCoddy.Secao_3_OOP.Capitulo_04_Inheritance.Atividade_07.Why_No_Multi_Class_Inherit;

public class SmartSpeaker {

}
// SmartSpeaker estende MusicPlayer - cadeia de herança multinível
// AudioDevice -> MusicPlayer -> SmartSpeaker
public class SmartSpeaker extends MusicPlayer {

    private String assistantName;

    public SmartSpeaker (String receivedDeviceName, String receivedAssistantName){
        super(receivedDeviceName);
        assistantName = receivedAssistantName;
    }

    public void voiceCommand (String command){
        System.out.printf("%s: Processing \"%s\"\n", assistantName, command);
    }

    public void getFullInfo (){
        System.out.printf("%s with %s assistant\n", getDeviceName(), assistantName);
    }
    // TODO: Adicione um campo privado para assistantName (String)
    
    // TODO: Crie um construtor que receba o nome do dispositivo e o nome do assistente
    //       Use super(deviceName) para chamar o construtor pai
    
    // TODO: Crie o método voiceCommand(String command)
    //       Imprima: [assistantName]: Processing "[command]"
    
    // TODO: Crie o método getFullInfo()
    //       Imprima: [deviceName] com o assistente [assistantName]
}
