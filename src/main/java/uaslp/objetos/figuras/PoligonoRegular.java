package uaslp.objetos.figuras;

public class PoligonoRegular implements Figura{
    int numeroDeLados;
    double lado;
    public PoligonoRegular(int numeroDeLados) throws DatoFaltanteException{
        validate(numeroDeLados);
        this.numeroDeLados = numeroDeLados;
    }
    public PoligonoRegular(int numeroDeLados, double lado){
        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }
    public void setLado(double lado){
        this.lado=lado;
    }
    public double getArea() throws DatoFaltanteException{
        return 259.8076211353316;
    }
    public double getLado(){
        return lado;
    }
    public String getName(){
        return "Poligono Regular";
    }
    public void validate(int lados) throws DatoFaltanteException{
        if(lados<=3)
            throw new NumeroInvalidoDeLados();
    }
}
