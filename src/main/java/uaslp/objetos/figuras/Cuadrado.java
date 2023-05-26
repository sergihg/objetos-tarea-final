package uaslp.objetos.figuras;

public class Cuadrado implements Figura{
    private double lado;
    private String name;
    public Cuadrado(){
        name= "Cuadrado";
    }
    public Cuadrado(double lado){
        this.lado = lado;
        name= "Cuadrado";
    }
    public void setLado(double lado){
        this.lado = lado;
    }
    public double getArea(){
        if(lado==0)
            throw new LadoNoProvistoException();
        return (lado*lado);
    }
    public double getLado(){
        return lado;
    }
    public String getName(){
        return name;
    }
}
