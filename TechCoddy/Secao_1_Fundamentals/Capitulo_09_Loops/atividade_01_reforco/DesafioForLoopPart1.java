public class DesafioForLoopPart1 {
    public static void main(String[] args) {
        // Initialize variables
        int number = 7;
        int sum = 0;
        
        System.out.println("Multiplication Table for " + number);
        System.out.println("---------------------------");
        
        // Write your for loop here
        
        for (int i = 1; i <= 12; i++){
            int mult = number * i;
            sum = sum + mult;
            System.out.printf("%d x %d = %d\n", number, i, mult);
        }
        
        System.out.println("---------------------------");
        System.out.println("Sum of all results: " + sum);
    }
}
