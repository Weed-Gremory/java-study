// TODO: Faça esta classe implementar Comparable<Movie>
class Movie implements Comparable<Movie> {
    // Campos privados
    private String title;
    private String director;
    private double rating;

    public Movie (String receivedTitle, String receivedDirector, double receivedRating){
        title = receivedTitle;
        director = receivedDirector;
        rating = receivedRating;
    }

    public String getTitle (){
        return title;
    }

    public String getDirector (){
        return director;
    }

    public double getRating (){
        return rating;
    }

    @Override
    public int compareTo (Movie other){
        return Double.compare(other.rating, this.rating);
    }

    @Override
    public String toString (){
        return title + " by " + director + " - Rating: " + rating;
    }
    
    // TODO: Crie um construtor que inicialize todos os campos
    
    // TODO: Crie métodos getter para title, director e rating
    
    // TODO: Sobrescreva o método compareTo()
    // Os filmes devem ser ordenados por rating em ordem DECRESCENTE (maior primeiro)
    // Dica: Use Double.compare() para uma comparação segura de double
    // Dica: Para ordem decrescente, inverta a ordem de comparação
    
    // TODO: Sobrescreva o método toString()
    // Formato: [title] by [director] - Rating: [rating]
}
