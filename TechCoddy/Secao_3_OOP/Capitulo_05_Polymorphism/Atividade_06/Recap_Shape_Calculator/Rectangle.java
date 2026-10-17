// Classe Rectangle - estende Shape
class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle (double receivedWidth, double receivedHeight){
        super("Rectangle");
        width = receivedWidth;
        height = receivedHeight;
    }

    @Override
    public double getArea (){
        return width * height;
    }
    // TODO: Declare campos double privados para 'width' e 'height'
    
    // TODO: Crie um construtor que receba os parâmetros width e height
    // Use super("Rectangle") para passar o nome para o construtor pai
    // Inicialize os campos width e height
    
    // TODO: Sobrescreva getArea() para retornar width * height
}
