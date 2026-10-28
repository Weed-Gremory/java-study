// GenericBox.java - A abordagem moderna e type-safe usando generics

// TODO: Declare a classe com um parâmetro de tipo T
class GenericBox<T> {

    private T content;

    public GenericBox (T receivedContent){
        content = receivedContent;
    }

    public T getContent (){
        return content;
    }

    
    // TODO: Declare um campo privado 'content' do tipo T
    
    // TODO: Crie um construtor que aceita um valor T e o armazena
    
    // TODO: Crie um método getContent() que retorna o tipo T
}
