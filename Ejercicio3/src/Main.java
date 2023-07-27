import Service.ServiceAlumno;

public class Main {
    /**
     * Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
     * alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
     * con sus 3 notas.

     * @param args
     */
    public static void main(String[] args) {
        ServiceAlumno ser = new ServiceAlumno();
        ser.crearAlumnos();
        ser.BuscarAlumnoNotaFinal();
    }
}