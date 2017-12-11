package execucao;

import dados.Automovel;
import dados.Aviao;
import dados.Barco;
import javax.swing.JOptionPane;

public class Execucao {
    public static void main(String[] args) {
        try {
            //Instancias
            Automovel moto = new Automovel("Preto", "CG Start 160", 140, 2);
            Aviao boeing = new Aviao("Branco", "Boeing 777", 950, 550);
            Barco perolaNegra = new Barco("Preto", "Galeão inglês", 100, 50);
            
            String tudo = saida(boeing)+saida(moto)+saida(perolaNegra);
            
            JOptionPane.showMessageDialog(null, tudo, "PROJETO VEÍCULO", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    private static String saida(Aviao objeto) throws Exception{
        String tudo = objeto.acelerar()+"\n";
        tudo += objeto.virar("Esquerda")+"\n";
        tudo += objeto.virar("Direita")+"\n";
        tudo += objeto.parar()+"\n";
        return tudo+"-----------------------------------------------------------------------------------------\n";
    }
    private static String saida(Automovel objeto) throws Exception{
        String tudo = objeto.acelerar()+"\n";
        tudo += objeto.virar("Esquerda")+"\n";
        tudo += objeto.virar("Direita")+"\n";
        tudo += objeto.parar()+"\n";
        return tudo+"-----------------------------------------------------------------------------------------\n";
    }
    private static String saida(Barco objeto) throws Exception{
        String tudo = objeto.acelerar()+"\n";
        tudo += objeto.virar("Bombordo")+"\n";
        tudo += objeto.virar("Estibordo")+"\n";
        tudo += objeto.parar()+"\n";
        return tudo+"-----------------------------------------------------------------------------------------\n";
    }
}
