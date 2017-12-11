package dados;

import interfaces.IVeiculo;


public class Aviao extends Veiculo implements IVeiculo{
    //Construtor
    public Aviao(){}
    public Aviao(String cor, String modelo, float velociMaxima, int capacidade) {
        super(cor, modelo, velociMaxima, capacidade);
    }
    public Aviao(Aviao objeto) {
        super(objeto);
    }
    
    //Metodos
    
    @Override
    public String acelerar() throws Exception {
        return "Sua Aeronave do modelo "+modelo+", cor: "+cor+" està  se movimentando sobre o ar";
    }

    @Override
    public String virar(String lado) throws Exception {
        if(!(lado.toLowerCase().equals("direita") || lado.toLowerCase().equals("esquerda")))throw new Exception("Comando inválido.");
        switch (lado.toLowerCase()){
            case "direita":
                return "Sua Aeronave do modelo "+modelo+", cor: "+cor+" està virando a direita sobre o ar";
            case "esquerda":
                return "Sua Aeronave do modelo "+modelo+", cor: "+cor+" està virando a esquerda sobre o ar";
            default:
                return "";
        }
    }

    @Override
    public String parar() throws Exception {
        return "Sua Aeronave do modelo "+modelo+", cor: "+cor+" pousou sobre terra";
    }
}
