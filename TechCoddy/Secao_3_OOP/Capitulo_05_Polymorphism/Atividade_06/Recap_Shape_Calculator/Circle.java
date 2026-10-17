// Classe Circle - estende Shape
class Circle extends Shape {

    private double radius;

    public Circle (double receivedRadius){
        super("Circle");
        radius = receivedRadius;
    }

    @Override
    public double getArea (){
        return Math.PI * radius * radius;
    }
    
    // TODO: Declare um campo double privado chamado 'radius'
    
    // TODO: Crie um construtor que receba um parâmetro double radius
    // Use super("Circle") para passar o nome para o construtor pai
    // Inicialize o campo radius
    
    // TODO: Sobrescreva getArea() para retornar Math.PI * radius * radius
}
