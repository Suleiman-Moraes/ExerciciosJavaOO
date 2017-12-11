package dados;
public class Veiculo {
    //Atributos
    protected String cor = "";
    protected String modelo = "";
    protected float velociMaxima = 0;
    protected int capacidade = 0; 
    
    //Construtor
    public Veiculo(){}//Default
    public Veiculo(String cor, String modelo, float velociMaxima, int capacidade){
        this.cor = cor;
        this.modelo = modelo;
        this.velociMaxima = velociMaxima;
        this.capacidade = capacidade;
    }
    public Veiculo(Veiculo objeto){
        this.cor = objeto.cor;
        this.modelo = objeto.modelo;
        this.velociMaxima = objeto.velociMaxima;
        this.capacidade = objeto.capacidade;
    }
    
    //Metodos

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public float getVelociMaxima() {
        return velociMaxima;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelociMaxima(float velociMaxima) {
        this.velociMaxima = velociMaxima;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}
