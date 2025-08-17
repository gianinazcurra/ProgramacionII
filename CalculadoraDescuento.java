package calculadoradescuento;

import java.util.Scanner;

/**
 *
 * @author Gianina
 */
public class CalculadoraDescuento {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double descuento;
        double precioFinal;

        System.out.println("Ingrese el precio del producto: ");
        double precio = leer.nextDouble();
        System.out.println("Ingrese la categoría del producto A, B ó C: ");
        String categoria = leer.next();

        if (categoria.equals("A")) {
            descuento = precio * 0.1;
        } else if (categoria.equals("B")) {
            descuento = precio * 0.15;
        } else {
            descuento = precio * 0.20;
        }
        
        precioFinal= precio - descuento; 
        
        System.out.println("El precio original del producto fué de: " + precio + "El "
                + "descuento aplicado es de: " + descuento + " Y el precio final del producto es: " + precioFinal);

    }
}
