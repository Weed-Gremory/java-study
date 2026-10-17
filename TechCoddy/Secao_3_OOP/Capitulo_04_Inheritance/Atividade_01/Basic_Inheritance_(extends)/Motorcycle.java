// TODO: Crie a classe Motorcycle que estende Vehicle
// Isso demonstra a relação "é um" - uma Motocicleta É UM Veículo

class Motorcycle extends Vehicle {

    public Motorcycle (String receivedBrand){
        super(receivedBrand);
    }

    public void wheelie (){
        System.out.printf("%s is doing a wheelie!\n", getBrand());
    }
    // TODO: Use a palavra-chave 'extends' para herdar de Vehicle
    
    // TODO: Crie um construtor que receba a marca (brand)
    // e a passe para a classe pai usando super(brand)
    
    // TODO: Crie um método wheelie() que imprima: [brand] is doing a wheelie!
    // Dica: Use getBrand() para acessar o nome da marca
}
