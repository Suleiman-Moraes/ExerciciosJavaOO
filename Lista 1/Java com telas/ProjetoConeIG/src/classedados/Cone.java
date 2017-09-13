package classedados;
public class Cone {
    //Atributos
    private float raio = 0;
    private float altura = 0;
    
    //Metodos

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) throws Exception{
        this.raio = raio;
        if(raio < 0) throw new Exception ("Raio não pode ser negativo.");
        else if(raio == 0) throw new Exception ("Raio não pode ser igual à 'zero'.");
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) throws Exception {
        this.altura = altura;
        if(altura < 0) throw new Exception ("Altura não pode ser negativo.");
        else if(altura == 0) throw new Exception ("Altura não pode ser igual à 'zero'.");
    }
    
    public float caucularGeratriz(){
        return (float)(Math.sqrt(Math.pow(altura, 2)+Math.pow(raio, 2)));
    }
    public float caucularArealateral(){
        return (float)(3.1415*raio*caucularGeratriz());
    }
    public float caucularAreaTotal(){
        return (float)(3.1415*raio*(caucularGeratriz()+raio));
    }
    public float caucularVolume(){
        return (float)(1.0/3.0*3.1415*Math.pow(raio, 2)*altura);
    }
}
