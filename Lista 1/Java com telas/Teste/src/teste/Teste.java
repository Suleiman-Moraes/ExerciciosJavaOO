package teste;

import java.awt.event.KeyEvent;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.NumberFormatException;
import java.text.DecimalFormat;

public class Teste {
    private static final DecimalFormat forma = new DecimalFormat("#########.####");
    /*public static void main(String[] args) {
        try{
        Scanner leia = new Scanner(System.in);
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "    "));
        //System.out.println("   ");
        //int x = leia.nextInt();
        } catch (NumberFormatException erro){
            JOptionPane.showMessageDialog(null, erro);
            System.out.println(erro);
        }
    }*/
    public void keyTyped(KeyEvent e) {
        try {
            Integer.parseInt(String.valueOf(e.getKeyChar()));
        } catch (NumberFormatException err) {
            JOptionPane.showMessageDialog(null,
                    "Informe apenas números!");
            e.consume();
        }
    }
    public static void main(String[] args) {
        String teste = JOptionPane.showInputDialog("Aaa");
        System.out.println(teste);
    }
}
