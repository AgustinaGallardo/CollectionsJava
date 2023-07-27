import Servive.MovieService;

public class Main {
    /**

     * • Mostrar en pantalla todas las películas.
     * • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
     * • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
     * pantalla.
     *
     * • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
     * pantalla.
     *
     * • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
     * • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
     *
     */
    public static void main(String[] args) {

        MovieService sc = new MovieService();
        sc.addMovie();
        sc.allMovies();
        sc.allMoviesMoreOne();
        sc.moviesOrderDuration();
        sc.moviesOrderDurationAscending();
        sc.moviesOrderTitle();
        sc.moviesOrderDirector();
    }
}