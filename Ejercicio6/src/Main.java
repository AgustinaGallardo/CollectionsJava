import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        int menuOption;
        String option;
        String name;
        String productToChange;
        String productToRemove;
        Double price;
        Double newPrice;

        ProductService ss = new ProductService();
        HashMap<String, Double> products = ss.getAllProducts();

        while (!exit) {
            System.out.println("1. Add new product.");
            System.out.println("2  Change the price of a product.");
            System.out.println("3. Remove a product.");
            System.out.println("4. View all available products.");
            System.out.println("5. Exit.");

            System.out.println("Enter the option you want to do.");
            menuOption = sc.nextInt();
            sc.nextLine();

            switch (menuOption) {
                case 1:
                    do {

                        System.out.println("Please enter the name of the product.");
                        name = sc.nextLine().toLowerCase();
                        System.out.println("Enter the price of the product.");
                        price = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("");

                        ss.createAndAdd(name,price);

                        System.out.println("Would you like to add another product? Please answer with yes/no.");
                        option = sc.nextLine();

                        while (!option.equalsIgnoreCase("yes") && !option.equalsIgnoreCase("no")) {
                            System.out.println("");
                            System.out.println("Invalid response, please enter yes or no.");
                            option = sc.nextLine();

                        }

                    } while (option.equalsIgnoreCase("yes"));
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Enter the name of the product you want to change its price.");
                    productToChange = sc.nextLine().toLowerCase();
                    if (ss.searchProduct(productToChange)) {
                        System.out.println("Enter the new price of the product.");
                        newPrice = sc.nextDouble();
                        sc.nextLine();
                        ss.changeProductPrice(productToChange, newPrice);
                        System.out.println("The price of the product was successfully modified.");
                    } else {
                        System.out.println("The product entered is not available.");
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Enter the name of the product you want to remove.");
                    productToRemove = sc.nextLine().toLowerCase();
                    ;
                    if (ss.searchProduct(productToRemove)) {
                        ss.removeProduct(productToRemove);
                        System.out.println("The product was successfully removed.");
                    } else {
                        System.out.println("The product entered is not available.");
                    }
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("List of products.");
                    for (Map.Entry<String, Double> entry : products.entrySet()) {
                        String key = entry.getKey();
                        Double value = entry.getValue();
                        System.out.println(key + " - $" + value);
                        System.out.println("");
                    }
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


