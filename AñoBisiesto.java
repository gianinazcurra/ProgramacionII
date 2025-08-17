
package añobisiesto;

import java.util.Scanner;

/**
 *
 * @author Gianina
 */
public class AñoBisiesto {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un año y le diremos si es, ha sido o es bisiesto");
        int anio = leer.nextInt();
        
        if ((anio % 4 == 0 &&  anio % 100 != 0) || (anio % 400 == 0 )){
            System.out.println("El año ingresado es bisiesto");
           } else 
            System.out.println("El año ingresado no es bisiesto");
    }
    
}
