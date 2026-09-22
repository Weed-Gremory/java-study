import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
@SuppressWarnings("unchecked")

public class ClearAndClone {
    public static void processSet(HashSet<String> set) {
        // Write your code here

        HashSet<String> clonedSet = (HashSet<String>) set.clone();
        set.clear();

        System.out.printf("Cloned Set: %s\nCloned Set Size: %d\nOriginal Set after clear: %s\nOriginal Set Size: %d\n", clonedSet, clonedSet.size(), set, set.size());
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String setString = scanner.nextLine();
        
        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> set = new Gson().fromJson(setString, setType);
        
        processSet(set);

        scanner.close();
    }
}
