package praticeChallenge.bankChallenge;

public class ContaCorrente extends ContaBancaria{
    double tarifa = 41.9;
    public void cobraTarifaMensal() {
        saldo -= tarifa;
        System.out.println("Tarifa mensal de " + tarifa + " cobrada. Saldo atual: " + saldo);
    }
}
