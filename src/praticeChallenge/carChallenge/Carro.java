package praticeChallenge.carChallenge;

public class Carro {
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPrecos(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço Ano 1 " + precoAno1);
        System.out.println("Preço Ano 2 " + precoAno2);
        System.out.println("Preço Ano 3 " + precoAno3);
        System.out.println("Menor Preço: " + calculaMenorPreco());
        System.out.println("Maior Preço: " + calculaMaiorPreco());
    }

    private double calculaMenorPreco(){
        double menorPreco = precoAno1;

        if (precoAno2 < menorPreco) {
         menorPreco = precoAno2;
        }

        if (precoAno3 < menorPreco){
            menorPreco = precoAno3;
        }

        return menorPreco;
    }

    private  double calculaMaiorPreco() {
        double maiorPreco = precoAno1;

        if (maiorPreco < precoAno2) {
            maiorPreco = precoAno2;
        }

        if (maiorPreco < precoAno3) {
            maiorPreco = precoAno3;
        }

        return maiorPreco;

    }
}
