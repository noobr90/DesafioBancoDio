import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        contaCorrente novaConta = new contaCorrente();
        contaPoupanca novaPoupanca = new contaPoupanca();

        novaConta.depositar(1000);
        //novaConta.sacar(432);
        novaConta.depositar(1000);
        novaConta.transferencia(1000, novaPoupanca);
        novaPoupanca.transferencia(100, novaConta);

        System.out.println(novaConta.getSaldo());
        System.out.println(novaPoupanca.getSaldo());
    }
}
