import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /**
     * Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
     * los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
     * introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
     * programa mostrará por pantalla el número de valores que se han leído, su suma y su
     * media (promedio).
     */
    public static void main(String[] args) {
        List<Integer> lstNumber = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Boolean end = false;

        System.out.println("Ingrese numeros para sumar y sacara promedio cuando quiera parar ingrese -99");

        do{
            Integer num = sc.nextInt();
            sc.nextLine();
            if(num != -99){
                lstNumber.add(num);
                end = true;
            }
            else{
                end = false;
                alleNumbers(lstNumber);
                averageNumbers(lstNumber);
                sumNumbers(lstNumber);
                System.out.println("Bye");
            }

        }while (end);
    }
    public static void alleNumbers(List<Integer> lstNumber){
        System.out.println("The numbers are:");
        for (Integer n:lstNumber
        ) {
            System.out.println(n);
        }
    }

    public static void averageNumbers(List<Integer> lstNumber){
        double total = 0;
        for (Integer n:lstNumber
        ) {
            total += n;
        }
       double average = lstNumber.size();
        System.out.println("The average of all the numbers are " + total/average);
    }
    public static void sumNumbers(List<Integer> lstNumber){
        Integer total = 0;
        for (Integer n:lstNumber
        ) {
            total += n;
        }
        System.out.println("The sum of all the numbers are " + total);
    }




}