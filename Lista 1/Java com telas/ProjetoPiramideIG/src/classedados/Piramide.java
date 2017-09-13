package classedados;
public class Piramide {
    //Atributos
    private float base = 0;
    private float altura = 0;
    
    //Metodos

    public float getBase() {
        return base;
    }

    public void setBase(float base) throws Exception{
        if(base<0) throw new Exception("Base não pode ser negativa");
        else if(base==0) throw new Exception("Base não pode ser zero");
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception{
        if(altura<0) throw new Exception("Altura não pode ser negativa");
        else if(altura==0) throw new Exception("Altura não pode ser zero");
        this.altura = altura;
    }
    
    public float caucularVolume(){
        return (float)(1.0/3.0*base*altura);
    }
}
