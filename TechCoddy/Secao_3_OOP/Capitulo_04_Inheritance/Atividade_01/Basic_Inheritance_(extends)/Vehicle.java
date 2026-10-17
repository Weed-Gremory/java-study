// TODO: Criar a classe Vehicle
// Esta é a classe pai para todos os veículos

class Vehicle {

    private String brand;

    public Vehicle (String receivedBrand){
        brand = receivedBrand;
    }

    public String getBrand (){
        return brand;
    }

    public void start (){
        System.out.printf("%s is starting\n", brand);
    }
    // TODO: Declarar um campo privado para a marca (String)
    
    // TODO: Criar um construtor que aceite o nome da marca
    
    // TODO: Criar um método getBrand() que retorne a marca
    
    // TODO: Criar um método start() que imprima: [brand] is starting
}
