package projetocone;

import dados.Cone;
import javax.swing.JOptionPane;

public class ProjetoCone {
    public static void main(String[] args) {
        //Instancia
        Cone fred = new Cone();
        
        fred.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null, "Altura: ")));
        fred.setRaio(Float.parseFloat(JOptionPane.showInputDialog(null, "Raio: ")));
        
        String tudo = "Dados do objeto fred: ";
        tudo +="\nAltura: "+fred.getAltura();
        tudo +="\nRaio: "+fred.getRaio();
        tudo +="\nGeratriz: "+fred.caucularGeratriz();
        tudo +="\nÁrea lateral: "+fred.caucularArealateral();
        tudo +="\nÁrea total: "+fred.caucularAreaTotal();
        tudo +="\nVolume: "+fred.caucularVolume();
        tudo +="\nFim!";
        
        JOptionPane.showMessageDialog(null, tudo);
    }
    
}
