// Classe base no topo da hierarquia
public class Vehicle {

    private String brand;

    public Vehicle (String receivedBrand){
        brand = receivedBrand;
    }

    public String getBrand (){
        return brand;
    }

    public void move (){
        System.out.printf("%s is moving\n", brand);
    }
    
    // TODO: Adicionar campo privado para brand (String)
    
    // TODO: Criar construtor que aceita brand
    
    // TODO: Criar método getBrand() que retorna a brand
    
    // TODO: Criar método move() que imprime: [brand] is moving
}
