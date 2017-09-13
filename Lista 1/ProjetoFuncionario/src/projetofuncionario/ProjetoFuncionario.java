package projetofuncionario;

import dados.Funcionario;
import javax.swing.JOptionPane;

public class ProjetoFuncionario {

    public static void main(String[] args) {
        //Instancia
        Funcionario povo = new Funcionario();
        
        //Entrada de dados
        povo.setNome(JOptionPane.showInputDialog("Qual nome do funcionário? "));
        povo.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Qual salario do(a)"+povo.getNome()+"? ")));
        povo.setNumeroDeFilhos(Integer.parseInt(JOptionPane.showInputDialog("Quantos filhos tem o(a)"+povo.getNome()+"? ")));
        //povo.caucularAumentoSalarial(Float.parseFloat(JOptionPane.showInputDialog("Qual aumento do(a)"+povo.getNome()+"? ")));
        
        //Saida
        String tudo = "Dados do objeto povo: ";
        tudo += "\nNome: "+povo.getNome();
        tudo += "\nSalário do mês: "+povo.getSalario();
        tudo += "\nNúmero de filhos: "+povo.getNumeroDeFilhos();
        tudo += "\n"+povo.caucularAumentoSalarial(Float.parseFloat(JOptionPane.showInputDialog("Qual aumento do(a)"+povo.getNome()+"? ")));
        tudo += "\nINSS: "+povo.caucularINSS();
        tudo += "\nParcela do IRPF: "+povo.caucularParcelaIRPF();
        tudo += "\nValor mensal do IRPF: "+povo.caucularMensalIRPF();
        tudo += "\nFim!";
        
        JOptionPane.showMessageDialog(null, tudo);
    }
    
}
