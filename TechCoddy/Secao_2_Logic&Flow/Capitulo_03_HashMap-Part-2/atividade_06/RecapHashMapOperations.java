import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Map;

public class RecapHashMapOperations {
    public static HashMap<String, Object> processHashMap(HashMap<String, Double> products) {
        // Write your code here

        HashMap<String, Object> result = new HashMap<>();
        String highest = "";
        double average = 0;
        double maxValue = Double.NEGATIVE_INFINITY;
        HashMap<String, Double> filtered = new HashMap<>();

        if (products.isEmpty()){
            result.put("Average", average);
            result.put("Filtered", filtered);
            result.put("Highest", highest);

            return result;
        }

        for (Map.Entry<String, Double> operation : products.entrySet()){
            average += operation.getValue();

            if (operation.getValue() > 50){
                filtered.put(operation.getKey(), operation.getValue());
            }
            if (operation.getValue() > maxValue){
                highest = operation.getKey();
                maxValue = operation.getValue();
            }
        }

        average = average / products.size();

        result.put("Average", average);
        result.put("Filtered", filtered);
        result.put("Highest", highest);

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String productsString = scanner.nextLine();

        // Convert JSON string to HashMap
        Type mapType = new TypeToken<HashMap<String, Double>>(){}.getType();
        HashMap<String, Double> products = new Gson().fromJson(productsString, mapType);

        HashMap<String, Object> result = processHashMap(products);

        // Sort the Filtered map to ensure consistent output
        Map<String, Double> filteredMap = (Map<String, Double>) result.get("Filtered");
        if (filteredMap != null && !filteredMap.isEmpty()) {
            Map<String, Double> sortedFiltered = filteredMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                    Map.Entry::getKey,
                    Map.Entry::getValue,
                    (a, b) -> b,
                    LinkedHashMap::new
                ));
            result.put("Filtered", sortedFiltered);
        }
        
        System.out.println(result);

        scanner.close();
    }
}
