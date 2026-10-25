class ShoppingCart {

    private String customerName;

    public ShoppingCart (String receivedCustomerName){
        customerName = receivedCustomerName;
    }

    class Item {
        private String name;
        private double price;

        public Item (String receivedName, double receivedPrice){
            name = receivedName;
            price = receivedPrice;
        }

        public String getDetails (){
            return name + ": $" + price;
        }
    }

    public String checkout (Item receivedItem, double receivedDiscount){
        class DiscountCalculator {
            public double applyDiscount(double originalPrice){
                return originalPrice - (originalPrice * (receivedDiscount / 100));
            }
        }

        DiscountCalculator calculator = new DiscountCalculator();

        double finalPrice = calculator.applyDiscount(receivedItem.price);

        Formatter formatter = new Formatter() {
            @Override
            public String format() {
                return "--- Receipt ---\n" + "Customer: " + customerName + "\nItem: " + receivedItem.getDetails() + "\nDiscount: " + receivedDiscount + "%\nFinal Price: $" + finalPrice;
            }
        };

        return formatter.format();
    }
    // TODO: Adicione um campo privado para customerName
    
    // TODO: Crie um construtor que receba customerName
    
    // TODO: Crie uma classe interna aninhada Item com:
    //       - campos privados: name (String), price (double)
    //       - construtor para inicializar ambos os campos
    //       - método getDetails() que retorna: "[name]: $[price]"
    
    // TODO: Crie o método checkout que recebe um Item e a porcentagem de desconto (double)
    //       Dentro de checkout():
    //       1. Crie uma classe interna local DiscountCalculator com o método:
    //          applyDiscount(double originalPrice) - retorna o preço após o desconto
    //       2. Use DiscountCalculator para calcular o preço final
    //       3. Crie uma classe interna anônima implementando Formatter
    //          para formatar e retornar a string do recibo:
    //          --- Receipt ---
    //          Customer: [customerName]
    //          Item: [item details]
    //          Discount: [discount]%
    //          Final Price: $[calculated price]
    
}
