import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class RemovingAnElement {
    public static void removeElement(HashSet<String> set, String element) {
        // Write your code here

        set.remove(element);

        System.out.print(set);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String setString = scanner.nextLine();
        String element = scanner.nextLine();
        
        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> set = new Gson().fromJson(setString, setType);
        
        removeElement(set, element);

        scanner.close();
    }
}
