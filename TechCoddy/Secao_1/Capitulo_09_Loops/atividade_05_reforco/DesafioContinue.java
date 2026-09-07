public class DesafioContinue {
    public static void main(String[] args) {
        // Write your loop here
        
        for (int i = 1; i <= 20; i++){
            
            switch (i){
                case 4:
                case 13:
                case 17:
                    System.out.println("Skipping unlucky number: " + i);
                continue;
            }
            System.out.printf("Item #%d: Get this item!\n", i);
        }
    }
}
