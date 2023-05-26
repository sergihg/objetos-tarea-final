package uaslp.objetos.escuela;

import java.util.LinkedList;
import java.util.List;
import java.util.Spliterator;

public class EvaluadorDePromediosAdapter {
    private EvaluadorDePromedios evaluadorDePromedios;
    public EvaluadorDePromediosAdapter(EvaluadorDePromedios evaluadorDePromedios){
        this.evaluadorDePromedios = evaluadorDePromedios;
    }
    public double evalua(String calificaciones){
        List<Double> califs = new LinkedList<Double>();
        String []strings = calificaciones.split(",");
        for(String element : strings){
            califs.add(Double.parseDouble(element));
        }
        return evaluadorDePromedios.evalua(califs);
    }
}
