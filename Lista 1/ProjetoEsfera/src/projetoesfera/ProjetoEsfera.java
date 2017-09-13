package projetoesfera;

import dados.Esfera;
import javax.swing.JOptionPane;

public class ProjetoEsfera {
    public static void main(String[] args) {
        //Instancia
        Esfera bola = new Esfera();
        
        boolean go = false;
        
        do{
            try{
                go=false;
                bola.setRaio(Float.parseFloat(JOptionPane.showInputDialog("Qual o valor do raio?")));
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
                go=true;
            }
        }while(go!=false);
        String tudo ="Dados do objeto bola\n";
        tudo += "Raio: "+bola.getRaio()+"\n";
        tudo += "Área: "+bola.CaucularArea()+"\n";
        tudo += "Volume: "+bola.CaucularVolume()+"\n";
        
        JOptionPane.showMessageDialog(null, tudo);
    }
    
}