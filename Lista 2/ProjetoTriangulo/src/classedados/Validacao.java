package classedados;
public class Validacao {
    //Não permite numeros nem caracters especias, apenas letra e acentos
    //if(!validaCampoTexto(nome))
    public boolean validaCampoNumero(String text) {
    return text.matches("[.1234567890\\s]+");
    }
}
