package execucao;

import classededados.CDS_de_Musicas;
import classededados.Livro;
import classededados.Notebook;
import classededados.Produto;
import javax.swing.JOptionPane;

public class Executar {
    public static void main(String[] args) {
        try{
            //Intancias
            Produto produto = new Produto(12345, "Descrição...", (float) 99.90, "Tipo do produto");
            CDS_de_Musicas cds_de_musicas = new CDS_de_Musicas(12345, "Descrição...", (float) 99.90, "CD de música", "Governe", "Apocalipse 16", "Pregador Luo", "RAP");
            Livro livro = new Livro(12345, "Descrição...", (float) 99.90, "Livro", "George RR. Martin", "Cine Video", "Scipione", 2010);
            Notebook notebook = new Notebook(12345, "Descrição...", (float) 99.90, "Notebook", "Dell", "Inspirion 9000", "DDR5 8 GB", "I7", 20, "Windows XP");
            
            //Classe Produto
            String tudo = "Dados objeto \"produto\":\n";
            tudo += mostrarObjeto(produto);
            tudo += "\n\n\n";
            
            //Classe CDS_de_Musicas
            tudo += "Dados objeto \"cds_de_musicas\":\n";
            tudo += mostrarObjeto(cds_de_musicas);
            tudo += "Nome do album: "+cds_de_musicas.getNomeDoAlbum()+"\n";
            tudo += "Banda: "+cds_de_musicas.getBanda()+"\n";
            tudo += "Cantor: "+cds_de_musicas.getCantor()+"\n";
            tudo += "Gênero musical: "+cds_de_musicas.getGeneroMusical();
            tudo += "\n\n\n";
            
            //Classe Livro
            tudo += "Dados objeto \"livro\":\n";
            tudo += mostrarObjeto(livro);
            tudo += "Autor: "+livro.getAutor()+"\n";
            tudo += "Tradutor: "+livro.getTradutor()+"\n";
            tudo += "Editora: "+livro.getEditora()+"\n";
            tudo += "Ano de publicação: "+livro.getAnoDePublicacao()+"\n";
            tudo += "\n\n\n";
            
            //Classe Notebook
            tudo += "Dados objeto \"notebook\":\n";
            tudo += mostrarObjeto(notebook);
            tudo += "Marca: "+notebook.getMarca()+"\n";
            tudo += "Modelo: "+notebook.getModelo()+"\n";
            tudo += "Memória RAM: "+notebook.getMemoriaRAM()+"\n";
            tudo += "Processador: "+notebook.getProcessador()+"\n";
            tudo += "Tamanho da tela: "+notebook.getTamanhoDaTela()+"\n";
            tudo += "Sistema Operacional: "+notebook.getSistemaOperacional();
            
            //Saida
            System.out.println(tudo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }   
    }
    public static String mostrarObjeto(Produto objeto){
        String tudo = "Código: "+objeto.getCodigo()+"\n";
        tudo += "Descrição: "+objeto.getDescricao()+"\n";
        tudo += "Preço de venda: "+objeto.mostraPrecoDeVenda()+"\n";
        tudo += "Tipo do produto: "+objeto.getTipoDoProduto()+"\n";
        return tudo;
    }
}
