package dados;
public class Retangulo {
    //Atributos
    private float comprimento = 0.0f;
    private float largura = 0.0f;
    
    //Metodos 
    public float getComprimento(){return comprimento;}
    public float getLargura(){return largura;}

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }
    
    public float caucularArea(){
        return (float)(largura*comprimento);
    }
    public float caucularPerimetro(){
        return (float)(largura*2+comprimento*2);
    }
    
}
