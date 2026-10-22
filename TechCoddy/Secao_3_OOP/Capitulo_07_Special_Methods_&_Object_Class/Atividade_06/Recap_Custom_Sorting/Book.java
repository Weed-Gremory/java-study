import java.util.Objects;

// TODO: Faça esta classe implementar Comparable<Book>
class Book implements Comparable<Book>{

    private String title;
    private String author;
    private int year;

    public Book (String receivedTitle, String receivedAuthor, int receivedYear){
        title = receivedTitle;
        author = receivedAuthor;
        year = receivedYear;
    }

    public String getTitle (){
        return title;
    }

    public String getAuthor (){
        return author;
    }

    public int getYear (){
        return year;
    }

    @Override
    public int compareTo (Book other){
        return Integer.compare(this.year, other.year);
    }

    @Override
    public String toString (){
        return String.format("%s by %s (%d)", title, author, year);
    }

    @Override
    public boolean equals (Object obj){
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Book b1 = (Book) obj;

        return title.equals(b1.title) && author.equals(b1.author);
    }

    @Override
    public int hashCode (){
        return Objects.hash(title, author);
    }
    // TODO: Declare os campos privados: title (String), author (String), year (int)
    
    // TODO: Crie um construtor que inicialize todos os campos
    
    // TODO: Crie getters para todos os campos
    
    // TODO: Implemente o método compareTo() para ordenação natural por ano (ascendente)
    
    // TODO: Sobrescreva toString() para retornar: [title] by [author] ([year])
    
    // TODO: Sobrescreva equals() - dois livros são iguais se tiverem o mesmo título E autor
    
    // TODO: Sobrescreva hashCode() usando Objects.hash() com title e author
}