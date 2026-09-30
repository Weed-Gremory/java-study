public class Book {
    private String title;
    private String author;
    private int pages;

    public Book (String receivedTitle, String receivedAuthor, int receivedPages){
        title = receivedTitle;
        author = receivedAuthor;
        pages = receivedPages;
    }

    public String getTitle (){
        return title;
    }

    public String getAuthor (){
        return author;
    }

    public int getPages (){
        return pages;
    }

    public String getSummary (){
        return String.format("%s by %s (%d pages)", title, author, pages);
    }
    
    // TODO: Create a constructor that takes title, author, and pages
    // Use 'this' keyword to assign each parameter to its field
    
    // TODO: Create getTitle() getter
    
    // TODO: Create getAuthor() getter
    
    // TODO: Create getPages() getter
    
    // TODO: Create getSummary() method that returns:
    // "<title> by <author> (<pages> pages)"
}