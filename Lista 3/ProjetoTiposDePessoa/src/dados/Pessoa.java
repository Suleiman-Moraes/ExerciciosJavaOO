package dados;

public class Pessoa {
    //Atributos
    
    protected String nome = "";
    protected String endereco = "";
    protected int telefone = 0;
    protected String email = "";
    
    //Construtor
    public Pessoa(){}//Default
    public Pessoa(String nome, String endereco, int telefone, String email) throws Exception{
        if(telefone < 0) throw new Exception("Telefone não pode ser negativo.");
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
    public Pessoa(Pessoa objeto) throws Exception{
        if(telefone < 0) throw new Exception("Telefone não pode ser negativo.");
        this.nome = objeto.nome;
        this.endereco = objeto.endereco;
        this.telefone = objeto.telefone;
        this.email = objeto.email;
    }
   
    //Metodos
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(int telefone) throws Exception {
        if(telefone < 0) throw new Exception("Telefone não pode ser negativo.");
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
