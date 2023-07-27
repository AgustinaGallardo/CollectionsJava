public class Main {

    public static void main(String[] args) {

        CountryService sc = new CountryService();
        sc.createHash();
        sc.orderCountriesName();
        sc.searchCountry();
    }
}