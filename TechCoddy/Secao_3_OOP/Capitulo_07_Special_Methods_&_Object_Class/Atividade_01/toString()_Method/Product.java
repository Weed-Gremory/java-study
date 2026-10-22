class Product {

    private String name;
    private double price;
    private int quantity;

    public Product (String receivedName, double receivedPrice, int receivedQuantity){
        name = receivedName;
        price = receivedPrice;
        quantity = receivedQuantity;
    }

    @Override
    public String toString(){
        return "Product[name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }
    // TODO: Declare três campos privados:
    // - name (String)
    // - price (double)
    // - quantity (int)
    
    // TODO: Crie um construtor que inicialize todos os três campos
    
    // TODO: Sobrescreva o método toString()
    // Formato de retorno: Product[name=X, price=Y, quantity=Z]
    // onde X, Y, Z são os valores reais dos campos
}
