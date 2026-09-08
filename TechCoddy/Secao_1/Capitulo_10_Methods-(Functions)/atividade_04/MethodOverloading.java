public class MethodOverloading {
    // Write your calculateArea methods here
    
    public static void calculateArea (int a){
        int b = a * a;
        System.out.printf("Square area with side %d: %d\n", a, b);
    }

    public static void calculateArea (int a, int b){
        int c = a * b;
        System.out.printf("Rectangle area with length %d and width %d: %d\n", a, b, c);
    }

    public static void calculateArea (double a){
        double b = 3.14 * (a * a);
        System.out.println("Circle area with radius " + a + ": " + b);
    }
    
    public static void main(String[] args) {
        // Test your methods with these exact values
        calculateArea(5);          // square
        calculateArea(4, 6);       // rectangle
        calculateArea(2.5);        // circle
    }
}
