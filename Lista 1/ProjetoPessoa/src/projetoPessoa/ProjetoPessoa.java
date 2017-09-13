package projetoPessoa;

import dados.Pessoa;
import javax.swing.JOptionPane;

public class ProjetoPessoa {
    public static void main(String[] args) {
        
        //Criando instancia em java
        Pessoa jose = new Pessoa();
        
        String saida = "Dados do Objeto Jose \n";
        saida += "Nome: " + jose.getNome() + "\n";
        saida += "Peso: " + jose.getPeso() + " Kg\n";
        saida += "Altura: " + jose.getAltura() + " m\n";
        saida += "Sexo: " + jose.getSexo() + "\n";
        
        JOptionPane.showMessageDialog(null, saida);
        try {
            jose.setNome("José das Cove");
            jose.setPeso(-50);
            jose.setAltura(3);
            jose.setSexo("Masculino");

            saida = "Dados do Objeto Jose \n";
            saida += "Nome: " + jose.getNome() + "\n";
            saida += "Peso: " + jose.getPeso() + " Kg\n";
            saida += "Altura: " + jose.getAltura() + " m\n";
            saida += "Sexo: " + jose.getSexo() + "\n";
            saida += "IMC: " + jose.caucularIMC() + "\n";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        JOptionPane.showMessageDialog(null, saida);
    }
}
