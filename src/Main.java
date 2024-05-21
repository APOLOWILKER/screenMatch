import br.com.alura.screenmatch.modelo.Movie;
import br.com.alura.screenmatch.modelo.Series;

public class Main {
    public static void main(String[] args) {
        /*
        * Pate da br.com.alura.screenmatch.modelo.Movie myMovier esta criando a gaveta para guardar
        * Parte da new br.com.alura.screenmatch.modelo.Movie esta referenciando e guardando
        */
        Movie favoriteMovie = new Movie();
        favoriteMovie.nameTitle = "O poderoso chefão";
        favoriteMovie.setReleaseYear(1970);
        favoriteMovie.setMinutesDuration(180);
        favoriteMovie.setIncludedPlan(true);



        favoriteMovie.evaluate(8);
        favoriteMovie.evaluate(5);
        favoriteMovie.evaluate(10);

        favoriteMovie.displayTechnicalSheet();
        System.out.println(favoriteMovie.getAverageReviews() + "\n\n");

        // Serie

        Series lost = new Series();
        lost.setNameTitle("Lost");
        lost.setReleaseYear(2000);
        lost.displayTechnicalSheet();
        lost.setSeasons(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisode(50);
        System.out.println("Duração para maratonar: " + lost.getMinutesDuration() + "\n");

    }
}
