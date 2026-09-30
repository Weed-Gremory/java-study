public class Product {
    private String name;
    private double price;
    private int stock;

    public Product (String receivedName, double receivedPrice, int receivedStock){
        name = receivedName;
        price = receivedPrice;
        stock = receivedStock;
    }

    public Product (String receivedName, double receivedPrice){
        this(receivedName, receivedPrice, 0);
    }

    public Product (){
        this("Unknown", 0, 0);
    }
    
    // TODO: Create a constructor with 3 parameters: name, price, stock
    // Initialize all fields using 'this'
    
    // TODO: Create a constructor with 2 parameters: name, price
    // Use this() to call the 3-parameter constructor with stock = 0
    
    // TODO: Create a default constructor with no parameters
    // Use this() to call the 2-parameter constructor with name = "Unknown" and price = 0
    
    public String getName() { return this.name; }
    public double getPrice() { return this.price; }
    public int getStock() { return this.stock; }
}