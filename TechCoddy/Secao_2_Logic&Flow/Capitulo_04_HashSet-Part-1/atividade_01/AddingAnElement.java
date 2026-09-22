import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class AddingAnElement {
    public static void addElement(HashSet<String> set, String element) {
        // Write your code here

        set.add(element);

        System.out.print(set);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read JSON string representing a HashSet (e.g., ["Apple","Banana"])
        String setString = scanner.nextLine();
        // Read the element to add (e.g., "Cherry")
        String element = scanner.nextLine();
        
        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> set = new Gson().fromJson(setString, setType);
        
        addElement(set, element);

        scanner.close();
    }
}

