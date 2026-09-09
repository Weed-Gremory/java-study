public class DesafioStringMethodsPart1 {
    // Write your methods here
    
    public static String checkLength(String user){
        int length = user.length();
        boolean lengthBo = true;

        if (length >= 6){
            lengthBo = true;
        } else {
            lengthBo = false;
        }

        String result = "Username length: " + length + "\nLong enough: " + lengthBo;

        return result;
    }

    public static String checkStart(String user){
        boolean userA = user.startsWith("user_");
        boolean userB = user.startsWith("admin_");

        String result = "Starts with user_: " + userA + "\nStarts with admin_: " + userB;

        return result;
    }

    public static String modifyUsername(String user){
        String sub = user.substring(0, 5);
        String subUpper = sub.toUpperCase();

        String result = "First 5 chars: " + sub + "\nUppercase: " + subUpper;

        return result;
    }
    
    public static void main(String[] args) {
        // Test with this username
        String username = "user_123admin";
        
        System.out.println("Length Check:");
        System.out.println(checkLength(username));
        
        System.out.println("\nPrefix Check:");
        System.out.println(checkStart(username));
        
        System.out.println("\nModified Username:");
        System.out.println(modifyUsername(username));
    }
}
