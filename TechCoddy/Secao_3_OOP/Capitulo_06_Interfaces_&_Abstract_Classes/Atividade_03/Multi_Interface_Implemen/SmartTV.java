// TODO: Criar a classe SmartTV que implementa tanto Powerable quanto VolumeControl

class SmartTV implements Powerable, VolumeControl{

    private String brand;
    private boolean isOn = false;
    private int volume = 0;

    public SmartTV (String receivedBrand){
        brand = receivedBrand;
    }

    @Override
    public void powerOn(){
        isOn = true;
        System.out.printf("%s TV is now ON\n", brand);
    }

    @Override
    public void powerOff(){
        isOn = false;
        System.out.printf("%s TV is now OFF\n", brand);
    }

    @Override
    public void setVolume (int level){
        volume = level;
        System.out.printf("%s TV volume set to %d\n", brand, volume);
    }

    @Override
    public int getVolume(){
        return volume;
    }
    // TODO: Declarar campos:
    // - brand (String)
    // - isOn (boolean, inicialmente false)
    // - volume (int, inicialmente 0)
    
    // TODO: Criar um construtor que recebe o nome da marca (brand)
    
    // TODO: Implementar powerOn() - definir isOn como true e imprimir: [brand] TV is now ON
    
    // TODO: Implementar powerOff() - definir isOn como false e imprimir: [brand] TV is now OFF
    
    // TODO: Implementar setVolume(int level) - atualizar o volume e imprimir: [brand] TV volume set to [level]
    
    // TODO: Implementar getVolume() - retornar o volume atual
    
}
