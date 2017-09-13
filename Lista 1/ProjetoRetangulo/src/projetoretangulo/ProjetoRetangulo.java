package projetoretangulo;

import dados.Retangulo;
import javax.swing.JOptionPane;

public class ProjetoRetangulo {
    public static void main(String[] args) {
        //Instancia
        Retangulo quadrado = new Retangulo();
        
        quadrado.setComprimento(Float.parseFloat(JOptionPane.showInputDialog("Qual a comprimento do Retangulo?")));
        quadrado.setLargura(Float.parseFloat(JOptionPane.showInputDialog("Qual a largura do Retangulo?")));
        
        String tudo = "Dados do Retangulo quadrado: \n";
        tudo +="Comprimento: "+quadrado.getComprimento()+"\n";
        tudo +="Largura: "+quadrado.getLargura()+"\n";
        tudo +="Area: "+quadrado.caucularArea()+"\n";
        tudo +="Perimetro: "+quadrado.caucularPerimetro()+"\n";
        tudo +="Fim!";
        
        JOptionPane.showMessageDialog(null, tudo);
    }
    
}