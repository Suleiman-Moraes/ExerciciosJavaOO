package metodomain;
import classededados.Estudante;
import classededados.Graduado;
import classededados.Pessoa;
import classededados.Trabalhador;

public class MetodoMain {
    public static void main(String[] args) {
        try{
            //Instancias
            Pessoa objetoPessoa = new Pessoa("Suleiman Moraes", "rua RC37 Q54 Lt43", 998264577, "suleimanmoraes@gmail.com");
            
            Estudante objetoEstudante = new Estudante("Suleiman Moraes", "rua RC37 Q54 Lt43", 998264577, "suleimanmoraes@gmail.com", 123456, "Análise e Desenvolvimento de Sistemas", "Senai Fatesg");
            
            Graduado objetoGraduado = new Graduado("Suleiman Moraes", "rua RC37 Q54 Lt43", 998264577, "suleimanmoraes@gmail.com", 123456, "Análise e Desenvolvimento de Sistemas", "Senai Fatesg", 2019, 2020, 123456);
            
            Trabalhador objetoTrabalhador = new Trabalhador("Suleiman Moraes", "rua RC37 Q54 Lt43", 998264577, "suleimanmoraes@gmail.com", "Garçom", "Atendente", (float)1000.15);
            
            //ClassePessoa
            String tudo = "Dados objeto \"people\":\n";
            tudo += mostrarObjeto(objetoPessoa);
            tudo += "\n\n\n";
                    
            //ClasseEstudante
            tudo += "Dados do objeto \"aluno\": \n";
            tudo += mostrarObjeto2(objetoEstudante);
            tudo += "\n\n\n";
            
            //ClasseGraduado
            tudo += "Dados do objeto \"formado\": \n";
            tudo += mostrarObjeto2(objetoGraduado);
            tudo += "Ano da conclusão: "+objetoGraduado.getAnoDaConclusao()+"\n";
            tudo += "Ano da colação de grau: "+objetoGraduado.getAnoDaColacaoDeGrau()+"\n";
            tudo += "Número do diploma: "+objetoGraduado.getNumeroDoDiploma()+"\n";
            tudo += "\n\n\n";
            
            //ClasseTrabalhador
            tudo += "Dados objeto \"escravo\":\n";
            tudo += mostrarObjeto(objetoTrabalhador);
            tudo += "Função: "+objetoTrabalhador.getFuncao()+"\n";
            tudo += "Departamento: "+objetoTrabalhador.getDepartamaneto()+"\n";
            tudo += "Salário: R$"+objetoTrabalhador.getSalario()+"\n";
            
            //Saida
            System.out.println(tudo);
        }catch(Exception erro){
            System.out.println(erro.getMessage());
        }
    }
    public static String mostrarObjeto(Pessoa objeto){
        String tudo = "";
        tudo += "Nome: " + objeto.getNome() + "\n";
        tudo += "Endereço: " + objeto.getEndereco() + "\n";
        tudo += "Telefone: (62)" + objeto.getTelefone() + "\n";
        tudo += "email: " + objeto.getEmail() + "\n";
        return tudo;
    }
    public static String mostrarObjeto2(Estudante objeto){
        String tudo = "";
        tudo += mostrarObjeto(objeto);
        tudo += "Matrícula: " + objeto.getMatricula() + "\n";
        tudo += "Curso: " + objeto.getCurso() + "\n";
        tudo += "Campus: "+ objeto.getCampus()+"\n";
        return tudo;
    }
}
