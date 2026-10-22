import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lê três linhas de dados de filmes
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();

        ArrayList<Movie> movies = new ArrayList<>();

        String[] lines = {line1, line2, line3};

        for (String line : lines) {
            String[] data = line.split(",");

            String title = data[0];
            String director = data[1];
            double rating = Double.parseDouble(data[2]);

            Movie movie = new Movie(title, director, rating);

            movies.add(movie);
        }

        Collections.sort(movies);

        for (Movie movie : movies) {
            System.out.println(movie);
        }

        scanner.close();
        
        // TODO: Crie um ArrayList para armazenar objetos Movie
        
        // TODO: Analise cada linha (formato: title,director,rating)
        // Dica: Use split(",") para separar as partes
        // Dica: Use Double.parseDouble() para o rating
        
        // TODO: Crie objetos Movie e adicione-os à lista
        
        // TODO: Ordene a lista usando Collections.sort()
        
        // TODO: Imprima cada filme (um por linha)
    }
}
