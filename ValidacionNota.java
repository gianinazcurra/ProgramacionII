package validacionnota;

import java.util.Scanner;

/**
 *
 * @author Gianina
 */
public class ValidacionNota {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int nota;

        do {
            System.out.println("Ingrese una nota entre 0 y 10");
            nota = leer.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Ingrese una nota entre 0 y 10");
            }

        } while (nota < 0 || nota > 10);
        System.out.println("Nota guardada correctamente.");
    }

}
