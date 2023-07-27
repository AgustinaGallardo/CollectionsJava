package Service;
import Entity.Student;
import java.util.*;
/**
 *   En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
 *   toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
 *   pregunta al usuario si quiere crear otro Alumno o no.
 *   Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
 */
public class StudentService {
    private List<Student> lstStudent;
    private Scanner sc;
    public StudentService() {
        lstStudent = new ArrayList<>();
        sc = new Scanner(System.in);
    }
    public void createStudent(){
        String answer;
        do {
            Student a = new Student();
            System.out.println("Ingrese el nombre del alumno");
            a.setName(sc.nextLine());
            int numberNotes;
            System.out.println("Ingrese la cantidad de notas para el alumno " + a.getName());
            numberNotes = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < numberNotes; i++) {
                System.out.println("Ingrese la nota " + (i + 1) + " para el alumno " + a.getName());
                int note = Integer.parseInt(sc.nextLine());
                a.addNote(note);
            }
            lstStudent.add(a);
            System.out.println("¿Desea crear otro alumno? (S/N)");
            answer = sc.nextLine();
        } while (answer.equalsIgnoreCase("S"));
    }
    public void SearchStudentFinalGrade() {
        System.out.println("Ingrese el nombre del alumno que quiere calcular la nota final");
        String nombreCompleto = sc.nextLine();
        boolean found = false;
        for (Student a : lstStudent) {
            if (a.getName().equalsIgnoreCase(nombreCompleto)) {
                found = true;
                double Finalnote = a.calculateFinalGrade(a);
                System.out.println("La nota final del alumno " + a.getName() + " es " + Finalnote);
                break;
            }
        }
        if (!found) {
            System.out.println("No se encuentra el alumno en la lista");
        }
    }


}
