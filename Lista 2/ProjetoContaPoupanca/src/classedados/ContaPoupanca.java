package classedados;
import classedados.Validacao;
public class ContaPoupanca {
    private String nomeDoCliente = "";
    private int numeroDaConta = 0;
    private int agencia = 0;
    private float saldo = 0;
    
    //Metodos

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) throws Exception {
        this.nomeDoCliente = nomeDoCliente;
        Validacao pegaLadrao = new Validacao();
        if(!pegaLadrao.validaCampoTexto(nomeDoCliente)) throw new Exception ("Não permitido números ou símbolos em 'Nome'.");
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
    public float sacarDinheiro(float sacar)throws Exception{
        if(sacar<0) throw new Exception ("Impossível sacar um valor negatico.");
        
        else if(sacar<=saldo) saldo = saldo - sacar;
        
        else throw new Exception ("Saldo insuficiente.");
        return saldo;
    }
    public float depositarDinheiro(float depositar) throws Exception{ 
        if(depositar<0) throw new Exception ("Impossível depositar um valor negativo.");
        
        else saldo = saldo + depositar;
        return saldo;
    }
}
