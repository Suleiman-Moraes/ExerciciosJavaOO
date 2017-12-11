package classededados;

public class Notebook extends Produto {
    //Atributos
    private String marca = "";
    private String modelo = "";
    private String memoriaRAM = "";
    private String processador = "";
    private float tamanhoDaTela = 0;
    private String sistemaOperacional = "";
    
    //Construtor
    public Notebook(){}
    public Notebook(int codigo, String descricao, float precoDeVenda, String tipoDoProduto,
            String marca, String modelo, String memoriaRAM, String processador, float tamanhoDaTela, String sistemaOperacional) throws Exception {
        super(codigo, descricao, precoDeVenda, tipoDoProduto);
        if(tamanhoDaTela <= 0) throw new Exception("Tamanho da tela não pode ser negativo, nem igual a zero.");
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.processador = processador;
        this.tamanhoDaTela = tamanhoDaTela;
        this.sistemaOperacional = sistemaOperacional;
    }

    public Notebook(Notebook objeto) {
        super(objeto);
        this.marca = objeto.marca;
        this.modelo = objeto.modelo;
        this.memoriaRAM = objeto.memoriaRAM;
        this.processador = objeto.processador;
        this.tamanhoDaTela = objeto.tamanhoDaTela;
        this.sistemaOperacional = objeto.sistemaOperacional;
    }
    
    //Metodos

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public String getProcessador() {
        return processador;
    }

    public float getTamanhoDaTela() {
        return tamanhoDaTela;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setTamanhoDaTela(float tamanhoDaTela) throws Exception {
        if(tamanhoDaTela <= 0) throw new Exception("Tamanho da tela não pode ser negativo, nem igual a zero.");
        this.tamanhoDaTela = tamanhoDaTela;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
}
