package dados;
public class Eleitor {
    //Atributos
    private String nome = "";
    private int anoDeNascimento = 0;
    
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
     * @return the anoDeNascimento
     */
    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    /**
     * @param anoDeNascimento the anoDeNascimento to set
     */
    public void setAnoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }
    
    public String caucularTipoDeEleitor(){
        String tipo="";//Variavel de retorno
        int x = 2017 - anoDeNascimento; //x == idade
        if(x<16) tipo="Não Eleitor.";
        else if (x<18) tipo = "Eleitor facultativo.";
        else if(x<=65) tipo = "Eleitor obrigatório.";
        else tipo = "Eleitor facultativo.";
        return tipo;    
    }
}
