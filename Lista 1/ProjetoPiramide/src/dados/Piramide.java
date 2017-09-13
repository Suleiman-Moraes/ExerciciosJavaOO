package dados;

public class Piramide {
    //Atributos
    private int base=0;
    private int altura=0;
   
    //Metodos
    public void setBase(int baseP){base = baseP;}
    public void setAltura(int alturaP){altura = alturaP;}
    
    public int getBase(){return base;}
    public int getAltura(){return altura;}
    
    public int calcularVolume(){return (1/3 * base * altura);}
}
