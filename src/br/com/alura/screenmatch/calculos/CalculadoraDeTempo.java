package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelo.Movie;
import br.com.alura.screenmatch.modelo.Series;
import br.com.alura.screenmatch.modelo.Title;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Movie f) {
//        tempoTotal += f.getMinutesDuration();
//    }
//
//    Sobrecarga do Methodo
//    public void inclui(Series s) {
//        tempoTotal += s.getMinutesDuration();
//    }

    public void inclui(Title title){
        tempoTotal += title.getMinutesDuration();
    }
}
