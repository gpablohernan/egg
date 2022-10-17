import Entidad.Alumno;
import Servicios.AlumnoService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        AlumnoService alumnos = new AlumnoService();
        Alumno alumno = new Alumno();

        alumnos.notaFinal(alumnos.crearListaAlumnos());

    }
}