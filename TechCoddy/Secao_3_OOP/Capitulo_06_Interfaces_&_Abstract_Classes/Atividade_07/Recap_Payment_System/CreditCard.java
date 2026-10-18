// TODO: Criar uma classe CreditCard que implementa Payable

class CreditCard implements Payable {

    private String cardNumber;

    public CreditCard (String receivedCardNumber){
        cardNumber = receivedCardNumber;
    }

    @Override
    public String pay (double amount){
        return String.format("Paid %.2f using Credit Card ending in %s", amount, cardNumber);
    }
    // TODO: Adicionar um campo cardNumber (String) para os últimos 4 dígitos
    
    // TODO: Criar um construtor para inicializar cardNumber
    
    // TODO: Implementar o método pay
    // Formato de retorno: "Paid [amount] using Credit Card ending in [cardNumber]"
    // Lembre-se de formatar amount com duas casas decimais
}
