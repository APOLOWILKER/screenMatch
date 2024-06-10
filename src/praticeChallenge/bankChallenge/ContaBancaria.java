package praticeChallenge.bankChallenge;

public class ContaBancaria {
    protected double saldo; // não quero que ninguem altere o valor

    public void depositar(double value) {
        saldo += value;
        System.out.println("Depósito de " + value + " realizado. Saldo atual: " + saldo);
    }

    public void sacar(double value) {
        if (value <= saldo) {
            saldo -= value;
            System.out.println("Saque de " + value + " realizado. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Seu Sando é de: " + saldo);
    }

}
