package Entity;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
     private String nombreCompleto;
     private List<Integer> lstNotas;

    public Alumno(String nombreCompleto, List<Integer> lstNotas) {
        this.nombreCompleto = nombreCompleto;
        this.lstNotas = lstNotas;
    }

    public Alumno() {
        lstNotas = new ArrayList<>();
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public List<Integer> getLstNotas() {
        return lstNotas;
    }

    public void setLstNotas(List<Integer> lstNotas) {
        this.lstNotas = lstNotas;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", lstNotas=" + lstNotas +
                '}';
    }
    public void agregarNota(int nota) {
        lstNotas.add(nota);
    }
    public double calcularNotaFinal(Alumno a){
        List<Integer> notas = getLstNotas();
        int sumaNotas = 0;
        for (int nota : notas) {
            sumaNotas += nota;
        }
        return (double) sumaNotas / notas.size();
    }
}
