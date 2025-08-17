
package clasificacionedad;

import java.util.Scanner;

/**
 *
 * @author Gianina
 */
public class ClasificacionEdad {

   
    public static void main(String[] args) {
        
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        
        int edad = leer.nextInt();
        
        if(edad < 12){
            System.out.println("Usted es un niño");
           } else if (edad >=12 && edad <= 17){
                System.out.println("Usted es un adolescente");
        } else if (edad >= 18 && edad <= 59){
                System.out.println("Usted es un adulto");
             }   else
                System.out.println("Usted es un adulto mayor");
     
                   
        }
                
    }
    

