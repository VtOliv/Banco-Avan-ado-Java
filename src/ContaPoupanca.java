public class ContaPoupanca {

    private Cliente cliente;
    private double saldo;
    private double taxaDeJuros;

    public ContaPoupanca(Cliente cliente, double saldo, double taxaDeJuros) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.taxaDeJuros = taxaDeJuros;
    }

    public void depositarDinheiro(double dinheiro){
        if (dinheiro > 0){
            this.saldo += dinheiro;
            System.out.println(" Depósito Realizado, seu saldo é " + saldo);
    } else {
        System.out.println( " Valor Inválido !");
        }
        setSaldo(saldo);
    }

    public  void sacarDinheiro(double dinheiro){
        if (saldo >= dinheiro){
            this.saldo -= dinheiro;
            System.out.println("Saque Realizado, Seu saldo é " + saldo);
        } else {
            System.out.println("Saldo Insulficiente !");
        }
        setSaldo(saldo);
    }

    public void recolherJuros(){
        this.saldo += saldo * taxaDeJuros / 100;
        System.out.println("Juros Aplicados, Seu saldo é " + saldo);
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
    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }
    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

}
