package dados;
public class Funcionario {
    //Atributos
    private String nome = "";
    private float salario = 0;
    private int numeroDeFilhos = 0;
    
    //Metodos

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }
    /**
     * @return the numeroDeFilhos
     */
    public int getNumeroDeFilhos() {
        return numeroDeFilhos;
    }

    /**
     * @param numeroDeFilhos the numeroDeFilhos to set
     */
    public void setNumeroDeFilhos(int numeroDeFilhos) {
        this.numeroDeFilhos = numeroDeFilhos;
    }

    public String caucularAumentoSalarial(float aumento){
        String ajuste = "";//Variavel de retorno
        float conta = (float)((aumento/100.0+1)*salario);
        ajuste = "Salario com aumento: R$"+conta;
        conta = aumento * salario /100;
        ajuste += "\nValor do aumento: R$"+conta;
        if(aumento!=0) salario = (float)((aumento/100.0+1)*salario);
        return ajuste;
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
