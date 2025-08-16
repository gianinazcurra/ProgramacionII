package operaciones;

import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numero1;
        int numero2;
        int suma;
        int resta;
        int multiplicacion;
        double division;

        System.out.println("Ingrese dos números: ");
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();
        
        suma = numero1+numero2;
        resta = numero1-numero2;
        multiplicacion= numero1 * numero2;
        division = numero1 / numero2;
        
        System.out.println("Los resultados de las operaciones son: ");
        System.out.println("Suma: " + suma);
  System.out.println("Resta: " + resta);
    System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("División: " + division);
    }
    }