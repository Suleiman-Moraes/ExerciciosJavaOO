package projetopiramide;

import dados.Piramide;
import javax.swing.JOptionPane;

public class ProjetoPiramide {
    public static void main(String[] args) {
        //Instancia
        
        Piramide kelps = new Piramide();
        
        kelps.setAltura(5);
        kelps.setBase(3);
        
        String tudo = "Dados do Objeto kelps\n";
        tudo += "Altura: "+kelps.getAltura()+"\n";
        tudo += "Base: "+kelps.getBase()+"\n";
        tudo += "Volume: "+kelps.calcularVolume();
        
        JOptionPane.showMessageDialog(null, tudo);
    }
    
}
