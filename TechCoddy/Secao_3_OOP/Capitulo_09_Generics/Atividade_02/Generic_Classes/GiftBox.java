// Classe genérica que pode embrulhar qualquer tipo de presente
class GiftBox<T> {

    private T item;
    private boolean wrapped = false;

    public GiftBox (T receivedItem){
        item = receivedItem;
    }

    public T getItem (){
        return item;
    }

    public void wrap (){
        wrapped = true;
    }

    public boolean isWrapped (){
        return wrapped;
    }

    public String getStatus (){
        if (wrapped){
            return item + " (wrapped)";
        }

        return item + " (unwrapped)";
    }
    
    // TODO: Declare o campo privado 'item' do tipo T
    // TODO: Declare o campo privado 'wrapped' (boolean) inicializado como false
    
    // TODO: Crie o construtor que aceita o item
    
    // TODO: Implemente o método getItem() que retorna o item
    
    // TODO: Implemente o método wrap() que define wrapped como true
    
    // TODO: Implemente o método isWrapped() que retorna o status de wrapped
    
    // TODO: Implemente o método getStatus() que retorna:
    // "[item] (wrapped)" ou "[item] (unwrapped)" dependendo do estado de wrapped
}
