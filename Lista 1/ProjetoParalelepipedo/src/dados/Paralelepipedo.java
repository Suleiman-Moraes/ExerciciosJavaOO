package dados;
public class Paralelepipedo {
    //Atributos
    private float altura = 0;
    private float largura = 0;
    private float comprimento = 0;
    
    //Metodos

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
    
    public float caucularVolume(){
        return (altura*comprimento*largura);
    }
    public float caucularArea(){
        return (float)(2.0*(altura*largura+altura*comprimento+largura*comprimento));
    }
}
