package classededados;
public class Livro extends Produto {
    //Atributos
    private String autor = "";
    private String tradutor = "";
    private String editora = "";
    private int anoDePublicacao = 0;
    
    //Construtor
    public Livro(){}
    public Livro(int codigo, String descricao, float precoDeVenda, String tipoDoProduto, String autor, String tradutor, String editora, int anoDePublicacao) throws Exception {
        super(codigo, descricao, precoDeVenda, tipoDoProduto);
        if(anoDePublicacao <= 0) throw new Exception("Ano de publicação não pode ser negativo nem igual a zero.");
        this.autor = autor;
        this.tradutor = tradutor;
        this.editora = editora;
        this.anoDePublicacao = anoDePublicacao;
    }
    public Livro(Livro objeto){
        super(objeto);
        this.autor = objeto.autor;
        this.tradutor = objeto.tradutor;
        this.editora = objeto.editora;
        this.anoDePublicacao = objeto.anoDePublicacao;
    }
    
    //Metodos

    public String getAutor() {
        return autor;
    }

    public String getTradutor() {
        return tradutor;
    }

    public String getEditora() {
        return editora;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTradutor(String tradutor) {
        this.tradutor = tradutor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setAnoDePublicacao(int anoDePublicacao) throws Exception {
        if(anoDePublicacao <= 0) throw new Exception("Ano de publicação não pode ser negativo nem igual a zero.");
        this.anoDePublicacao = anoDePublicacao;
    }
}
