import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class EmptyAndSize {
    public static void checkSet(HashSet<String> set) {
        // Write your code here

        System.out.printf("Empty: %b\nSize: %d\n", set.isEmpty(), set.size());
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read JSON string representing a HashSet (e.g., ["Apple","Banana"])
        String setString = scanner.nextLine();
        
        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> set = new Gson().fromJson(setString, setType);
        
        checkSet(set);

        scanner.close();
    }
}
