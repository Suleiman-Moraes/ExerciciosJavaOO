package classedados;
public class Paralelepipedo {
    //Atributos
    private float altura = 0;
    private float largura = 0;
    private float comprimento = 0;
    
    //Metodos

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception{
        this.altura = altura;
        if(altura<0) throw new Exception ("Altura não pode ser menor que 'zero'.");
        else if(altura==0)throw new Exception("Altura não pode ser igual a 'zero'.");
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) throws Exception{
        this.largura = largura;
        if(largura < 0) throw new Exception("Largura não pode ser menor que 'zero'.");
        else if(largura == 0)throw new Exception("Largura não pode ser igual a 'zero'.");
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) throws Exception{
        this.comprimento = comprimento;
        if(comprimento < 0) throw new Exception ("Comprimento não pode ser menor que 'zero'. ");
        else if(comprimento == 0) throw new Exception ("Comprimento não pode ser igual a 'zero'.");
    }
    
    public float caucularVolume(){
        return (altura*comprimento*largura);
    }
    public float caucularArea(){
        return (float)(2.0*(altura*largura+altura*comprimento+largura*comprimento));
    }
}
