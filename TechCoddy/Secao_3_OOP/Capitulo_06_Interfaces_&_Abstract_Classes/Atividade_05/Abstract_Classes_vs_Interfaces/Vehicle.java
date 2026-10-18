// Classe abstrata - use quando as classes compartilham estado E comportamento
abstract class Vehicle {

    private String brand;
    private int year;

    public Vehicle (String receivedBrand, int receivedYear){
        brand = receivedBrand;
        year = receivedYear;
    }

    public String getBrand (){
        return brand;
    }

    public int getYear (){
        return year;
    }

    public abstract String startEngine();

    public String getInfo (){
        return String.format("%s (%d)", brand, year);
    }
    // TODO: Declarar campos protegidos: brand (String) e year (int)
    
    // TODO: Criar construtor para inicializar brand e year
    
    // TODO: Criar métodos getter para brand e year
    
    // TODO: Criar método abstrato startEngine() que retorna String
    
    // TODO: Criar método concreto getInfo() que retorna: [brand] ([year])
}
