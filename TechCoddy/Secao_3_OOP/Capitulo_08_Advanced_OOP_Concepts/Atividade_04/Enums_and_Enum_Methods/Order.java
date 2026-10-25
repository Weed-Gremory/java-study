class Order {

    private String customerName;
    private CoffeeSize size;

    public Order (String receivedCustomerName, CoffeeSize receivedSize){
        customerName = receivedCustomerName;
        size = receivedSize;
    }

    public String getCustomerName (){
        return customerName;
    }

    public CoffeeSize getSize(){
        return size;
    }

    public String getReceipt (){
        return String.format("Order for: %s\nSize: %s\nTotal: $%.1f", customerName, size.getDescription(), size.getPrice());
    }
    // TODO: Adicione campos privados para customerName (String) e size (CoffeeSize)
    
    // TODO: Adicione um construtor que inicializa ambos os campos
    
    // TODO: Adicione métodos getter para customerName e size
    
    // TODO: Adicione um método getReceipt() que retorna uma string de múltiplas linhas:
    // "Order for: [customerName]
    // Size: [size description]
    // Total: $[price]"
    
}
