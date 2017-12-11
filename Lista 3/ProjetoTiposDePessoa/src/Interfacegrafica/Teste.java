package Interfacegrafica;

import dados.PessoaFisica;
import dados.PessoaJuridica;
import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        try{
            PessoaFisica x = new PessoaFisica();
            float y = x.calcularImpostoDeRenda(10000);
            System.out.println(y);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
}
