/*Desenvolva, usando a UML ( diagrama de classe ), uma classe que modele um objeto
calculadora em conformidade com o paradigma orientado a objeto. Posteriormente implemente
esta classe. obs. O objeto calculadora tem as seguintes funcionalidades: adição, subtração,
multiplicação, divisão, raiz e potência. */
package classedados;

public class Calculadora {
    //Atributos
    private float numero1 = 0;
    private float numero2 = 0;
    
    //Metodos

    public float getNumero1() {
        return numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }
    
    public float adicao(){
        return numero1+numero2;
    }
    public float subtracao(){
        return numero1-numero2;
    }
    public float multiplicacao(){
        return numero1*numero2;
    }
    public float divisao(){
        return numero1/numero2;
    }
    public float caucularRaiz(){
        return (float)Math.pow(numero2, (1/numero1));
    }
    public float caucularPotencia(){
        return (float)Math.pow(numero1, numero2);
    }
}
