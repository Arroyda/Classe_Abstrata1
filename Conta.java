// Classe base Conta
abstract class Conta {
    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void saque(double valor);
    public abstract void deposito(double valor);
    public abstract double consulta();
}