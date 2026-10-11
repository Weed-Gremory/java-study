class Book {

    private String title;
    private double price;
    private static int totalBooks;

    public Book (String receivedTitle, double receivedPrice){
        title = receivedTitle;
        price = receivedPrice;
        totalBooks++;
    }

    public String getTitle (){
        return title;
    }

    public double getPrice (){
        return price;
    }

    public static int getTotalBooks (){
        return totalBooks;
    }
    // TODO: Declare instance variable 'title' (String)
    
    // TODO: Declare instance variable 'price' (double)
    
    // TODO: Declare static variable 'totalBooks' (int) - shared across all Book objects
    
    // TODO: Create constructor that takes title and price
    // Don't forget to increment totalBooks when a new book is created
    
    // TODO: Create getter getTitle() that returns the title
    
    // TODO: Create getter getPrice() that returns the price
    
    // TODO: Create static method getTotalBooks() that returns the total number of books
}
