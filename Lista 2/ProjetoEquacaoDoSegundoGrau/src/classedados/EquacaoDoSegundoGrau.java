package classedados;

public class EquacaoDoSegundoGrau {
    //Atributos
    private float a = 0;
    private float b = 0;
    private float c = 0;
    
    //Metodos

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    public void setA(float a) throws Exception{
        this.a = a;
        if(a==0) throw new Exception("O valor de 'A' não pode ser 'zero'.");
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setC(float c) {
        this.c = c;
    }
    
    public float caucularDelta(){
        
        return (b*b)-(4*a*c);
    }
    public double[] caucularBhaskara (){
        //int[] valores = new int[] {totAte2000,totMais2000}
        double[] x = new double[2];
        try{
            //double value = FORMAT.parse(field.getText()).doubleValue();
            x[0]= (float)((-b+Math.sqrt(caucularDelta()))/(2*a));
            x[1]= (float)((-b-Math.sqrt(caucularDelta()))/(2*a));
        }catch (Exception e){
                System.out.println(e);
        }
        finally {
            return x;
        }
    }
}
