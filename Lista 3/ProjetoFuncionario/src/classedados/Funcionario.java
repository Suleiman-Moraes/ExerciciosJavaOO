package classedados;
public class Funcionario {
    //Atributos
    protected String nomeDoCooperado = "";
    protected String profissaoDoCooperado = "";
    protected float numerosDeHorasTrabalhadasNoMes = 0;
    protected float valorDaHoraDeTrabalho = 0;
    protected float salarioDoMes = 0;
    protected int numeroDeFilhos = 0;
    
    //Construtor
    public Funcionario(){}
    public Funcionario(String nomeDoCooperado, String profissaoDoCooperado, float numerosDeHorasTrabalhadasNoMes, float valorDaHoraDeTrabalho, float salarioDoMes, int numeroDeFilhos) throws Exception{
        if(valorDaHoraDeTrabalho < 0) throw new Exception ("Valor da hora de trabalho não pode ser negativo.");
        if(valorDaHoraDeTrabalho == 0) throw new Exception ("Valor da hora de trabalho não pode ser 'zero'.");
        if(numerosDeHorasTrabalhadasNoMes <= 160) throw new Exception ("Número de horas trabalhadas não podem ser inferior à '160 horas'.");
        if(salarioDoMes <= 0) throw new Exception ("Salário do mês não pode ser negativo nem igual a zero.");
        if(numeroDeFilhos < 0) throw new Exception ("Número de filhos do mês não pode ser negativo.");
        this.nomeDoCooperado = nomeDoCooperado;
        this.profissaoDoCooperado = profissaoDoCooperado;
        this.numerosDeHorasTrabalhadasNoMes = numerosDeHorasTrabalhadasNoMes;
        this.valorDaHoraDeTrabalho = valorDaHoraDeTrabalho;
        this.salarioDoMes = salarioDoMes;
        this.numeroDeFilhos = numeroDeFilhos;
    }
    public Funcionario(Funcionario objeto) throws Exception{
        if(valorDaHoraDeTrabalho < 0) throw new Exception ("Valor da hora de trabalho não pode ser negativo.");
        if(valorDaHoraDeTrabalho == 0) throw new Exception ("Valor da hora de trabalho não pode ser 'zero'.");
        if(numerosDeHorasTrabalhadasNoMes <= 160) throw new Exception ("Número de horas trabalhadas não podem ser inferior à '160 horas'.");
        if(salarioDoMes <= 0) throw new Exception ("Salário do mês não pode ser negativo nem igual a zero.");
        if(numeroDeFilhos < 0) throw new Exception ("Número de filhos do mês não pode ser negativo.");
        this.nomeDoCooperado = objeto.nomeDoCooperado;
        this.profissaoDoCooperado = objeto.profissaoDoCooperado;
        this.numerosDeHorasTrabalhadasNoMes = objeto.numerosDeHorasTrabalhadasNoMes;
        this.valorDaHoraDeTrabalho = objeto.valorDaHoraDeTrabalho;
        this.salarioDoMes = objeto.salarioDoMes;
        this.numeroDeFilhos = objeto.numeroDeFilhos;
    }
    
    //Metodos

    public String getNomeDoCooperado() {
        return nomeDoCooperado;
    }

    public String getProfissaoDoCooperado() {
        return profissaoDoCooperado;
    }

    public float getNumerosDeHorasTrabalhadasNoMes() {
        return numerosDeHorasTrabalhadasNoMes;
    }

    public float getValorDaHoraDeTrabalho() {
        return valorDaHoraDeTrabalho;
    }

    public float getSalarioDoMes() {
        return salarioDoMes;
    }

    public int getNumeroDeFilhos() {
        return numeroDeFilhos;
    }

    public void setNomeDoCooperado(String nomeDoCooperado) {
        this.nomeDoCooperado = nomeDoCooperado;
    }

    public void setProfissaoDoCooperado(String profissaoDoCooperado) {
        this.profissaoDoCooperado = profissaoDoCooperado;
    }

    public void setNumerosDeHorasTrabalhadasNoMes(float numerosDeHorasTrabalhadasNoMes) throws Exception{
        this.numerosDeHorasTrabalhadasNoMes = numerosDeHorasTrabalhadasNoMes;
        if(this.numerosDeHorasTrabalhadasNoMes <= 160) throw new Exception ("Número de horas trabalhadas não podem ser inferior à '160 horas'."); 
    }

    public void setValorDaHoraDeTrabalho(float valorDaHoraDeTrabalho) throws Exception{
        this.valorDaHoraDeTrabalho = valorDaHoraDeTrabalho;
        if(this.valorDaHoraDeTrabalho < 0) throw new Exception ("Valor da hora de trabalho não pode ser negativo.");
        if(this.valorDaHoraDeTrabalho == 0) throw new Exception ("Valor da hora de trabalho não pode ser 'zero'.");
    }
    
    public void setSalarioDoMes(float salarioDoMes) throws Exception {
        if(salarioDoMes <= 0) throw new Exception ("Salário do mês não pode ser negativo nem igual a zero.");
        this.salarioDoMes = salarioDoMes;
    }

    public void setNumeroDeFilhos(int numeroDeFilhos) throws Exception {
        if(numeroDeFilhos < 0) throw new Exception ("Número de filhos do mês não pode ser negativo.");
        this.numeroDeFilhos = numeroDeFilhos;
    }
}
