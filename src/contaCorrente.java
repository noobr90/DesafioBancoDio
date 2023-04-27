public class contaCorrente extends banco{

    double saldo;

    


    @Override
    public void sacar(double valorSaque) {
    atualizaSaldo(-valorSaque);
        
    }

    @Override
    public void depositar( double valorDeposito) {
        atualizaSaldo(valorDeposito);
       
    }

    @Override
    public void atualizaSaldo(double saldoAtualizacao){
        saldo = saldo + saldoAtualizacao;
      
    }
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void transferencia(double valorTransferencia, banco contaDestino) {
        this.sacar(valorTransferencia);
        contaDestino.depositar(valorTransferencia);
    }

    public void dadosConta(){
        System.out.println("Nome: "+super.getTitular());
        System.out.println("Agencia: "+super.getAgencia());
        System.out.println("Conta: "+super.getConta());
        System.out.println("Saldo em conta: "+contaCorrente.getSaldo(saldo));
    }
}
