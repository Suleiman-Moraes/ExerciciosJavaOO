package classedados;
public class Eleitor {
    //Atributos
    private String nome = "";
    private int anoDeNascimento = 0;
    
    //Metodos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        this.nome = nome;
        if(!matchesOnlyText(nome)) throw new Exception ("Não permitido no 'NOME' símbolos ou números.");
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) throws Exception {
        this.anoDeNascimento = anoDeNascimento;
        if(anoDeNascimento < 0) throw new Exception ("Ano De Nascimento não pode ser negativo.");
        else if(anoDeNascimento == 0) throw new Exception ("Ano De Nascimento não pode ser igual à 'zero'.");
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
    public boolean matchesOnlyText(String text) {
    return text.matches("[À-úa-zA-Z\\s]+"); //Passa para o método matches a regex
    //Se tiver número na string irá retornar falso
    //Note o uso de duas \\, uma sendo obrigatória para servir de caracter de escape
    }
    
}
