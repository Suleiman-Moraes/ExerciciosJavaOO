package classedados;
public class Cilindro {
    //Atributos
    private float raio = 0;
    private float altura = 0;
    
    //Metodos

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) throws Exception {
        this.raio = raio;
        if(raio<0) throw new Exception ("Raio não pode ser menor que 'zero'.");
        else if(raio==0)throw new Exception("Raio não pode ser igual a 'zero'.");
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception {
        this.altura = altura;
        if(altura<0) throw new Exception ("Altura não pode ser menor que 'zero'.");
        else if(altura==0)throw new Exception("Altura não pode ser igual a 'zero'.");
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
