package uaslp.objetos.escuela;

import java.time.LocalDate;

public class AlumnoBuilder {
    private Alumno alumno;
    public AlumnoBuilder(){
        alumno = new Alumno();
    }
    public Alumno build(){
        return alumno;
    }
    public AlumnoBuilder nombre(String name){
        alumno.setNombre(name);
        return this;
    }
    public AlumnoBuilder clave(String clave){
        alumno.setClave(clave);
        return this;
    }
    public AlumnoBuilder claveDeCarrera(String claveDeCarrera){
        alumno.setClaveDeCarrera(claveDeCarrera);
        return this;
    }
    public AlumnoBuilder anioDeIngreso(int anio){
        alumno.setAnioDeIngreso(anio);
        return this;
    }
    public AlumnoBuilder fechaNacimiento(LocalDate date){
        alumno.setFechaNacimiento(date);
        return this;
    }
}
