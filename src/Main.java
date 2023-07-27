import Service.DogService;

import java.util.Scanner;

public class Main {
    /**
     * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
     * programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
     * después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
     * salir, se mostrará todos los perros guardados en el ArrayList.
     *
     * 2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
     * un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
     * está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
     * ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
     * la lista ordenada.
     * @param args
     */
    public static void main(String[] args) {
        DogService ser = new DogService();

        Scanner sc = new Scanner(System.in);
        int num = -1;
        System.out.println("Bienvenido a la veterinaria de perros");
        do{
            System.out.println("Ingrese uno si quiere ingresar un perro");
            System.out.println("Ingrese dos si quiere ver la lista de perros");
            System.out.println("Ingrese tres si quiere ver la lista de razas");
            System.out.println("Ingrese cuatro si quiere eliminar un perro");
            System.out.println("Ingrese 0 para salir");
            num = Integer.parseInt(sc.nextLine());

            switch (num) {
                case 1 -> ser.loadList();
                case 2 -> ser.showListDogs();
                case 3 -> ser.showListRace();
                case 4 -> ser.selectionDog();
                case 0 -> System.out.println("Hasta la proxima!");
                default -> System.out.println("Opción inválida, por favor ingrese una opción válida.");
            }

        }while (num != 0);
    }
}