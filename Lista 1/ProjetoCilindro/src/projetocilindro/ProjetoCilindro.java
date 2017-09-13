package projetocilindro;

import dados.Cilindro;
import javax.swing.JOptionPane;

public class ProjetoCilindro {
    public static void main(String[] args) {
        //Instancia
        Cilindro cubo = new Cilindro();
        
        cubo.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null, "Qual valor da altura?")));
        cubo.setRaio(Float.parseFloat(JOptionPane.showInputDialog(null, "Qual valor do raio? ")));
        
        String tudo = "Dados do objeto cubo: ";
        tudo +="\nAltura: "+cubo.getAltura();
        tudo +="\nRaio: "+cubo.getRaio();
        tudo +="\nÁrea Lateral: "+cubo.caucularAreaLateral();
        tudo +="\nÁrea Total: "+cubo.caucularAreaTotal();
        tudo +="\nVolume: "+cubo.caucularVolume();
        tudo +="\nFim!";
        
        JOptionPane.showMessageDialog(null, tudo);
    }
    
}
