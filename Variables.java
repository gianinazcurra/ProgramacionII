
package variables;

import java.util.Scanner;


public class Variables {

    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        
        String nombre = "Juan Pérez";
        String edad = "30 años";
        String direccion = "Calle Falsa 1,2,3";
        
       System.out.println("Nombre: \"" + nombre + "\"");
        System.out.println("Edad: \"" + edad + "\"");
        System.out.println("Dirección: \"" + direccion + "\"");
        
    }
    
}
