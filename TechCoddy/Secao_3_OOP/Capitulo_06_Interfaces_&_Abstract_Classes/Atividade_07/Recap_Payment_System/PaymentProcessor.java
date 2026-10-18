// TODO: Criar uma classe PaymentProcessor

class PaymentProcessor {

    public String processPayment(Payable paymentMethod, double amount){
        return paymentMethod.pay(amount);
    }
    // TODO: Implementar o método processPayment
    // Deve aceitar um objeto Payable e um valor double
    // Chame o método pay do método de pagamento e retorne o resultado
}
