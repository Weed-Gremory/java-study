import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class MathSymmetricDifference {
    public static void symmetricDifference(HashSet<Integer> set1, HashSet<Integer> set2) {
        // Write your code here

        HashSet<Integer> diff1To2 = new HashSet<>(set1);
        HashSet<Integer> diff2To1 = new HashSet<>(set2);
        diff1To2.removeAll(set2);
        diff2To1.removeAll(set1);

        HashSet<Integer> diff = new HashSet<>(diff1To2);
        diff.addAll(diff2To1);

        System.out.printf("Symmetric Difference: %s\n", diff);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read JSON string for the first set (e.g., [1,2,3])
        String set1String = scanner.nextLine();
        // Read JSON string for the second set (e.g., [2,3,4])
        String set2String = scanner.nextLine();

        Type setType = new TypeToken<HashSet<Integer>>(){}.getType();
        HashSet<Integer> set1 = new Gson().fromJson(set1String, setType);
        HashSet<Integer> set2 = new Gson().fromJson(set2String, setType);

        symmetricDifference(set1, set2);

        scanner.close();
    }

}
