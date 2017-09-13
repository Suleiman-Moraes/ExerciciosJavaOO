package projetopaciente;

import dados.Paciente;
import javax.swing.JOptionPane;

public class ProjetoPaciente {

    public static void main(String[] args) {
        //Instancia
        Paciente duente = new Paciente();
        
        //Entrada de dados
        duente.setNome(JOptionPane.showInputDialog(null, "Qual nome do paciente ? "));
        duente.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null, "Altura: ")));
        duente.setPeso(Float.parseFloat(JOptionPane.showInputDialog(null, "Peso: ")));
        
        //Saida
        String tudo="Dados do objeto duente: ";
        tudo += "\nNome: "+duente.getNome();
        tudo += "\nAltura: "+duente.getAltura()+" m";
        tudo += "\nPeso: "+duente.getPeso()+" kg";
        tudo += "\nIMC: "+duente.caucularIMC();
        tudo += "\nFaixa de peso: "+duente.caucularFaixaDoPeso();
        tudo += "\nFim!";
        
        JOptionPane.showMessageDialog(null, tudo);
    }
    
}
