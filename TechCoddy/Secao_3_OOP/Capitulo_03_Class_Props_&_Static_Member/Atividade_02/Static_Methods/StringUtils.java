class StringUtils {

    private static int vowels;

    public static int countVowels (String text){
        for (char c : text.toCharArray()){
            c = Character.toLowerCase(c);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u'){
                vowels++;
            }
        }

        return vowels;
    }

    public static String reverse (String text){
        String result = new StringBuilder(text).reverse().toString();

        return result;
    }

    public static boolean isPalindrome (String text){
        String reverse = new StringBuilder(text).reverse().toString();

        if (text.equalsIgnoreCase(reverse)){
            return true;
        } else {
            return false;
        }
    }
    
    // TODO: Crie um método estático countVowels que recebe uma String
    // e retorna a contagem de vogais (a, e, i, o, u - sem diferenciar maiúsculas de minúsculas)
    
    
    // TODO: Crie um método estático reverse que recebe uma String
    // e retorna a versão invertida dela
    
    
    // TODO: Crie um método estático isPalindrome que recebe uma String
    // e retorna true se ela for lida da mesma forma de frente para trás e de trás para frente
    // (comparação sem diferenciar maiúsculas de minúsculas)
    
}
