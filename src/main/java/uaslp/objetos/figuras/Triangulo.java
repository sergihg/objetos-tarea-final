package uaslp.objetos.figuras;

public class Triangulo implements Figura{
    private double base;
    private double altura;
    public Triangulo(){

    }
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public void setBase(double base){
        this.base = base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getArea() throws DatoFaltanteException{
        validate();
        return (base*altura/2);
    }
    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }
    //inicio ejercicio 2
    public String getDescription(){
        return "Cualquier triangulo";
    }
    public String getName(){
        return "Cualquier triangulo";
    }
    public void validate() throws DatoFaltanteException{
        if(base==0)
            throw new BaseNoProvistaException();
        if(altura==0)
            throw new AlturaNoProvistaException();
    }
}
