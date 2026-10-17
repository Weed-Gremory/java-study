// TODO: Criar a classe Gadget
// Esta classe deve ter:
// - Campos privados: name (String) e year (int)
// - Um construtor que inicializa ambos os campos
// - Métodos getter: getName() e getYear()
// - NÃO sobrescreva nenhum método de Object - queremos o comportamento padrão

class Gadget {

    private String name;
    private int year;

    public Gadget (String receivedName, int receivedYear){
        name = receivedName;
        year = receivedYear;
    }

    public String getName (){
        return name;
    }

    public int getYear (){
        return year;
    }
    // TODO: Declarar campos privados
    
    // TODO: Criar construtor
    
    // TODO: Criar métodos getter
    
}
