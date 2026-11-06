// TODO: Crie uma classe genérica NumberStats com parâmetro de tipo delimitado
// O parâmetro de tipo T deve estender Number

class NumberStats<T extends Number> {

    private T value1;
    private T value2;

    public NumberStats (T value1, T value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public double getSum (){
        return value1.doubleValue() + value2.doubleValue();
    }

    public double getAverage (){
        return (value1.doubleValue() + value2.doubleValue()) / 2;
    }

    // TODO: Declare dois campos privados do tipo T: value1 e value2
    
    // TODO: Crie um construtor que aceite ambos os valores
    
    // TODO: Implemente o método getSum()
    // Retorna a soma de ambos os valores como um double
    // Dica: Use o método doubleValue() da classe Number
    
    // TODO: Implemente o método getAverage()
    // Retorna a média dos dois valores como um double
}
