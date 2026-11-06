// TODO: Crie uma classe genérica ComparableBox com múltiplos bounds
// O parâmetro de tipo T deve estender Number E implementar Comparable<T>

class ComparableBox<T extends Number & Comparable<T>> {

    private T first;
    private T second;

    public ComparableBox (T first, T second){
        this.first = first;
        this.second = second;
    }

    public T getMax (){
        if (first.compareTo(second) > 0){
            return first;
        } else {
            return second;
        }
    }

    public double getMaxAsDouble (){
        return getMax().doubleValue();
    }
    // TODO: Declare dois campos privados do tipo T: first e second
    
    // TODO: Crie um construtor que aceite ambos os valores
    
    // TODO: Implemente o método getMax()
    // Retorna o maior valor usando compareTo()
    
    // TODO: Implemente o método getMaxAsDouble()
    // Retorna o maior valor convertido para double
}
