import java.util.Scanner;

public class PatternFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrString1 = scanner.nextLine();
        String arrString2 = scanner.nextLine();
        String[] str1 = arrString1.split(",");
        String[] str2 = arrString2.split(",");
        // Write your code below
        boolean found = false;

        scanner.close();

        if (str2.length > str1.length){
            System.out.println(false);
            return;
        }

        for (int i = 0; i <= str1.length - str2.length; i++){
            boolean matchFound = true;

            for (int j = 0; j < str2.length; j++){
                if (!str1[i + j].equals(str2[j])){
                    matchFound = false;
                    break;
                }
            }

            if (matchFound){
                found = true;
                break;
            }
        }

        System.out.println(found);
    }
}
