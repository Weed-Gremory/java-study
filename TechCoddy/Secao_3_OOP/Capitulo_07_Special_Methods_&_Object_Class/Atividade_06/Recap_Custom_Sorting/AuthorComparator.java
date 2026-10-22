import java.util.Comparator;

// TODO: Faça esta classe implementar Comparator<Book>
class AuthorComparator implements Comparator<Book>{

    @Override
    public int compare (Book b1, Book b2){
        return b1.getAuthor().compareTo(b2.getAuthor());
    }
    // TODO: Implemente o método compare() para ordenar os livros em ordem alfabética por autor (A a Z)
}