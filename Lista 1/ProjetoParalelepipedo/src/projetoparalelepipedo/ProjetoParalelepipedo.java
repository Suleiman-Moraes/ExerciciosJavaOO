package projetoparalelepipedo;

import dados.Paralelepipedo;
import javax.swing.JOptionPane;

public class ProjetoParalelepipedo {
    public static void main(String[] args) {
        //Instancia
        Paralelepipedo pedo = new Paralelepipedo();
        
        pedo.setComprimento(Float.parseFloat(JOptionPane.showInputDialog(null, "Qual comprimento? ")));
        pedo.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null, "Qual altura? ")));
        pedo.setLargura(Float.parseFloat(JOptionPane.showInputDialog(null, "Qual largura? ")));
        
        String tudo ="Dados do objeto pedo: ";
        tudo +="\nComprimento: "+pedo.getComprimento();
        tudo +="\nAltura: "+pedo.getAltura();
        tudo +="\nLargura: "+pedo.getLargura();
        tudo +="\nÁrea: "+pedo.caucularArea();
        tudo +="\nVolume: "+pedo.caucularVolume();
        tudo +="\nFim!";
        
        JOptionPane.showMessageDialog(null, tudo);
    }
    
}
