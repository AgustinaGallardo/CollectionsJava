package Service;

import Entity.Dog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DogService {
     private List<Dog> lstDogs ;
     private List<String> lstRace;
     private Scanner sc;
     public DogService() {
         lstDogs = new ArrayList<>();
         lstRace = new ArrayList<>();
      sc = new Scanner(System.in);
     }
     public void loadList(){
         Dog dog = new Dog();
         System.out.println("Ingrese el nombre del perro");
         dog.setName(sc.nextLine());
         System.out.println("Ingrese la raza del perro");
         String race = sc.nextLine();
         dog.setRace(race);
         lstRace.add(race);
         lstDogs.add(dog);
     }
     public void showListDogs(){
         for (Dog p: lstDogs
              ) {
             System.out.println(p);
         }
     }
    public void showListRace(){
        for (String r: lstRace
        ) {
            System.out.println(lstRace);
        }
        Collections.sort(lstRace);
    }
    public void selectionDog(){
        System.out.println("Seleccione un perro");
        String selectionDog = sc.nextLine();
        boolean foundDog = false;

        for (Dog p : lstDogs) {
            if (p.getName().equalsIgnoreCase(selectionDog)) {
                lstDogs.remove(p);
                foundDog = true;
                System.out.println("Se eliminó " + selectionDog + " de la lista!");
                showListDogs();
            }
        }
        if (!foundDog) {
            System.out.println("No se encuentra ese perro en la lista");
            showListDogs();
        }
    }
}
