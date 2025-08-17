package sumanumerospares;

import java.util.Scanner;

/**
 *
 * @author Gianina
 */
public class SumaNumerosPares {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num= -1;
       
        int sumaPares=0; 

        while (num != 0 && num != 0) {
        System.out.println("Ingrese números que sean distinto de cero y realizaremos la suma. Para cortar el ciclo presione 0.");
         num = leer.nextInt();
        if (num % 2 == 0){
            sumaPares= num + sumaPares;
            
        } 
        
        }
         System.out.println("La suma de los números pares ingresados es: " + sumaPares);
    }

}
