import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class DesafioIteratingOverSets {
    public static void printSetWithCount(HashSet<String> set) {
        // Write your code here using a for-each loop

        int i = 0;
        
        if (set != null || !set.isEmpty()){
            for (String item : set){
                i++;
                System.out.printf("%s\n", item);
            }
        }

        System.out.printf("Total elements: %d\n", i);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read a JSON string representing a HashSet of strings, e.g., ["Apple","Banana","Cherry"]
        String setString = scanner.nextLine();

        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> mySet = new Gson().fromJson(setString, setType);

        printSetWithCount(mySet);

        scanner.close();
    }
}
