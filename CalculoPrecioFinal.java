package calculopreciofinal;

import java.util.Scanner;

/**
 *
 * @author Gianina
 */
public class CalculoPrecioFinal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        double impuesto;
        double descuento;
        double precioBase;

        System.out.println("Ingrese el precio base del producto: ");
        precioBase = leer.nextDouble();

        System.out.println("Ingrese el impuesto en porcentaje: ");
        impuesto = leer.nextDouble();

        System.out.println("Ingrese el descuento en porcentaje: ");
        descuento = leer.nextDouble();

        double precioFinal = calcularPrecioFinal(impuesto, descuento, precioBase);
        System.out.println("El precio final es: " + precioFinal);
    }

    private static double calcularPrecioFinal(double impuesto, double descuento, double precioBase) {
        double precioFinal = precioBase + (precioBase * impuesto / 100) - (precioBase * descuento / 100);
        return precioFinal;
    }

}
