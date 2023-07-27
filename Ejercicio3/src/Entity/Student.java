package Entity;
import java.util.ArrayList;
import java.util.List;

public class Student {
     private String name;
     private List<Integer> lstGrades;
    public Student(String nombreCompleto, List<Integer> lstNotas) {
        this.name = nombreCompleto;
        this.lstGrades = lstNotas;
    }
    public Student() {
        lstGrades = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void setName(String nombreCompleto) {
        this.name = nombreCompleto;
    }
    public List<Integer> getLstGrades() {
        return lstGrades;
    }
    public void setLstGrades(List<Integer> lstNotas) {
        this.lstGrades = lstNotas;
    }
    @Override
    public String toString() {
        return "Alumno{" +
                "nombreCompleto='" + name + '\'' +
                ", lstNotas=" + lstGrades +
                '}';
    }
    public void addNote(int note) {
        lstGrades.add(note);
    }
    public double calculateFinalGrade(Student a){
        List<Integer> notes = getLstGrades();
        int sumNotes = 0;
        for (int nota : notes) {
            sumNotes += nota;
        }
        return (double) sumNotes / notes.size();
    }
}
