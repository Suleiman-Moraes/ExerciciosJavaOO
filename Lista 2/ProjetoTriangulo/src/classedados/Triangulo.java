package classedados;
public class Triangulo {
    //Atributos
    private float ladoA = 0;
    private float ladoB = 0;
    private float ladoC = 0;
    
    //Metodos

    public float getLadoA() {
        return ladoA;
    }

    public float getLadoB() {
        return ladoB;
    }

    public float getLadoC() {
        return ladoC;
    }
    public void setLado(float ladoA, float ladoB, float ladoC) throws Exception{
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        if(ladoA<0||ladoB<0||ladoC<0) throw new Exception ("Um Triângulo não pode ter lados negativos.");
        else if (ladoA==0||ladoB==0||ladoC==0) throw new Exception ("Um Triâgulo não pode ter lados igua a 'zero'.");
        else if(!(ladoA<(ladoB+ladoC))) throw new Exception ("'Lado A' não forma um Triângulo.");
        else if(!(ladoB<(ladoA+ladoC))) throw new Exception ("'Lado B' não forma um Triângulo.");
        else if(!(ladoC<(ladoA+ladoB))) throw new Exception ("'Lado C' não forma um Triângulo.");
    }
    public float caucularArea(){
        //área = raizQuadrada(T*(T-A)*(T-B)*(T-C)) onde T = (A+B+C)/2.
        float x = (ladoA+ladoB+ladoC)/2;
        return (float) Math.sqrt(x*(x-ladoA)*(x-ladoB)*(x-ladoC));
    }
    public String encontrarTipoDeTriangulo(){
        //quanto aos lados, pode ser equilátero ou isósceles ou escaleno;
        if (ladoA==ladoB && ladoB==ladoC) return "Triângulo Equilátero.";
        else if(ladoA!=ladoB && ladoB!=ladoC && ladoC!=ladoA) return "Triângulo Escaleno.";
        else return "Triângulo Isósceles.";
    }
    public String encontrarAnguloDoTriangulo(){
        //quanto aos ângulos, pode ser acutângulo(A2<B2+C2) ou obtusângulo(A2>B2+C2) ou retângulo (A2=B2+C2);
        if ((ladoA*ladoA)<((ladoB*ladoB)+(ladoC*ladoC))) return "Triângulo Acutângulo.";
        else if ((ladoA*ladoA)>((ladoB*ladoB)+(ladoC*ladoC))) return "Triângulo Obtusângulo.";
        else if ((ladoA*ladoA)==((ladoB*ladoB)+(ladoC*ladoC))) return "Triângulo Retângulo.";
        else return "";
    }
}
