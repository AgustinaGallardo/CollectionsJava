import java.util.*;

public class CountryService {
    private HashSet<Country> lstCountries;
    private Scanner sc;
    public CountryService() {
        lstCountries = new HashSet<>();
        sc = new Scanner(System.in);
    }
    public void createHash() {
        String out = "";
        do {
            Country c = new Country();
            System.out.println("Ingrese un pais: ");
            c.setName(sc.nextLine());
            lstCountries.add(c);
            System.out.println("¿Desea ingresar otro pais al conjunto? (S/N)");
            out = sc.nextLine();
        } while (out.equalsIgnoreCase("S"));
    }
    public void orderCountriesName() {
        List<String> lstNameCountry = new ArrayList<>();
        System.out.println("Los paises ordenados por nombre: ");
        for (Country c : lstCountries
        ) {
            String o = c.getName();
            lstNameCountry.add(o);
        }
        Collections.sort(lstNameCountry);
        System.out.println(lstNameCountry);
    }
    public void searchCountry() {
        System.out.println("Qué país quiere buscar y eliminar del conjunto");
        String deleteCountry = sc.nextLine();
        boolean found = false;
        Iterator<Country> iterator = lstCountries.iterator();
        while (iterator.hasNext()) {
            Country c = iterator.next();
            if (c.getName().equalsIgnoreCase(deleteCountry)) {
                iterator.remove();
                found = true;
            }
        }
        System.out.println("El conjunto de países es: ");
        System.out.println(lstCountries);
        if (!found) {
            System.out.println("No existe ese país en el conjunto");
        }
    }
}
