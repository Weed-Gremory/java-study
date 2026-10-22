import java.util.Comparator;

// TODO: Faça esta classe implementar Comparator<Book>
class TitleComparator implements Comparator<Book>{

    @Override
    public int compare (Book b1, Book b2){
        return b1.getTitle().compareTo(b2.getTitle());
    }
    // TODO: Implemente o método compare() para ordenar os livros em ordem alfabética por título (A a Z)
}