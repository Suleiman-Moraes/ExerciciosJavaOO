package dados;
public class Paciente {
    //Atributos
    private String nome = "";
    private float peso = 0;
    private float altura = 0;
    
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
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
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
}
