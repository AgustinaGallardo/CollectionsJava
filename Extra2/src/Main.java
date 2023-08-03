import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
     * tendrá como atributos el nombre y discoConMasVentas.
     * Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos
     * de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante
     * y su disco con más ventas por pantalla.
     * Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
     * agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario
     * elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios
     * @param args
     */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        FamousSingerService ss = new FamousSingerService();
        boolean exit = false;
        int menuOption;
        String option;


        while (!exit) {
            System.out.println("1. Add new singer.");
            System.out.println("2  See all singers.");
            System.out.println("3. Remove a singer.");
            System.out.println("4. Exit.");

            System.out.println("Enter the option you want to do.");
            menuOption = sc.nextInt();
            sc.nextLine();

            switch (menuOption) {
                case 1:
                    do {
                        System.out.println("Add famous singer");
                        String name = sc.nextLine();
                        System.out.println("Add the most selling album");
                        String cs = sc.nextLine();
                        ss.addFamousSinger(name, cs);

                        System.out.println("Would you like to add another singer? Please answer with yes/no.");
                        option = sc.nextLine();

                        while (!option.equalsIgnoreCase("yes") && !option.equalsIgnoreCase("no")) {
                            System.out.println("");
                            System.out.println("Invalid response, please enter yes or no.");
                            option = sc.nextLine();
                        }

                    } while (option.equalsIgnoreCase("yes"));
                    break;
                case 2:
                    ss.showAllSingers();
                    break;
                case 3:
                    System.out.println("Who do you wont remove?");
                    String name = sc.nextLine();
                    ss.removeSinger(name);
                    break;
                case 4:
                    System.out.println("Exiting the menu...");
                    exit = true;
                    break;

                default:
                    System.out.println("Error. You must choose a valid option.");
                    System.out.println("");

            }
        }
    }
}