public class DoWhileLoop {
    public static void main(String[] args) {
        // Initialize variables
        int sum = 0;
        int number = 1;

        // Your code here
         do {
            sum = sum + number;
            number = number + 2;
            
            System.out.printf("Sum is: %d\nNum is: %d\n", sum, number);
         } while (number <= 50);

        // Print the final sum
        System.out.println("Final Sum: " + sum);
    }
}
