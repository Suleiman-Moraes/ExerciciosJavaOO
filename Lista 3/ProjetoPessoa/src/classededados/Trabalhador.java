package classededados;


public class Trabalhador extends Pessoa {
    //Atributos
    
    private String funcao = "";
    private String departamaneto = "";
    private float salario = 0;
    
    //Construtor
    public Trabalhador(){}//Default
    public Trabalhador(String nome, String endereco, int telefone, String email, String funcao, String departamento, float salario) throws Exception {
        super(nome, endereco, telefone, email);
        this.funcao = funcao;
        this.departamaneto = departamento;
        this.salario = salario;
    }
    
    //Metodos

    public String getFuncao() {
        return funcao;
    }

    public String getDepartamaneto() {
        return departamaneto;
    }

    public float getSalario() {
        return salario;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setDepartamaneto(String departamaneto) {
        this.departamaneto = departamaneto;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
