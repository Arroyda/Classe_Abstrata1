// Classe ContaCorrente
class ContaCorrente extends ContaBancaria {
    private static final double TAXA_SAQUE = 0.05; // 5%
    private static final double TAXA_DEPOSITO = 0.02; // 2%
    private double limite;

    public ContaCorrente(double saldoInicial, double limite) {
        super(saldoInicial);
        this.limite = limite;
    }

    @Override
    public void saque(double valor) {
        double totalSaque = valor + (valor * TAXA_SAQUE);
        if (totalSaque <= saldo + limite) {
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
