package dados;
public class Cilindro {
    //Atributos
    private float raio = 0;
    private float altura = 0;
    
    //Metodos

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float caucularAreaLateral(){
        return (float)(2*3.1415*raio*altura);
    }
    public float caucularAreaTotal(){
        return (float)(2*3.1415*raio*(altura+raio));
    }
    public float caucularVolume(){
        return (float)(3.1415*raio*raio*altura);
    }
    
}
