package classedados;
public class Retangulo {
    //Atributos
    private float comprimento = 0.0f;
    private float largura = 0.0f;
    
    //Metodos 
    public float getComprimento(){return comprimento;}
    public float getLargura(){return largura;}

    public void setComprimento(float comprimento) throws Exception {
        this.comprimento = comprimento;
        if(comprimento<0) throw new Exception("Comprimento não pode ser negativo.");
        else if(comprimento==0) throw new Exception("Comprimento não pode ser zero.");
    }

    public void setLargura(float largura) throws Exception {
        this.largura = largura;
        if(largura<0) throw new Exception("Largura não pode ser negativo.");
        else if(largura==0) throw new Exception("Largura não pode ser zero.");
    }
    
    public float caucularArea(){
        return (float)(largura*comprimento);
    }
    public float caucularPerimetro(){
        return (float)(largura*2+comprimento*2);
    }
}
