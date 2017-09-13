package classedados;

public class CPF {
    //Atributos
    private long cpf = 0;
    
    //Métodos

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) throws Exception{
        this.cpf = cpf;
        if(cpf<0) throw new Exception ("Digite apenas números.");
    }
    
    public String validaCpf(){
        long dado = cpf;
        long penultimoDigito = 0;
        long ultimoDigito = 0;
        double cont = 10000000000.0;
        long ultimo = 0;
        long penultimo = 0;
        for (int i = 10; i >= 2; i--) {
            penultimoDigito += (long)(dado/cont)*i;
            dado = (long)(dado%cont);
            cont = cont/10 ;
        }
        penultimoDigito = penultimoDigito * 10%11;
        cont = 10000000000.0;
        dado = cpf ;
        for (int i = 11; i >= 2; i--) {
            ultimoDigito += (long)(dado/cont)*i;
            if(i==2) penultimo = dado/10;
            dado = (long)(dado%cont);
            if(i==2) ultimo = dado;
            cont = cont/10 ;
        }
        ultimoDigito = ultimoDigito * 10%11;
        System.out.println(ultimoDigito+" "+penultimoDigito);
        if (penultimoDigito==10) penultimoDigito = 0;
        if (ultimoDigito==10) ultimoDigito=0;
        if(cpf/ultimoDigito==11111111111.0 || cpf%penultimoDigito==11111111111.0) return "CPF Inválido!";
        else if(ultimoDigito==ultimo&&penultimoDigito==penultimo) return "CPF Válido!";
        else return "CPF Inválido!";
    }
}
