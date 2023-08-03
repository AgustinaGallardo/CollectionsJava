import java.util.Scanner;

public class Main {
    /**
     *

     * Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
     * busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
     * método decrementa de a uno, como un carrito de compras, el atributo ejemplares
     * prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
     * produzca la devolución de un libro. No se podrán devolver libros donde que no tengan
     * ejemplares prestados. Devuelve true si se ha podido realizar la operación y false en
     * caso contrario.
     * Método toString para mostrar los datos de los libros.
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ServiceBook ss = new ServiceBook();
        boolean exit = false;
        int menuOption;
        String option;


        while (!exit) {
            System.out.println("1. Add new book.");
            System.out.println("2  See all books.");
            System.out.println("3. Remove a book.");
            System.out.println("4. Borrow a book");
            System.out.println("5. Exit.");

            System.out.println("Enter the option you want to do.");
            menuOption = sc.nextInt();
            sc.nextLine();

            switch (menuOption) {
                case 1:
                    do {
                        System.out.println("Add book");
                        String name = sc.nextLine();
                        System.out.println("Add the name of the author");
                        String author = sc.nextLine();
                        System.out.println("Add name of copies");
                        Integer copies = Integer.parseInt(sc.nextLine());
                        System.out.println("Add name of borrowed copies");
                        Integer borrowedCopies = Integer.parseInt(sc.nextLine());
                        ss.addBook(name, author, copies, borrowedCopies);

                        System.out.println("Would you like to add another book? Please answer with yes/no.");
                        option = sc.nextLine();

                        while (!option.equalsIgnoreCase("yes") && !option.equalsIgnoreCase("no")) {
                            System.out.println("");
                            System.out.println("Invalid response, please enter yes or no.");
                            option = sc.nextLine();
                        }

                    } while (option.equalsIgnoreCase("yes"));
                    break;
                case 2:
                    ss.showAllBooks();
                    break;
                case 3:
                    System.out.println("Who do you wont remove?");
                    String name = sc.nextLine();
                    ss.removeBook(name);
                    break;
                case 4:
                    System.out.println("which book do you want to borrow");
                    String book = sc.nextLine();
                    ss.borrowBook(book);
                    break;
                case 5:
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