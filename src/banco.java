public abstract class banco {
    private String conta;
    private String agencia;
    private String titular;
    private double saldo;

    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo(double saldo) {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   

    public abstract void sacar(double valorSaque);
    public abstract void depositar(double valorSaque);
    public abstract void atualizaSaldo(double saldoAtualizacao);
    public abstract void transferencia(double valorTransferencia, banco contaDestino);
    
    

}
