package dados;

import interfaces.IPaciente;


public class PacienteHomem extends Paciente implements IPaciente{
    //Atributo
    private int idade = 0;
    
    //Construtor
    public PacienteHomem(){}
    public PacienteHomem(String nome, float peso, float altura, String sexo, int idade) throws Exception {
        super(nome, peso, altura, sexo);
        if(idade <= 0)throw new Exception("Idade não pode ser negativa ou igual a zero.");
        this.idade = idade;
    }
    public PacienteHomem(PacienteHomem objeto) throws Exception {
        super(objeto);
        this.idade = objeto.idade;
    }
    
    //Metodos
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws Exception {
        if(idade <= 0)throw new Exception("Idade não pode ser negativa ou igual a zero.");
        this.idade = idade;
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
    public boolean fazerExameDeProsta(){
        if(idade >= 45) return true;
        else return false;
    }
}
