// Electronics.java - Subclasse de Product com informações de garantia

class Electronics extends Product {

    private int warrantyYears;

    public Electronics (String receivedName, double receivedPrice, int ReceivedWarrantyYears){
        super(receivedName, receivedPrice);
        warrantyYears = ReceivedWarrantyYears;

        System.out.printf("Electronics constructor: %d year warranty\n", warrantyYears);
    }

    public Electronics (String receivedName, double receivedPrice){
        this(receivedName, receivedPrice, 1);
    }

    public Electronics (String receivedName){
        this(receivedName, 0.0);
    }

    public String getDetails (){
        return String.format("%s - $%.2f (%d year warranty)", getName(), getPrice(), warrantyYears);
    }
    // TODO: Declare um campo privado para warrantyYears (int)
    
    // TODO: Crie o construtor principal que recebe name, price e warrantyYears
    // - Chame super(name, price) para inicializar o pai
    // - Defina o campo warrantyYears
    // - Imprima: "Electronics constructor: [warrantyYears] year warranty"
    
    // TODO: Crie um segundo construtor que recebe name e price
    // - Encadeie para o construtor principal com this(name, price, 1) para garantia padrão de 1 ano
    
    // TODO: Crie um terceiro construtor que recebe apenas name
    // - Encadeie para o segundo construtor com this(name, 0.0)
    
    // TODO: Crie o método getDetails() que retorna:
    // "[name] - $[price] ([warrantyYears] year warranty)"
    // Use String.format("%.2f", price) para a formatação do preço
}
