package interfaces;
public interface IFuncionario {
    String caucularAumentoSalarial(float aumento) throws Exception;
    float caucularINSS();
    float caucularParcelaIRPF();
    float caucularMensalIRPF();
    float caucularSalarioLiquido();
    float caucularBonificacao();
    int caucularContribuicao();
    float caucularSalarioFinal();
}
