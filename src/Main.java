import br.com.alura.screenmatch.modelo.Movie;

public class Main {
    public static void main(String[] args) {
        /*
        * Pate da br.com.alura.screenmatch.modelo.Movie myMovier esta criando a gaveta para guardar
        * Parte da new br.com.alura.screenmatch.modelo.Movie esta referenciando e guardando
        */
        Movie favoriteMovie = new Movie();
        favoriteMovie.nameMovie = "O poderoso chefão";
        favoriteMovie.setReleaseYear(1970);
        favoriteMovie.setMinutesDuration(180);
        favoriteMovie.setIncludedPlan(true);



        favoriteMovie.evaluate(8);
        favoriteMovie.evaluate(5);
        favoriteMovie.evaluate(10);

        favoriteMovie.displayTechnicalSheet();
        System.out.println(favoriteMovie.getAverageReviews());

    }
}
