package dados;

import interfaces.IVeiculo;

public class Automovel extends Veiculo implements IVeiculo{
    //Construtor
    public Automovel(){}
    public Automovel(String cor, String modelo, float velociMaxima, int capacidade) {super(cor, modelo, velociMaxima, capacidade);}
    public Automovel(Automovel objeto){super(objeto);}

    //Metodos

    @Override
    public String acelerar() throws Exception {
        return "Seu Automóvel do modelo "+modelo+", cor: "+cor+" està  se movimentando sobre o asfalto";
    }

    @Override
    public String virar(String lado) throws Exception {
        if(!(lado.toLowerCase().equals("direita") || lado.toLowerCase().equals("esquerda")))throw new Exception("Comando inválido.");
        switch (lado.toLowerCase()){
            case "direita":
                return "Seu Automóvel do modelo "+modelo+", cor: "+cor+" està virando a direita sobre o asfalto";
            case "esquerda":
                return "Seu Automóvel do modelo "+modelo+", cor: "+cor+" està virando a esquerda sobre o asfalto";
            default:
                return "";
        }
    }

    @Override
    public String parar() throws Exception {
        return "Seu Automóvel do modelo "+modelo+", cor: "+cor+" està parado sobre o asfalto";
    }
}
