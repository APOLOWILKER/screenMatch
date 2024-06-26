package br.com.alura.screenmatch.modelo;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Series serie;

    public int getVisualizacao() {
        return visualizacao;
    }

    public void setVisualizacao(int visualizacao) {
        this.visualizacao = visualizacao;
    }

    private int visualizacao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (visualizacao > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
