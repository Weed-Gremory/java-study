public class Memory {

    private String type;
    private int sizeGB;

    public Memory (String receivedType, int receivedSizeGB){
        type = receivedType;
        sizeGB = receivedSizeGB;
    }

    public String getType (){
        return type;
    }

    public int getSizeGB (){
        return sizeGB;
    }

    public String load (){
        return "Loading " + sizeGB + "GB " + type + " memory";
    }
    // TODO: Declare os campos privados: type (String) e sizeGB (int)
    
    // TODO: Crie um construtor que inicializa ambos os campos
    
    // TODO: Crie métodos getter para type e sizeGB
    
    // TODO: Crie um método load() que retorna:
    // "Loading [sizeGB]GB [type] memory"
}
