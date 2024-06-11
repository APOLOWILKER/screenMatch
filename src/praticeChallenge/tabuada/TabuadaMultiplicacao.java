package praticeChallenge.tabuada;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int numero) {
        System.out.println("Tabuada de multiplicação do " + numero);
        for (int i = 1; i <= 10; i ++) {
            int resultado = numero * i;
            String linha = String.format("%3d x %2d = %4d", numero, i, resultado);
//            System.out.println("\n" + numero + " x " + i + " = " + resultado);
            System.out.println(linha);
        }
    }
}
