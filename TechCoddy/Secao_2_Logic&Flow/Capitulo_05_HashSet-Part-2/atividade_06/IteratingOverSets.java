import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class IteratingOverSets {
    public static void printSet(HashSet<String> set) {
        // Write your code here using a for-each loop

        for (String item : set){
            System.out.printf("%s\n", item);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read a JSON string representing a HashSet of strings, e.g., ["Apple","Banana","Cherry"]
        String setString = scanner.nextLine();

        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> mySet = new Gson().fromJson(setString, setType);

        printSet(mySet);

        scanner.close();
    }
}
