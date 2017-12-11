package dados;
public class Paciente {
    //Atributos
    protected String nome = "";
    protected float peso = 0;
    protected float altura = 0;
    protected String sexo = "";
     
    //Construtor
    public Paciente(){}//Default
    public Paciente(String nome, float peso, float altura, String sexo) throws Exception{
        if(peso <= 0)throw new Exception("Peso não pode ser negativa nem igual a zero.");
        if(altura <= 0)throw new Exception("Altura não pode ser negativa nem igual a zero.");
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }
    public Paciente(Paciente objeto) throws Exception{
        if(peso <= 0)throw new Exception("Peso não pode ser negativa nem igual a zero.");
        if(altura <= 0)throw new Exception("Altura não pode ser negativa nem igual a zero.");
        this.nome = objeto.nome;
        this.peso = objeto.peso;
        this.altura = objeto.altura;
        this.sexo = objeto.sexo;
    }
    
    //Metodos

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) throws Exception {
        if(peso <= 0)throw new Exception("Peso não pode ser negativa nem igual a zero.");
        this.peso = peso;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) throws Exception {
        if(altura <= 0)throw new Exception("Altura não pode ser negativa nem igual a zero.");
        this.altura = altura;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
