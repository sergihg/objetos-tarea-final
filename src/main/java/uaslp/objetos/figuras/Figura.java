package uaslp.objetos.figuras;

public interface Figura extends DrawableItem{
    String getName();
    double getArea() throws DatoFaltanteException;
}
