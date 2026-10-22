import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Book> books = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            String line = scanner.nextLine();

            String[] data = line.split(",");

            String title = data[0];
            String author = data[1];
            int year = Integer.parseInt(data[2]);

            Book book = new Book(title, author, year);

            books.add(book);
        }

        Collections.sort(books);
        for (Book book : books){
            System.out.println(book);
        }
        
        System.out.println();

        Collections.sort(books, new TitleComparator());
        for (Book book : books){
            System.out.println(book);
        }

        System.out.println();

        Collections.sort(books, new AuthorComparator());
        for (Book book : books){
            System.out.println(book);
        }

        scanner.close();
        
        // TODO: Analisar cada linha para extrair título, autor e ano
        // Dica: Use split(",") para separar os valores
        
        // TODO: Criar objetos Book a partir dos dados analisados
        
        // TODO: Criar um ArrayList e adicionar todos os três livros
        
        // TODO: Ordenar usando a ordenação natural (por ano) e imprimir cada livro
        
        // TODO: Imprimir uma linha vazia
        
        // TODO: Ordenar por título usando TitleComparator e imprimir cada livro
        
        // TODO: Imprimir uma linha vazia
        
        // TODO: Ordenar por autor usando AuthorComparator e imprimir cada livro
    }
}