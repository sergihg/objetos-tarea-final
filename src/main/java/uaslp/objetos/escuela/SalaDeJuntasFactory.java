package uaslp.objetos.escuela;

public class SalaDeJuntasFactory {
    public static SalaDeJuntasFactory instance = new SalaDeJuntasFactory(){};
    public static SalaDeJuntas salaDeJuntasA = new SalaDeJuntas("Sala A");
    public static SalaDeJuntas salaDeJuntasB = new SalaDeJuntas("Sala B");
    public static SalaDeJuntas salaDeJuntasC = new SalaDeJuntas("Sala C");
    public static SalaDeJuntas get(String sala){
        if(sala == "Sala A"){
            return salaDeJuntasA;
        }
        if(sala == "Sala B"){
            return salaDeJuntasB;
        }
        if(sala == "Sala C"){
            return salaDeJuntasC;
        }
        return null;
    }
}
