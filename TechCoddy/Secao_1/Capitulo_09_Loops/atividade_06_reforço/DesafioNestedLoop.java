public class DesafioNestedLoop {
    public static void main(String[] args) {
        System.out.println("Multiplication Table (1-5):");
        System.out.println("-------------------------");
        
        // Write your nested loops here
        
        for (int x = 1; x <= 5; x++){
            for(int y = 1; y <= 5; y++){
                int z = x * y;
                
                if ( y == 5){
                    System.out.printf("%d", z);
                } else {
                    System.out.printf("%-3d", z);
                }
            }
            System.out.println("");
        }
    }
}
