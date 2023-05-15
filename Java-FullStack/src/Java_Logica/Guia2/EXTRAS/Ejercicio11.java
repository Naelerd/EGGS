package EjerciciosPracticos.Guia2.EXTRAS;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int num = 0, contador = 0;

        System.out.println("Ingresa una cadena de N.");
        num = teclado.nextInt();

        do {
            num /= 10;
            contador++;
        } while (num > 0);

        System.out.println("La cadena numerica tiene " + contador + " digitos");
    }
}
