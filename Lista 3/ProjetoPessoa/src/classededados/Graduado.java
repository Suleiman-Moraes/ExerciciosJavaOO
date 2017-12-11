package classededados;


public class Graduado extends Estudante {
    //Atributos
    
    private int anoDaConclusao = 0;
    private int anoDaColacaoDeGrau = 0;
    private int numeroDoDiploma = 0;
    
    //Construtor
    public Graduado(){}//Default
    public Graduado(String nome, String endereco, int telefone, String email, int matricula, String curso, String campus, 
            int anoDaConclusao, int anoDaColacaoDeGrau, int numeroDoDiploma) throws Exception {
        super(nome, endereco, telefone, email, matricula, curso, campus);
        if(anoDaConclusao < 0) throw new Exception("Ano da conclusão não pode ser negativo ou apenas zero.");
        if(anoDaColacaoDeGrau < 0) throw new Exception("Ano da colação de grau não pode ser negativo ou apenas zero.");
        if(numeroDoDiploma < 0) throw new Exception("Número do diploma não pode ser negativo ou apenas zero.");
        this.anoDaConclusao = anoDaConclusao;
        this.anoDaColacaoDeGrau = anoDaColacaoDeGrau;
        this.numeroDoDiploma = numeroDoDiploma;
    }

    //Metodos
    public int getAnoDaConclusao() {
        return anoDaConclusao;
    }

    public int getAnoDaColacaoDeGrau() {
        return anoDaColacaoDeGrau;
    }

    public int getNumeroDoDiploma() {
        return numeroDoDiploma;
    }

    public void setAnoDaConclusao(int anoDaConclusao) {
        this.anoDaConclusao = anoDaConclusao;
    }

    public void setAnoDaColacaoDeGrau(int anoDaColacaoDeGrau) {
        this.anoDaColacaoDeGrau = anoDaColacaoDeGrau;
    }

    public void setNumeroDoDiploma(int numeroDoDiploma) {
        this.numeroDoDiploma = numeroDoDiploma;
    }
    
}
