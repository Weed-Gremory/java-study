import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class CheckingIfAnElementExists {
    public static void checkElement(HashSet<String> set, String element) {
        // Write your code here

        System.out.printf("%b", set.contains(element));
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String setString = scanner.nextLine();
        String element = scanner.nextLine();
        
        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> set = new Gson().fromJson(setString, setType);
        
        checkElement(set, element);

        scanner.close();
    }
}
