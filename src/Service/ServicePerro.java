package Service;

import Entity.Perro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ServicePerro {
     private List<Perro> lstPerros ;
     private List<String> lstRazas;
     private Scanner sc;
     public ServicePerro() {
      lstPerros = new ArrayList<>();
      lstRazas = new ArrayList<>();
      sc = new Scanner(System.in);
     }
     public void cargarLista(){
         Perro perro = new Perro();
         System.out.println("Ingrese el nombre del perro");
         perro.setNombre(sc.nextLine());
         System.out.println("Ingrese la edad del perro");
         perro.setEdad(Integer.parseInt(sc.nextLine()));
         System.out.println("Ingrese la raza del perro");
         String raza = sc.nextLine();
         perro.setRaza(raza);
         lstRazas.add(raza);
         lstPerros.add(perro);
     }
     public void mostrarListaPerros(){
         for (Perro p: lstPerros
              ) {
             System.out.println(p);
         }
     }
    public void mostrarListaRazas(){
        for (String r: lstRazas
        ) {
            System.out.println(lstRazas);
        }
        Collections.sort(lstRazas);
    }
    public void seleccionPerro(){
        System.out.println("Seleccione un perro");
        String perroSeleccionado = sc.nextLine();
        boolean perroEncontrado = false;

        for (Perro p : lstPerros) {
            if (p.getNombre().equalsIgnoreCase(perroSeleccionado)) {
                lstPerros.remove(p);
                perroEncontrado = true;
                System.out.println("Se eliminó " + perroSeleccionado + " de la lista!");
                mostrarListaPerros();
            }
        }
        if (!perroEncontrado) {
            System.out.println("No se encuentra ese perro en la lista");
            mostrarListaPerros();
        }
    }
}
