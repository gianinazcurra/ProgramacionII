
package mayortresnumeros;

import java.util.Scanner;

/**
 *
 * @author Gianina
 */
public class MayorTresNumeros {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número: ");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = leer.nextInt();
        System.out.println("Ingrese el tercer número: ");
        int num3 = leer.nextInt();
        
        if (num1 > num2 && num1 > num3){
            System.out.println("El número mayor es: " + num1 );
           }  else if (num2 > num1 && num2 > num3 )
               System.out.println("El número mayor es: " + num2);
           else System.out.println("EL número mayor es: " + num3);
               
        }
    }
    

