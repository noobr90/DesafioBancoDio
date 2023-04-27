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

    
}
