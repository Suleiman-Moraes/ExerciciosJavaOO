package classedados;
import interfacejava.TelaPincipal;
public class Paciente {
    //Atributos
    private String nome = "";
    private float peso = 0;
    private float altura = 0;
    
    //Metodos
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        this.nome = nome;
        if(!matchesOnlyText(nome)) throw new Exception ("Não permitido no NOME símbolos ou números.");
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) throws Exception {
        this.peso = peso;
        if(peso < 0) throw new Exception ("Peso não pode ser negativo.");
        else if(peso == 0) throw new Exception ("Peso não pode ser igual à 'zero'.");
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception {
        this.altura = altura;
        if(altura < 0) throw new Exception ("Altura não pode ser negativo.");
        else if(altura == 0) throw new Exception ("Altura não pode ser igual à 'zero'.");
    }
    
    public float caucularIMC(){
        return (float)(peso/(Math.pow(altura,2)));
    }
    public String caucularFaixaDoPeso(){
        String peso="";//Variavel de retorno
        if(caucularIMC()<20) peso="Abaixo do peso ideal.";
        else if (caucularIMC()<=25) peso ="Peso normal.";
        else if(caucularIMC()<=30) peso="Excesso de peso.";
        else if(caucularIMC()<=35) peso ="Obesidade.";
        else peso ="Obesidade mórbida.";
        return peso;
    }
    public boolean matchesOnlyText(String text) {
    return text.matches("[À-úa-zA-Z\\s]+"); //Passa para o método matches a regex
    //Se tiver número na string irá retornar falso
    //Note o uso de duas \\, uma sendo obrigatória para servir de caracter de escape
    }
}
