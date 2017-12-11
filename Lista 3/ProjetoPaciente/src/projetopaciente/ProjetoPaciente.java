package projetopaciente;

import dados.Paciente;
import dados.PacienteHomem;
import javax.swing.JOptionPane;

public class ProjetoPaciente {

    public static void main(String[] args) {
        try{
            //Instancia
            Paciente duente = new Paciente("Suleiman", 75, (float)1.85, "masculino");
            PacienteHomem homi = new PacienteHomem("Suleiman", 75, (float)1.85, "masculino", 20);
            //Saida
            String tudo="Dados do objeto duente: ";
            tudo += "\nNome: "+duente.getNome();
            tudo += "\nAltura: "+duente.getAltura()+" m";
            tudo += "\nPeso: "+duente.getPeso()+" kg";
            tudo += "\nIMC: "+homi.caucularIMC();
            tudo += "\nFaixa de peso: "+homi.caucularFaixaPeso();
            tudo += "\nFazer o Exame de Prostata? "+homi.fazerExameDeProsta();
            tudo += "\nFim!";

            JOptionPane.showMessageDialog(null, tudo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
