package classedados;
public class Funcionario {
    //Atributos
    private String nome = "";
    private float salario = 0;
    private int numeroDeFilhos = 0;
    
    //Metodos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        this.nome = nome;
        //Objeto para validação do nome
        Validacao pegaLadrao = new Validacao();
        if(!pegaLadrao.validaCampoTexto(nome)) throw new Exception ("Não permitido números ou símbolos em 'Nome'.");
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) throws Exception {
        this.salario = salario;
        if(salario < 0) throw new Exception ("Salário não pode ser negativo.");
    }
    public int getNumeroDeFilhos() {
        return numeroDeFilhos;
    }

    public void setNumeroDeFilhos(int numeroDeFilhos) throws Exception {
        this.numeroDeFilhos = numeroDeFilhos;
        if(numeroDeFilhos < 0) throw new Exception ("'Número de filhos' não pode ser negativo.");
    }

    public float caucularAumentoSalarial(float aumento)throws Exception{
        salario = (float)((aumento/100.0+1)*salario);
        return salario;
    }
    public float caucularINSS(){
        if(salario <= 2545) return (float)(salario*6.0/100);
        else return (float)(salario * 10.0 / 100);
    }
    public float caucularParcelaIRPF(){
        float parcela = 0;
        if(salario<=1903.98) parcela = 0;
        else if(salario<=2826.65) parcela = (float)7.5;
        else if(salario<=3751.05) parcela = 15;
        else if(salario<=4664.68) parcela = (float)22.5;
        else parcela = (float)27.5;
        return (float)(salario*parcela/100.0);
    }
    public float caucularMensalIRPF(){
        float conta = caucularParcelaIRPF()-(545*numeroDeFilhos);
        if(conta<=0) return 0;
        else return conta;
    }  

}
