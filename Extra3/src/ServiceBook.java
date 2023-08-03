import java.util.HashSet;

public class ServiceBook {
    HashSet<Book> lstBooks = new HashSet<>();


    public void addBook(String name, String author, Integer copies, Integer borrowedCopies) {
        Book b = new Book(name,author,copies,borrowedCopies);
        lstBooks.add(b);
    }

    public void showAllBooks() {
        for (Book b :lstBooks
             ) {
            System.out.println(b);
        }
    }
    public void removeBook(String name) {
        for (Book b : lstBooks){
            if(b.getTitle().equalsIgnoreCase(name)){
                lstBooks.remove(b);
                break;
            }
        }
    }
    /**
     * Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo busca
     * en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método. El
     * método se incrementa de a uno, como un carrito de compras, el atributo ejemplares
     * prestados, del libro que ingresó el usuario. Esto sucederá cada vez que se realice un
     * préstamo del libro. No se podrán prestar libros de los que no queden ejemplares
     * disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en
     * caso contrario.*/

    public boolean borrowBook(String bookName) {
    boolean ok = false;
        for (Book b : lstBooks
             ) {
            if(b.getTitle().equalsIgnoreCase(bookName)){
                if(b.getCopies() > 0){
                    b.borrowCopiesMoreOne();
                }else{
                    System.out.println("Sorry but we can´t borrow the book");
                    ok = false;
                }
            }
        }
        return ok;
    }



}
