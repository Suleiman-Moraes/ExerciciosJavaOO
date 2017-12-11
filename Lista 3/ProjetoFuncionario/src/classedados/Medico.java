package classedados;

import interfaces.IFuncionario;


public class Medico extends Funcionario implements IFuncionario{
    //Construtor
    public Medico(){}
    public Medico(String nomeDoCooperado, String profissaoDoCooperado, float numerosDeHorasTrabalhadasNoMes, float valorDaHoraDeTrabalho, float salarioDoMes, int numeroDeFilhos) throws Exception {
        super(nomeDoCooperado, profissaoDoCooperado, numerosDeHorasTrabalhadasNoMes, valorDaHoraDeTrabalho, salarioDoMes, numeroDeFilhos);
    }
    public Medico(Medico objeto) throws Exception {
        super(objeto);
    }
    
    //Metodos
    
    @Override
    public String caucularAumentoSalarial(float aumento) throws Exception {
        if(aumento < 0)throw new Exception("Aumento não pode ser negativo");
        String ajuste = "";//Variavel de retorno
        float conta = (float)((aumento/100.0+1)*salarioDoMes);
        ajuste = "Salario com aumento: R$"+conta;
        conta = aumento * salarioDoMes /100;
        ajuste += "\nValor do aumento: R$"+conta;
        if(aumento!=0) salarioDoMes = (float)((aumento/100.0+1)*salarioDoMes);
        return ajuste;
    }

    @Override
    public float caucularINSS() {
        if(salarioDoMes <= 2545) return (float)(salarioDoMes*6.0/100);
        else return (float)(salarioDoMes * 10.0 / 100);
    }

    @Override
    public float caucularParcelaIRPF() {
        float parcela = 0;
        if(salarioDoMes<=1903.98) parcela = 0;
        else if(salarioDoMes<=2826.65) parcela = (float)7.5;
        else if(salarioDoMes<=3751.05) parcela = 15;
        else if(salarioDoMes<=4664.68) parcela = (float)22.5;
        else parcela = (float)27.5;
        return (float)(salarioDoMes*parcela/100.0);
    }

    @Override
    public float caucularMensalIRPF() {
        float conta = caucularParcelaIRPF()-(545*numeroDeFilhos);
        if(conta<=0) return 0;
        else return conta;
    }

    @Override
    public float caucularSalarioLiquido() {
        return (float)((numerosDeHorasTrabalhadasNoMes * valorDaHoraDeTrabalho) + caucularBonificacao());
    }

    @Override
    public float caucularBonificacao() {
        int bom = 0;
        if(numerosDeHorasTrabalhadasNoMes < 300) bom = 0;
            else if(300 <= numerosDeHorasTrabalhadasNoMes && numerosDeHorasTrabalhadasNoMes < 500) bom = 20;
            else bom = 25;
        return (float)((numerosDeHorasTrabalhadasNoMes * valorDaHoraDeTrabalho) * (bom/100.0));
    }

    @Override
    public int caucularContribuicao() {
        return 11;
    }

    @Override
    public float caucularSalarioFinal() {
        return (float)((caucularContribuicao()/-100.0 +1) * caucularSalarioLiquido());
    }
}
