import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
 * productos que venderemos y el precio que tendrán. Además, se necesita que la
 * aplicación cuente con las funciones básicas.
 * Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
 * eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
 * Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
 * Realizar un menú para lograr todas las acciones previamente mencionadas.

 */
public class ProductService {
    private HashMap<String,Double> lstProducts;
    public HashMap<String,Double> getAllProducts(){
        return lstProducts;
    }
    public void createAndAdd(String name, Double price){
        Product p = new Product(name,price);
        lstProducts.put(name,price);
    }
    public boolean searchProduct(String name){
        boolean check = false;

        for (Map.Entry<String, Double> entry : lstProducts.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            if (key.equalsIgnoreCase(name)) {
                check = true;
                break;
            } else {
                check = false;
            }
        }
        return check;
    }
    public void changeProductPrice(String productToChange,Double newPrice){
        lstProducts.put(productToChange,newPrice);
    }

    public void removeProduct(String productToRemove){
        lstProducts.remove(productToRemove);
    }






}
