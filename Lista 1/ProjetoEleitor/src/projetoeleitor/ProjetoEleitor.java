package projetoeleitor;

import dados.Eleitor;
import javax.swing.JOptionPane;

public class ProjetoEleitor {

    public static void main(String[] args) {
        //Instancia
        Eleitor povo = new Eleitor();
        
        //Entrada de dados
        povo.setNome(JOptionPane.showInputDialog(null, "Nome do eleitor: "));
        povo.setAnoDeNascimento(Integer.parseInt(JOptionPane.showInputDialog(null, "Ano de nascimento: ")));
        
        //Saida
        String tudo = "Dados do objeto povo: ";
        tudo += "\nNome: "+povo.getNome();
        tudo += "\nAno do nascimento: "+povo.getAnoDeNascimento();
        tudo += "\nTipo de eleitor: "+povo.caucularTipoDeEleitor();
        tudo += "\nFim!";
        
        JOptionPane.showMessageDialog(null, tudo);
    }
    
}
