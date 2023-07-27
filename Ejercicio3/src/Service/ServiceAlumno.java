package Service;

import Entity.Alumno;

import java.util.*;

/**
 * * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
 *   toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
 *   pregunta al usuario si quiere crear otro Alumno o no.
 *   Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
 *
 */
public class ServiceAlumno {
    private List<Alumno> lstAlumnos;
    private Scanner sc;
    public ServiceAlumno() {
        lstAlumnos = new ArrayList<>();
        sc = new Scanner(System.in);
    }
    public void crearAlumnos(){
        String respuesta;
        do {
            Alumno a = new Alumno();
            System.out.println("Ingrese el nombre del alumno");
            a.setNombreCompleto(sc.nextLine());
            int cantidadNotas;
            System.out.println("Ingrese la cantidad de notas para el alumno " + a.getNombreCompleto());
            cantidadNotas = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < cantidadNotas; i++) {
                System.out.println("Ingrese la nota " + (i + 1) + " para el alumno " + a.getNombreCompleto());
                int nota = Integer.parseInt(sc.nextLine());
                a.agregarNota(nota);
            }
            lstAlumnos.add(a);
            System.out.println("¿Desea crear otro alumno? (S/N)");
            respuesta = sc.nextLine();
        } while (respuesta.equalsIgnoreCase("S"));
    }

    /**
     * * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
     *   final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
     *   del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
     *   promedio final, devuelto por el método y mostrado en el main.
     */

    public void BuscarAlumnoNotaFinal() {
        System.out.println("Ingrese el nombre del alumno que quiere calcular la nota final");
        String nombreCompleto = sc.nextLine();
        boolean encontrado = false;

        for (Alumno a : lstAlumnos) {
            if (a.getNombreCompleto().equalsIgnoreCase(nombreCompleto)) {
                encontrado = true;
                double notaFinal = a.calcularNotaFinal(a);

                System.out.println("La nota final del alumno " + a.getNombreCompleto() + " es " + notaFinal);
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encuentra el alumno en la lista");
        }
    }


}
