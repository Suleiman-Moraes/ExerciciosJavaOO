package classedados;

import interfaces.IConta;

public class ContaCorrenteSimples extends Conta implements IConta{
    //Atributos
    protected float taxaDeManutencaoDeConta = 0;
    
    //Construtor

    public ContaCorrenteSimples(){}
    public ContaCorrenteSimples(String nomeDoCliente, int numeroDaConta, int agencia, float saldo, float taxaDeManutencaoDeConta) throws Exception {
        super(nomeDoCliente, numeroDaConta, agencia, saldo);
        if(taxaDeManutencaoDeConta < 0) throw new Exception ("'Taxa de manutencao da conta' não pode ser negativo.");
        this.taxaDeManutencaoDeConta = taxaDeManutencaoDeConta;
    }
    public ContaCorrenteSimples(ContaCorrenteSimples objeto) throws Exception {
        super(objeto);
        if(taxaDeManutencaoDeConta < 0) throw new Exception ("'Taxa de manutencao da conta' não pode ser negativo.");
        this.taxaDeManutencaoDeConta = objeto.taxaDeManutencaoDeConta;
    }
    
    //Metodos

    public float getTaxaDeManutencaoDeConta() {
        return taxaDeManutencaoDeConta;
    }

    public void setTaxaDeManutencaoDeConta(float taxaDeManutencaoDeConta) throws Exception {
        if(taxaDeManutencaoDeConta < 0) throw new Exception ("'Taxa de manutencao da conta' não pode ser negativo.");
        this.taxaDeManutencaoDeConta = taxaDeManutencaoDeConta;
    }
    @Override
    public float sacarDinheiro(float sacar)throws Exception{
        if(sacar<0) throw new Exception ("Impossível sacar um valor negatico.");
        
        if(sacar <= (float)saldo*(1 - taxaDeManutencaoDeConta/100.0)) saldo = ((float) (saldo*(1 - taxaDeManutencaoDeConta/100.0) - sacar));
        
        else throw new Exception ("Saldo insuficiente.");
        return saldo;
    }
    @Override
    public float depositarDinheiro(float depositar) throws Exception{ 
        if(depositar<0) throw new Exception ("Impossível depositar um valor negativo.");
        
        else saldo = (float) (saldo*(1 - taxaDeManutencaoDeConta/100.0) + depositar);
        return saldo;
    }
}
