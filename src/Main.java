import challenge.Calculadora;
import challenge.Musica;

public class Main {
    public static void main(String[] args) {
        /*
        * Pate da Movie myMovier esta criando a gaveta para guardar
        * Parte da new Movie esta referenciando e guardando
        */
        Movie myMovie = new Movie();
        myMovie.nameMovie = "O poderoso chefão";
        myMovie.releaseYear = 1970;
        myMovie.minutesDuration = 180;


        myMovie.evaluate(8);
        myMovie.evaluate(5);
        myMovie.evaluate(10);

        myMovie.displayTechnicalSheet();
        System.out.println(myMovie.getAverageReviews());


    }
}
