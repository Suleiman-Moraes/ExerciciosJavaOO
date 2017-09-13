package projetopiramidea;
import dados.Piramide;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;
public class ProjetoPiramideA {
    public static void main(String[] args) {
        Piramide kelps = new Piramide();
        
        boolean go=false;
        
        do{
            try {
                kelps.setBase(Float.parseFloat(JOptionPane.showInputDialog(null, "Valor da base: ")));
                kelps.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null, "Valor da altura: ")));
                go = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + "\nRedigite os valores.");
                go = false;
            }
        } while (go != true);
        String saida="Dados da Pirâmide kelps: \n";
        saida += "Base: "+kelps.getBase() + "\n";
        saida += "Altura: "+kelps.getAltura() + "\n";
        saida += "Volume: "+kelps.caucularVolume();
        
        JOptionPane.showMessageDialog(null, saida);
    }
}
