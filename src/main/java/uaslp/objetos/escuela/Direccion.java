package uaslp.objetos.escuela;

public class Direccion {
    private static Direccion direccion = new Direccion();

    private Direccion(){

    }
    public static Direccion getInstance() {
        return direccion;
    }
}
