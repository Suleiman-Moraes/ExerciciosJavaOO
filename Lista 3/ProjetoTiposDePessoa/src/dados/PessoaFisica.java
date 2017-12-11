package dados;

import interfaces.IRenda;


public class PessoaFisica extends Pessoa implements IRenda{
    //Atributos
    private long cpf = 0;
    private String sexo = "";
    
    //Construtor
    public PessoaFisica(){}//Default
    public PessoaFisica(String nome, String endereco, int telefone, String email, long cpf, String sexo) throws Exception {
        super(nome, endereco, telefone, email);
        this.cpf = cpf;
        this.sexo = sexo;
    }
    public PessoaFisica(PessoaFisica objeto) throws Exception {
        super(objeto);
        this.cpf = objeto.cpf;
        this.sexo = objeto.sexo;
    }
    
    //Metodos

    public long getCpf() {
        return cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public float calcularImpostoDeRenda(float renda) throws Exception {
        if(renda < 0) throw new Exception("Renda não pode ser negativo.");
        if(renda == 0) throw new Exception("Renda não pode ser igual a zero.");
        
        int porcentagen = 0;
        if(renda <= 1400) porcentagen = 0;
        else if(renda <= 2100) porcentagen = 10;
        else if(renda <= 2800) porcentagen = 15;
        else if(renda <= 3600) porcentagen = 25;
        else porcentagen = 30;
        
        return (float)(renda*(porcentagen/100.0 + 1));
    }
}
