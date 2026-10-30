// Classe genérica com dois parâmetros de tipo que associa um destinatário ao seu presente
class Registry<K, V> {

    private K recipient;
    private V gift;

    public Registry (K receivedRecipient, V receivedGift){
        recipient = receivedRecipient;
        gift = receivedGift;
    }

    public K getRecipient (){
        return recipient;
    }

    public V getGift (){
        return gift;
    }

    public String getEntry (){
        return recipient + " -> " + gift;
    }
    
    // TODO: Declare o campo privado 'recipient' do tipo K
    // TODO: Declare o campo privado 'gift' do tipo V
    
    // TODO: Crie o construtor que aceita ambos os valores
    
    // TODO: Implemente o método getRecipient()
    
    // TODO: Implemente o método getGift()
    
    // TODO: Implemente o método getEntry() que retorna:
    // "[recipient] -> [gift]"
}
