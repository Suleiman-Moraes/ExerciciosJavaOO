package classedados;

public class Conta {
    //Atibutos
    protected String nomeDoCliente = "";
    protected int numeroDaConta = 0;
    protected int agencia = 0;
    protected float saldo = 0;

    //Construtor
    public Conta(){}//Default
    public Conta(String nomeDoCliente, int numeroDaConta, int agencia, float saldo) throws Exception{
        if(numeroDaConta < 0) throw new Exception ("'Número da conta' não pode ser negativo.");
        if(agencia < 0) throw new Exception ("'Agência' não pode ser negativo.");
        this.nomeDoCliente = nomeDoCliente;
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }
    public Conta(Conta objeto) throws Exception{
        if(numeroDaConta < 0) throw new Exception ("'Número da conta' não pode ser negativo.");
        if(agencia < 0) throw new Exception ("'Agência' não pode ser negativo.");
        this.nomeDoCliente = objeto.nomeDoCliente;
        this.numeroDaConta = objeto.numeroDaConta;
        this.agencia = objeto.agencia;
        this.saldo = objeto.saldo;
    }

    //Metodos

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) throws Exception {
        this.numeroDaConta = numeroDaConta;
        if(numeroDaConta < 0) throw new Exception ("'Número da conta' não pode ser negativo.");
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) throws Exception {
        this.agencia = agencia;
        if(agencia < 0) throw new Exception ("'Agência' não pode ser negativo.");
    }

    public float getSaldo() {
        return saldo;
    }
}
