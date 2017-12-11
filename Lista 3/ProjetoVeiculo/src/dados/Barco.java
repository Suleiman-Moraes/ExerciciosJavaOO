package dados;

import interfaces.IVeiculo;


public class Barco extends Veiculo implements IVeiculo{
    //Construtor
    public Barco(){}
    public Barco(String cor, String modelo, float velociMaxima, int capacidade) {
        super(cor, modelo, velociMaxima, capacidade);
    }
    public Barco(Barco objeto) {
        super(objeto);
    }
    
    //Metodos

    @Override
    public String acelerar() throws Exception {
        return "Sua Embarcação do modelo "+modelo+", cor: "+cor+" està  se movimentando sobre alto mar";
    }

    @Override
    public String virar(String lado) throws Exception {
        if(!(lado.toLowerCase().equals("estibordo") || lado.toLowerCase().equals("bombordo")))throw new Exception("Comando inválido.");
        switch (lado.toLowerCase()){
            case "estibordo":
                return "Sua Embarcação do modelo "+modelo+", cor: "+cor+" està virando a estibordo sobre alto mar";
            case "bombordo":
                return "Sua Embarcação do modelo "+modelo+", cor: "+cor+" està virando a bombordo sobre alto mar";
            default:
                return "";
        }
    }

    @Override
    public String parar() throws Exception {
        return "Sua Embarcação do modelo "+modelo+", cor: "+cor+" està ancorada sobre alto mar";
    }
}
