package calculocostoenvio;

import java.util.Scanner;

/**
 *
 * @author Gianina
 */
public class CalculoCostoEnvio {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        double peso;
        String zona;
        double precioProducto;

        System.out.println("Ingrese el precio del producto");
        precioProducto = leer.nextDouble();
        System.out.println("Ingrese el peso del producto");
        peso = leer.nextDouble();
        System.out.println("Ingrese si el envío es Nacional: N ó Internacional: I ");
        zona = leer.next();

        double costoEnvio = calcularCostoEnvio(peso, zona);
        double costoTotalCompra = calcularTotalCompra(precioProducto, peso);

        System.out.println("EL costo del envío es de: " + costoEnvio);
        System.out.println("El total de la compra incluyendo el envío es de: " + costoTotalCompra);
    }

    public static double calcularCostoEnvio(double peso, String zona) {
        double costoEnvio = 0;
        if (zona.equalsIgnoreCase("N")) {
            costoEnvio = peso * 5;
        } else if (zona.equalsIgnoreCase("I")) {
            costoEnvio = peso * 10;

        }
        return costoEnvio;
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        double totalCompra = costoEnvio + precioProducto;
        return totalCompra;
    }

}
