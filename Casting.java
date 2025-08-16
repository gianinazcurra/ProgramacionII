
package casting;

import java.util.Scanner;


public class Casting {


    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos números: ");
        double numero1 = leer.nextDouble();
        double numero2 = leer.nextDouble();
        
        double division = numero1 / numero2;
         System.out.println("El resultado es: " + division);
       
    }
    
}
