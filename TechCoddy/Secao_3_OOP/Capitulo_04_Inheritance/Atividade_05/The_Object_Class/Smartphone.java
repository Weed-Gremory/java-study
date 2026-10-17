// TODO: Crie a classe Smartphone que estende Gadget
// Esta classe deve ter:
// - Um campo privado: brand (String)
// - Um construtor que recebe name, year e brand
//   (use super(name, year) para chamar o construtor pai)
// - Um método getter: getBrand()
// - Sobrescrever toString() para retornar: "Smartphone: [brand] [name] ([year])"

class Smartphone extends Gadget {

    private String brand;

    public Smartphone (String receivedName, int receivedYear, String receivedBrand){
        super(receivedName, receivedYear);
        brand = receivedBrand;
    }

    @Override
    public String toString (){
        return String.format("Smartphone: %s %s (%d)", brand, getName(), getYear());
    }
    // TODO: Declare o campo privado para brand
    
    // TODO: Crie o construtor usando super() para os campos pai
    
    // TODO: Crie o método getBrand()
    
    // TODO: Sobrescreva o método toString()
    
}
