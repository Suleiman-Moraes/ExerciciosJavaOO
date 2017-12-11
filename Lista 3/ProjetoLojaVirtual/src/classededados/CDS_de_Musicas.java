package classededados;
public class CDS_de_Musicas extends Produto {
    //Atributos
    private String nomeDoAlbum = "";
    private String banda = "";
    private String cantor = "";
    private String generoMusical = "";
    
    //Construtor
    public CDS_de_Musicas(){}
    public CDS_de_Musicas(int codigo, String descricao, float precoDeVenda, String tipoDoProduto, String nomeDoAlbum, String banda, String cantor, String generoMusical) throws Exception {
        super(codigo, descricao, precoDeVenda, tipoDoProduto);
        this.nomeDoAlbum = nomeDoAlbum;
        this.banda = banda;
        this.cantor = cantor;
        this.generoMusical = generoMusical;
    }
    public CDS_de_Musicas(CDS_de_Musicas objeto){
        super(objeto);
        this.nomeDoAlbum = objeto.nomeDoAlbum;
        this.banda = objeto.banda;
        this.cantor = objeto.cantor;
        this.generoMusical = objeto.generoMusical;
    }
    public CDS_de_Musicas(Produto objeto, String nomeDoAlbum, String banda, String cantor, String generoMusical) throws Exception {
        super(objeto);
        this.nomeDoAlbum = nomeDoAlbum;
        this.banda = banda;
        this.cantor = cantor;
        this.generoMusical = generoMusical;
    }
    
    //Metodos

    public String getNomeDoAlbum() {
        return nomeDoAlbum;
    }

    public String getBanda() {
        return banda;
    }

    public String getCantor() {
        return cantor;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setNomeDoAlbum(String nomeDoAlbum) {
        this.nomeDoAlbum = nomeDoAlbum;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }
}
