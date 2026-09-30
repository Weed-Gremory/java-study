public class StringHelper {
    private String text;
    
    public StringHelper(String text) {
        this.text = text;
    }
    
    public String toUpperCase(){
        return text.toUpperCase();
    }

    public int getLength(){
        return text.length();
    }

    public boolean contains(String word){
        return text.contains(word);
    }

    public String repeat(int times){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < times; i++){
            result.append(String.format("%s ", text));
        }

        return result.toString();
    }
    // TODO: Create a method toUpperCase() that returns this.text in uppercase
    // Hint: use this.text.toUpperCase()
    
    // TODO: Create a method getLength() that returns the length of this.text as an int
    // Hint: use this.text.length()
    
    // TODO: Create a method contains(String word) that returns true/false if this.text contains the word
    // Hint: use this.text.contains(word)
    
    // TODO: Create a method repeat(int times) that returns this.text repeated 'times' times
    // Each repetition followed by a space
    // Hint: use a for loop and string concatenation
}