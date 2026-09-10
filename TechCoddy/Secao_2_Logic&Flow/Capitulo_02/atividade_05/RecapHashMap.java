// --- Modules to convert string of hashmap to hashmap ---
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
// -----------------------------
import java.util.HashMap;
import java.util.Scanner;


public class RecapHashMap {
    public static HashMap<String, Integer> processHashMap(HashMap<String, Integer> data, String[] operations) {
        // Write your code here

        for (int i = 0; i < operations.length; i++){
            String[] comand = operations[i].split(" ");

            if (comand[0].equals("GET")){
                if (data.containsKey(comand[1])){
                    System.out.println(data.get(comand[1]));
                } else {
                    System.out.println("Not found");
                }
            } else if (comand[0].equals("CHECK")){
                if (data.containsKey(comand[1])){
                    System.out.println("Exists");
                } else {
                    System.out.println("Not found");
                }
            } else if (comand[0].equals("MODIFY")){
                Integer value = Integer.parseInt(comand[2]);
                
                if (data.containsKey(comand[1])){
                    if (data.get(comand[1]).equals(value)){
                        data.replace(comand[1], value + 1);
                    } else {
                        data.remove(comand[1]);
                    }
                } else {
                    data.put(comand[1], value);
                }
            }
        }

        return data;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hashMapString = scanner.nextLine();
        String operationsString = scanner.nextLine();

        // Convert String of HashMap to HashMap
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> data = new Gson().fromJson(hashMapString, mapType);

        // Convert String of Array to Array
        String[] operations = new Gson().fromJson(operationsString, String[].class);

        HashMap<String, Integer> result = processHashMap(data, operations);
        System.out.println(new Gson().toJson(result));

        scanner.close();
    }
}
