// Classe abstrata Shape - a base para todas as formas
abstract class Shape {

    private String name;

    public Shape (String receivedName){
        name = receivedName;
    }

    public abstract double getArea ();

    public String getName (){
        return name;
    }

    public String describe (){
        return String.format("%s: %.2f", name, getArea());
    }
    // TODO: Declare um campo String privado chamado 'name'
    
    // TODO: Crie um construtor que receba um parâmetro String e inicialize o campo name
    
    // TODO: Crie um método getter getName() que retorne o nome
    
    // TODO: Declare um método abstrato getArea() que retorne um double
    
    // TODO: Crie um método describe() que retorne: "[name]: [area]"
    // Use String.format("%.2f", getArea()) para formatar a área com 2 casas decimais
}
