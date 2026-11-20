import java.util.ArrayList;

class Container<T> {

    private ArrayList<T> list = new ArrayList<>();
    

    public void add(T item){
        list.add(item);
    }

    public T get(int index){
        return list.get(index);
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public ArrayList<T> getAll(){
        return list;
    }
    // TODO: Crie um ArrayList<T> para armazenar elementos internamente
    
    // TODO: Implemente o método add(T item) para adicionar um elemento
    
    // TODO: Implemente o método get(int index) para recuperar um elemento em uma posição específica
    
    // TODO: Implemente o método size() para retornar a contagem de itens
    
    // TODO: Implemente o método isEmpty() para verificar se o container não possui elementos
    
    // TODO: Implemente o método getAll() que retorna a lista interna
}
