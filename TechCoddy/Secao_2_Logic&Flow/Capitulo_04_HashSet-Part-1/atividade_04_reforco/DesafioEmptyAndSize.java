import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class DesafioEmptyAndSize {
    public static void compareSets(HashSet<String> set1, HashSet<String> set2) {
        // Write your code here

        boolean sizeEquals = set1.size() == set2.size();

        System.out.printf("Set 1 Empty: %b\nSet 2 Empty: %b\nSet 1 Size: %d\nSet 2 Size: %d\nSame Size: %b\n", set1.isEmpty(), set2.isEmpty(), set1.size(), set2.size(), sizeEquals);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read JSON string representing two HashSets (e.g., ["Apple","Banana"])
        String set1String = scanner.nextLine();
        String set2String = scanner.nextLine();
        
        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> set1 = new Gson().fromJson(set1String, setType);
        HashSet<String> set2 = new Gson().fromJson(set2String, setType);
        
        compareSets(set1, set2);

        scanner.close();
    }
}
