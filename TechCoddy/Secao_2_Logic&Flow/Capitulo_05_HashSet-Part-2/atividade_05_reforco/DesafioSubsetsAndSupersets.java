import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class DesafioSubsetsAndSupersets {
    public static void checkProperSubsetSuperset(HashSet<String> setA, HashSet<String> setB) {
        // Write your code here

        boolean subSet = setB.containsAll(setA);
        boolean supSet = setA.containsAll(setB);
        boolean subSetOwn = subSet && (setB.size() > setA.size());
        boolean supSetOwn = supSet && (setA.size() > setB.size());

        System.out.printf("setA is a subset of setB: %b\nsetA is a superset of setB: %b\nsetA is a proper subset of setB: %b\nsetA is a proper superset of setB: %b\n", subSet, supSet, subSetOwn, supSetOwn);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String setAString = scanner.nextLine();
        String setBString = scanner.nextLine();
        
        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> setA = new Gson().fromJson(setAString, setType);
        HashSet<String> setB = new Gson().fromJson(setBString, setType);
        
        checkProperSubsetSuperset(setA, setB);

        scanner.close();
    }
}
