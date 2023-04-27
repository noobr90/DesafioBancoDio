import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        contaCorrente novaConta = new contaCorrente();
        contaPoupanca novaPoupanca = new contaPoupanca();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do titular da conta: ");
        String nome = sc.nextLine();
        novaConta.setTitular(nome);

        System.out.println("Digite a agencia: ");
        String agencia = sc.nextLine();
        novaConta.setAgencia(agencia);

        System.out.println("Digite a conta: ");
        String conta = sc.nextLine();
        novaConta.setConta(conta);

        System.out.println("Digite o saldo inical a ser depositado: ");
        double saldoM = sc.nextDouble();
        novaConta.depositar(saldoM);
        

        novaConta.dadosConta();
        
        
        
        

    }

    
}
