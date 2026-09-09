public class DesafioDeclaringMethods {
    // Write your methods here
    
    public static void printHeader(){
        System.out.printf("=================\nEvent Schedule\n=================\n");
    }
    
    public static void printEvent(){
        System.out.printf(">> Main Event <<\nTime: 7:00 PM\nLocation: Hall A\n");
    }
    
    public static void printFooter(){
        System.out.printf("=================\nThank You!\n=================\n");
    }

    public static void main(String[] args) {
        // Call the methods in correct order
        
        printHeader();
        printEvent();
        printEvent();
        printEvent();
        printFooter();
    }
}
