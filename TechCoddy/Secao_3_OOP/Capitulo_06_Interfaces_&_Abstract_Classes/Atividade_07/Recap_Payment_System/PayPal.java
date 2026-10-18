// TODO: Crie uma classe PayPal que implementa Payable

class PayPal implements Payable {

    private String email;

    public PayPal (String receivedEmail){
        email = receivedEmail;
    }

    @Override
    public String pay (double amount){
        return String.format("Paid %.2f via PayPal account %s", amount, email);
    }
    // TODO: Adicione um campo email (String)
    
    // TODO: Crie um construtor para inicializar email
    
    // TODO: Implemente o método pay
    // Formato de retorno: "Paid [amount] via PayPal account [email]"
    // Lembre-se de formatar amount com duas casas decimais
}
