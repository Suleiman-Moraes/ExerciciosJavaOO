package classededados;

public class Estudante extends Pessoa {
    //Atributos
    
    protected int matricula = 0;
    protected String curso = "";
    protected String campus = "";
    
    //Construtor

    public Estudante(){}//Default

    public Estudante(String nome, String endereco, int telefone, String email, int matricula, String curso, String campus) throws Exception{
        super(nome, endereco, telefone, email);
        if(matricula < 0) throw new Exception("Matrícula não pode ser negativo.");
        this.curso = curso;
        this.campus = campus;
        this.matricula = matricula;
    }

    //Metodos

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public String getCampus() {
        return campus;
    }

    public void setMatricula(int matricula) throws Exception {
        if(matricula < 0) throw new Exception("Matrícula não pode ser negativo.");
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }
}
