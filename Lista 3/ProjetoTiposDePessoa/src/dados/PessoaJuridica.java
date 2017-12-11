/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import interfaces.IRenda;


public class PessoaJuridica extends Pessoa implements IRenda{
    //Atributos
    private long cnpj = 0;
    private String razaoSocial = "";
    
    //Construtor
    public PessoaJuridica(){}//Default
    public PessoaJuridica(String nome, String endereco, int telefone, String email, long cnpj, String razaoSocial) throws Exception {
        super(nome, endereco, telefone, email);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }
    public PessoaJuridica(PessoaJuridica objeto) throws Exception {
        super(objeto);
        this.cnpj = objeto.cnpj;
        this.razaoSocial = objeto.razaoSocial;
    }
    
    //Metodos

    public long getCnpj() {
        return cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public float calcularImpostoDeRenda(float renda) throws Exception {
        if(renda < 0) throw new Exception("Renda não pode ser negativo.");
        if(renda == 0) throw new Exception("Renda não pode ser igual a zero.");
        return (float)(renda*(10.0/100 + 1));
    }
}
