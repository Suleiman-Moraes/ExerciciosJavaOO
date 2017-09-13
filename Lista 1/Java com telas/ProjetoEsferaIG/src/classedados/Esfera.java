package classedados;
public class Esfera {
    //Atributos
    private float raio=0;
    
    //Métodos
    public void setRaio(float raioE) throws Exception{
        if(raioE<0) throw new Exception("Raio não pode ser negativo.");
        else if(raioE==0) throw new Exception("Raio não pode ser zero.");
        raio = raioE;
    }
    
    public float getRaio(){return raio;}
    
    public float CaucularArea(){return (float)(4*3.1415*Math.pow(raio, 2));}
    public float CaucularVolume(){return (float)((4/3)*3.1415*Math.pow(raio, 3));}

    public void setRaio(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
