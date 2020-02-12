public class main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        ContaCorrente conta1 = new ContaCorrente(cliente1,100.00,-50.00);
        ContaPoupanca conta2 = new ContaPoupanca(cliente1,150.00,2.30);

        System.out.println(("----------Conta Corrente--------------"));
    conta1.depositarDinheiro(20.00);
    conta1.depositarCheque(50.00);
    conta1.sacarDinheiro(140.00);

    System.out.println(("--------------Conta Poupança--------------"));
    conta2.depositarDinheiro(20.00);
    conta2.sacarDinheiro(160.00);
    conta2.recolherJuros();
    }
}
