import java.util.HashMap;

public class DeclareHashMap {
    public static HashMap<String, String> createStringStringMap() {
        // Write your code here

        HashMap<String, String> result = new HashMap<>();

        result.put("apple", "red");
        result.put("banana", "yellow");
        result.put("grape", "purple");

        return result;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createStringStringMap();
        
        // Print the HashMap
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
