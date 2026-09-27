import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class RecapControlFlow {
    public static String processArray(Object[] data, String type) {
        // Write your code here

        if (data == null || data.length == 0) return "Invalid input";
        if (type == null) return "Invalid type";

        if (type.equalsIgnoreCase("sum")){
            double sum = 0;

            for (Object item : data){
                if (!(item instanceof Number)) continue;

                sum += ((Number) item).doubleValue();
            }

            return "Sum: " + sum;
        }

        if (type.equalsIgnoreCase("find")){
            for (int i = 0; i < data.length; i++){
                if (!(data[i] instanceof Number)) continue;
                if (((Number) data[i]).doubleValue() > 100) return String.valueOf(i);
            }

            return "Not found";
        }

        return "Invalid type";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dataJson = scanner.nextLine();
        String type = scanner.nextLine();
        
        Type arrayType = new TypeToken<Object[]>(){}.getType();
        Object[] data = new Gson().fromJson(dataJson, arrayType);
        
        System.out.println(processArray(data, type));
        
        scanner.close();
    }
}
