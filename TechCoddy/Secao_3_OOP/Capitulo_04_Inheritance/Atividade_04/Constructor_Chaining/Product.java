// Product.java - Classe pai para todos os produtos

class Product {

    private String name;
    private double price;

    public Product (String receivedName, double receivedPrice){
        name = receivedName;
        price = receivedPrice;

        System.out.printf("Product constructor: %s\n", name);
    }

    public Product (String receivedName){
        this(receivedName, 0.0);
    }

    public String getName (){
        return name;
    }

    public double getPrice (){
        return price;
    }
    // TODO: Declare campos privados para name (String) e price (double)
    
    // TODO: Crie o construtor principal que recebe name e price
    // - Inicialize os campos
    // - Imprima: "Product constructor: [name]"
    
    // TODO: Crie o segundo construtor que recebe apenas name
    // - Encadeie para o construtor principal usando this(name, 0.0)
    
    // TODO: Crie os métodos getter getName() e getPrice()
}
