package classedados;


public class ContaCorrenteComLimite extends ContaCorrenteSimples {
    //Atributos
    private float limiteDaConta = 0;
    
    //Contrutor
    public ContaCorrenteComLimite(){}
    public ContaCorrenteComLimite(String nomeDoCliente, int numeroDaConta, int agencia, float saldo, float taxaDeManutencaoDeConta, float limiteDaConta) throws Exception {
        super(nomeDoCliente, numeroDaConta, agencia, saldo, taxaDeManutencaoDeConta);
        if(limiteDaConta <= 0) throw new Exception ("'Limite da conta' não pode ser negativo nem igual a zero.");
        this.limiteDaConta = limiteDaConta;
    }
    public ContaCorrenteComLimite(ContaCorrenteComLimite objeto) throws Exception {
        super(objeto);
        if(limiteDaConta <= 0) throw new Exception ("'Limite da conta' não pode ser negativo nem igual a zero.");
        this.limiteDaConta = objeto.limiteDaConta;
    }
    
    //Metodos
    
    public float getLimiteDaConta() {
        return limiteDaConta;
    }

    public void setLimiteDaConta(float limiteDaConta) throws Exception {
        if(limiteDaConta <= 0) throw new Exception ("'Limite da conta' não pode ser negativo nem igual a zero.");
        this.limiteDaConta = limiteDaConta;
    }
    
    @Override
    public float depositarDinheiro(float depositar) throws Exception{ 
        if(depositar<0) throw new Exception ("Impossível depositar um valor negativo.");
        if (((float) (saldo*(1 - taxaDeManutencaoDeConta/100.0) + depositar)) > limiteDaConta) throw new Exception("Excedido limite de saldo da sua conta corrente.");
        
        else saldo = (float) (saldo*(1 - taxaDeManutencaoDeConta/100.0) + depositar);
        return saldo;
    }
}
