package Servive;

import Entity.Movie;

import java.util.*;

/**
 *  En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
 *      * todos sus datos y guardándolos en el objeto Pelicula.
 *      * Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
 *      * crear otra Pelicula o no.
 */
public class MovieService {
    private List<Movie> lstMovies;
    private Scanner sc;
    public MovieService() {
        lstMovies = new ArrayList<>();
        sc = new Scanner(System.in);
    }
    public void addMovie(){
        String otherMovie ="";
        System.out.println("Bienvenido al Cine");
        do {
            Movie p = new Movie();
            System.out.println("Ingrese el titulo de la pelicula");
            p.setTitle(sc.nextLine());
            System.out.println("Ingrese el nombre del director");
            p.setDirector(sc.nextLine());
            System.out.println("Ingrese la duracionde de la pelicula en hs");
            p.setDuration(Integer.parseInt(sc.nextLine()));
            lstMovies.add(p);
            System.out.println("¿Desea crear otr a pelicula? (S/N)");
            otherMovie = sc.nextLine();
        } while (otherMovie.equalsIgnoreCase("S"));
    }
    public void allMovies(){
        System.out.println("Todas las peliculas del cine son:");
        for (Movie p :lstMovies) {
            System.out.println(p);
        }
    }
    public void allMoviesMoreOne(){
        boolean found = false;
        System.out.println("Las peliculas en las cuales su duración es mayor a 1 hora son: ");
        for (Movie p: lstMovies) {
            if(p.getDuration() > 1){
                System.out.println(p);
                found = true;
            }
        }
        if(!found){
            System.out.println("No hay ninguna pelicula que tenga una duracion menor a 1 hora");
        }
    }
    public void moviesOrderTitle(){
        List<String> lstMoviesTitle = new ArrayList<>();
        for (Movie p: lstMovies) {
            String m = p.getTitle();
            lstMoviesTitle.add(m);
        }
        Collections.sort(lstMoviesTitle);
        System.out.println("Las peliculas ordenadas por titulo son: ");
        for (String m: lstMoviesTitle) {
            System.out.println(m);
        }
    }
    public void moviesOrderDuration(){
        List<Integer> lstMoviesDuration = new ArrayList<>();
        for (Movie p: lstMovies) {
            Integer m = p.getDuration();
            lstMoviesDuration.add(m);
        }
        Collections.sort(lstMoviesDuration);
        System.out.println("Las peliculas ordenadas por duracion ascendente son:");
        for (Integer m: lstMoviesDuration) {
            System.out.println(m);
        }
    }
    public void moviesOrderDurationAscending(){
        List<Integer> lstMoviesDuration = new ArrayList<>();
        for (Movie p : lstMovies) {
            Integer m = p.getDuration();
            lstMoviesDuration.add(m);
        }
        System.out.println("Las peliculas ordenadas por duracion descendente son:");
        // Collections.reverseOrder() == Ordenar de menor a mayor
        Collections.sort(lstMoviesDuration, Collections.reverseOrder());
        for (Integer m : lstMoviesDuration) {
            System.out.println(m);
        }
    }
    public void moviesOrderDirector(){
        List<String> lstMoviesDirector = new ArrayList<>();
        for (Movie p: lstMovies) {
            String m = p.getDirector();
            lstMoviesDirector.add(m);
        }
        Collections.sort(lstMoviesDirector);
        System.out.println("Las peliculas ordenadas por director son:");
        for (String m: lstMoviesDirector
        ) {
            System.out.println(m);
        }
    }
}
