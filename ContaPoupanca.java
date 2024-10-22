// Classe ContaPoupanca
class ContaPoupanca extends ContaBancaria {
    private static final double TAXA_SAQUE = 0.03; // 3%
    private static final double TAXA_DEPOSITO = 0.01; // 1%

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void saque(double valor) {
        double totalSaque = valor + (valor * TAXA_SAQUE);
        if (totalSaque <= saldo) {
            saldo -= totalSaque;
        } else {
            System.out.println("Saque não permitido. Saldo insuficiente.");
        }
    }

    @Override
    public void deposito(double valor) {
        saldo += valor - (valor * TAXA_DEPOSITO);
    }

    @Override
    public double consulta() {
        return saldo;
    }
}