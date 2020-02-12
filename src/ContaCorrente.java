public class ContaCorrente {

    private Cliente cliente;
    private double saldo;
    private double chequeEspecial;

    public ContaCorrente(Cliente cliente, double saldo, double chequeEspecial) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
    }

    public void depositarDinheiro(double dinheiro){
        if (dinheiro > 0) {
            this.saldo += dinheiro;
            System.out.println("Depósito Realizado, seu saldo é " + saldo);
        } else {
            System.out.println("Valor Inválido");
        }
        setSaldo(saldo);
    }

    public void depositarCheque(double cheque){
        if (cheque > 0){
            this.saldo += cheque;
            System.out.println("Cheque Resgatado com Sucesso, Seu saldo é " + saldo);
        } else {
            System.out.println("Cheque Inválido");
        }
        setSaldo(saldo);
    }

    public void sacarDinheiro(double dinheiro){
        if (saldo < dinheiro) {
            this.saldo -= dinheiro ;
            System.out.println("Você utilizou seu cheque especial, seu saldo é " + saldo);
        } if (saldo >= dinheiro) {
            this.saldo -= dinheiro;
            System.out.println("Saque Realizado, seu saldo é "+ saldo);
        } if (saldo < chequeEspecial){
            System.out.println("Sem saldo de cheque especial");
        }
        setSaldo(saldo);
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getChequeEspecial() {
        return chequeEspecial;
    }
    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
}