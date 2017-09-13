package teste;
public class Validacao {
    //Não permite numeros nem caracters especias, apenas letra e acentos
    //if(!validaCampoTexto(nome))
    public boolean validaCampoTexto(String text) {
    return text.matches("[À-úa-zA-Z\\s]+"); //Passa para o método matches a regex
    //Se tiver número na string irá retornar falso
    //Note o uso de duas \\, uma sendo obrigatória para servir de caracter de escape
    }
    //Atributos
    private String nome = "";
    
    //Metodos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        this.nome = nome;
        //Objeto para validação do nome
        if(!validaCampoTexto(nome)) throw new Exception ("Não permitido números ou símbolos em 'Nome'.");
    }
}
