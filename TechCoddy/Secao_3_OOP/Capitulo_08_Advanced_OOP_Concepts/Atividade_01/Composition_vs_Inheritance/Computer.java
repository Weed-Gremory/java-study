public class Computer {

    private Processor processor;
    private Memory memory;

    public Computer (Processor receivedProcessor, Memory receivedMemory){
        processor = receivedProcessor;
        memory = receivedMemory;
    }

    public String boot (){
        return String.format("Booting computer...\n%s\n%s\nSystem ready!", processor.process(), memory.load());
    }

    public String getSpecs (){
        return String.format("Specs: %s CPU, %dGB %s", processor.getBrand(), memory.getSizeGB(), memory.getType());
    }
    // TODO: Declare campos privados para Processor e Memory (composição!)
    // O Computer TEM-UM Processor e TEM-UM Memory
    
    // TODO: Crie um construtor que aceite um Processor e Memory
    
    // TODO: Crie um método boot() que retorne uma String de múltiplas linhas:
    // "Booting computer..."
    // [resultado de processor.process()]
    // [resultado de memory.load()]
    // "System ready!"
    
    // TODO: Crie um método getSpecs() que retorne:
    // "Specs: [processor brand] CPU, [memory sizeGB]GB [memory type]"
}
