public class Cliente {

    private int numeroCliente;
    private String sobrenome;
    private String cpf;
    private String rg;

    public Cliente (){

    }

    public Cliente(int numeroCliente, String sobrenome, String cpf, String rg) {
        this.numeroCliente = numeroCliente;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.rg = rg;
    }
}
