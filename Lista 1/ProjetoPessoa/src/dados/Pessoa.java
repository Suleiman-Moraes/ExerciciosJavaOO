package dados;

public class Pessoa {
    //Atributos
    private String nome = "";
    private int peso = 0;
    private float altura = 0;
    private String sexo = "";
    
    //Métodos
    
    public String getNome(){ return nome; }
    public int getPeso(){ return peso; }
    public float getAltura(){ return altura; }
    public String getSexo(){ return sexo; }
    
    public void setNome(String nomeP){ nome = nomeP;}
    public void setPeso(int pesoP)throws Exception{
        if(pesoP<0) throw new Exception("Peso não pode ser < 0");
        peso = pesoP;
    }
    public void setAltura(float alturaP)throws Exception{ 
        if(alturaP<0) throw new Exception("Altura não pode ser < 0");
        altura = alturaP;
    }
    public void setSexo(String sexoP){ sexo = sexoP;}
    
    public float caucularIMC()throws Exception{ 
        if(altura==0) throw new Exception("Altura não pode ser zero");
        return (peso/(altura*altura));
    }
}