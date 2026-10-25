enum CoffeeSize {
    SMALL(2.5), MEDIUM(3.5), LARGE(4.5);

    private double price;

    CoffeeSize (double receivedPrice){
        price = receivedPrice;
    }

    public double getPrice (){
        return price;
    }

    public String getDescription (){
        return name() + " - $" + price;
    }
    // TODO: Defina as constantes do enum SMALL, MEDIUM, LARGE com os preços 2.50, 3.50, 4.50
    
    // TODO: Adicione um campo private double para price
    
    // TODO: Adicione um construtor que recebe um parâmetro price
    
    // TODO: Adicione um método getPrice() que retorna o preço
    
    // TODO: Adicione um método getDescription() que retorna "[SIZE_NAME] - $[price]"
    
}
