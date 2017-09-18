package classededados;
public class NComplexo {
    //Atributos
    private int parteReal = 0;
    private int parteImaginaria = 0;
    
    //Metodos
    public NComplexo(){}
    public NComplexo(int pr, int pi){
        parteReal = pr;
        parteImaginaria = pi;
    }
    public NComplexo(NComplexo objeto){
        parteReal = objeto.parteReal;
        parteImaginaria = objeto.parteImaginaria;
    }
    public String get(){
        return parteReal + " + " + parteImaginaria + "i";
    }
    public void set(int pr, int pi){
        parteReal = pr;
        parteImaginaria = pi;
    }
    public NComplexo adicionar(NComplexo objeto){
        int real = this.parteReal + objeto.parteReal;
        int imaginario = this.parteImaginaria + objeto.parteImaginaria;
        NComplexo aux = new NComplexo(real, imaginario);
        return aux;
    }
    public NComplexo subtrair(NComplexo objeto){
        int real = this.parteReal - objeto.parteReal;
        int imaginario = this.parteImaginaria - objeto.parteImaginaria;
        NComplexo aux = new NComplexo(real, imaginario);
        return aux;
    }
    public boolean eIgual(NComplexo objeto){
        return this.parteReal == objeto.parteReal && this.parteImaginaria == objeto.parteImaginaria;
    }
    public NComplexo multiplicar(NComplexo objeto){
        int real = (this.parteReal * objeto.parteReal)-(this.parteImaginaria * objeto.parteImaginaria);
        
        int imaginario = (this.parteReal * objeto.parteImaginaria)+(this.parteImaginaria * objeto.parteReal);
        
        NComplexo aux = new NComplexo(real, imaginario);
        
        return aux;
    }
    public NComplexo dividir(NComplexo objeto){
        int real = ((this.parteReal * objeto.parteReal)+(this.parteImaginaria * objeto.parteImaginaria))/
                (int)(Math.pow(objeto.parteReal, 2) + Math.pow(objeto.parteImaginaria, 2));
        
        int imaginario = ((this.parteReal * objeto.parteImaginaria)-(this.parteImaginaria * objeto.parteReal))/
                (int)(Math.pow(objeto.parteReal, 2) + Math.pow(objeto.parteImaginaria, 2));
        
        NComplexo aux = new NComplexo(real, imaginario);
        
        return aux;
    }
}