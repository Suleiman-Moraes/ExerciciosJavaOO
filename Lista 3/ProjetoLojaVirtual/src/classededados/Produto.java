package classededados;

public class Produto {
    //Atrubutos
    protected int codigo = 0;
    protected String descricao = "";
    protected float precoDeVenda = 0;
    protected String tipoDoProduto = "";
    
    //Contrutor
    public Produto(){}//Default
    public Produto(int codigo, String descricao, float precoDeVenda, String tipoDoProduto) throws Exception{
        if(codigo < 0) throw new Exception("Código não poser negativo");
        if(precoDeVenda <= 0) throw new Exception("Preço de venda não poser negativo, nem igual a zero.");
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoDeVenda = precoDeVenda;
        this.tipoDoProduto = tipoDoProduto;
    }
    public Produto(Produto objeto){
        this.codigo = objeto.codigo;
        this.descricao = objeto.descricao;
        this.precoDeVenda = objeto.precoDeVenda;
        this.tipoDoProduto = objeto.tipoDoProduto;
    }
    
    //Metodos

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getPrecoDeVenda() {
        return precoDeVenda;
    }

    public String getTipoDoProduto() {
        return tipoDoProduto;
    }

    public void setCodigo(int codigo) throws Exception {
        if(codigo < 0) throw new Exception("Código não poser negativo");
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrecoDeVenda(float precoDeVenda) throws Exception {
        if(precoDeVenda <= 0) throw new Exception("Preço de venda não poser negativo, nem igual a zero.");
        this.precoDeVenda = precoDeVenda;
    }

    public void setTipoDoProduto(String tipoDoProduto) {
        this.tipoDoProduto = tipoDoProduto;
    }
    
    public String mostraPrecoDeVenda() {
        return "R$" + precoDeVenda;
    }
}
