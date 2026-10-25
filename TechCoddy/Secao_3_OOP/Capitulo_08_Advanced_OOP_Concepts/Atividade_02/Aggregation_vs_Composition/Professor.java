// Classe Professor - existe independentemente de qualquer curso (usada em agregação)
class Professor {

    private String name;
    private String department;

    public Professor (String receivedName, String receivedDepertment){
        name = receivedName;
        department = receivedDepertment;
    }

    public String getName (){
        return name;
    }

    public String getDepertment (){
        return department;
    }

    @Override
    public String toString (){
        return String.format("Prof. %s (%s)", name, department);
    }
    // TODO: Declare campos privados: name (String) e department (String)
    
    // TODO: Crie o construtor que inicializa ambos os campos
    
    // TODO: Crie métodos getter para name e department
    
    // TODO: Sobrescreva toString() para retornar: Prof. [name] ([department])
    
}