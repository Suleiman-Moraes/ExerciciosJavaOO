package dados;

import interfaces.IPaciente;


public class PacienteMulher extends Paciente implements IPaciente{
    //Atributo
    private boolean casosDeCancerNaFamilia = false;
    
    //Construtor
    public PacienteMulher(){}
    public PacienteMulher(String nome, float peso, float altura, String sexo, boolean casosDeCancerNaFamilia) throws Exception {
        super(nome, peso, altura, sexo);
        this.casosDeCancerNaFamilia = casosDeCancerNaFamilia;
    }
    public PacienteMulher(PacienteMulher objeto) throws Exception {
        super(objeto);
        this.casosDeCancerNaFamilia = objeto.casosDeCancerNaFamilia;
    }
    
    //Metodos
    public boolean getCasosDeCancerNaFamilia() {
        return casosDeCancerNaFamilia;
    }

    public void setCasosDeCancerNaFamilia(boolean casosDeCancerNaFamilia) {
        this.casosDeCancerNaFamilia = casosDeCancerNaFamilia;
    }
    
    @Override
    public float caucularIMC(){
        return (float)(peso/(Math.pow(altura,2)));
    }
    @Override
    public String caucularFaixaPeso(){
        String peso="";//Variavel de retorno
        if(caucularIMC()<20) peso="Abaixo do peso ideal.";
        else if (caucularIMC()<=25) peso ="Peso normal.";
        else if(caucularIMC()<=30) peso="Excesso de peso.";
        else if(caucularIMC()<=35) peso ="Obesidade.";
        else peso ="Obesidade mórbida.";
        return peso;
    }
    public String fazerExameDeMama(){
        if(casosDeCancerNaFamilia) return "Possui Câncer.";
        else return "Não possui Câncer.";
    }
}
