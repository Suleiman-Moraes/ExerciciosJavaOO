package interfaces;
public interface IVeiculo {
    String acelerar()throws Exception;
    String virar(String lado)throws Exception;
    String parar()throws Exception;
}