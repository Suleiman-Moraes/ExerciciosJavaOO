package classedados;

import interfaces.IConta;

public class ContaPoupanca extends Conta implements IConta{
    //Construtor
    public ContaPoupanca(){}
    public ContaPoupanca(String nomeDoCliente, int numeroDaConta, int agencia, float saldo) throws Exception {
        super(nomeDoCliente, numeroDaConta, agencia, saldo);}
    public ContaPoupanca(ContaPoupanca objeto) throws Exception{super(objeto);}
    
    //Metodos
    @Override
    public float sacarDinheiro(float sacar)throws Exception{
        if(sacar<0) throw new Exception ("Impossível sacar um valor negatico.");
        
        else if(sacar<=saldo) saldo = saldo - sacar;
        
        else throw new Exception ("Saldo insuficiente.");
        return saldo;
    }
    @Override
    public float depositarDinheiro(float depositar) throws Exception{ 
        if(depositar<0) throw new Exception ("Impossível depositar um valor negativo.");
        
        else saldo = saldo + depositar;
        return saldo;
    }
}
