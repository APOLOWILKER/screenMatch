package praticeChallenge.carChallenge;

public class Test {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Sport");
        meuCarro.definirPrecos(35800,59600,80000);
        meuCarro.exibirInfo();
    }
}
