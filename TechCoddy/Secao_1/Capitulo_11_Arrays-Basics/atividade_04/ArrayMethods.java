import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethods {
    public static String[] merge(String[] arr1, String[] arr2) {
        // Write code here
        int index = arr1.length + arr2.length;
        int indexdest = arr1.length;
        String[] sumArr = new String[index];

        System.arraycopy(arr1, 0, sumArr, 0, arr1.length);
        System.arraycopy(arr2, 0, sumArr, indexdest, arr2.length);

        Arrays.sort(sumArr);

        return sumArr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textArr1 = scanner.nextLine();
        String textArr2 = scanner.nextLine();
        String[] arr1 = textArr1.split(",");
        String[] arr2 = textArr2.split(",");

        String[] mergedArray = merge(arr1, arr2);
        System.out.println(Arrays.toString(mergedArray));

        scanner.close();
    }
}
