package contador;

import java.util.Scanner;

/**
 *
 * @author Gianina
 */
public class Contador {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numeroIngresado;
        int numPositivos;
        int numNegativos;
        int ceros;
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un número entero: ");
            numeroIngresado = leer.nextInt();

            if (numeroIngresado > 0) {
                contadorPositivos += 1;
            } else if (numeroIngresado < 0) {
                contadorNegativos += 1;
            } else {
                contadorCeros += 1;
            }
        }
        System.out.println("Cantidad de números positivos: " + contadorPositivos);
        System.out.println("Cantidad de números negativos: " + contadorNegativos);
        System.out.println("Cantidad de ceros: " + contadorCeros);
    }
}
