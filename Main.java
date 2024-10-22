// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente(1000, 500);
        contaCorrente.deposito(200);
        contaCorrente.saque(1200); // Deve permitir, saldo + limite
        System.out.println("Saldo da Conta Corrente: " + contaCorrente.consulta());

        Conta contaPoupanca = new ContaPoupanca(1000);
        contaPoupanca.deposito(200);
        contaPoupanca.saque(1200); // Não deve permitir
        System.out.println("Saldo da Conta Poupança: " + contaPoupanca.consulta());
    }
}