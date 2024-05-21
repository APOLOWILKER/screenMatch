package challenge;

public class Musica {
    // atributos
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacao;

    void fichaTecnica(){
        System.out.println("Ficha tecnica da musica: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lancamento: " + anoLancamento);
    }

    void avaliando(double nota){
        avaliacao += nota;
        numAvaliacao++;
    }

    public double mediaAvaliacao(){
        return avaliacao / numAvaliacao;
    }
}
