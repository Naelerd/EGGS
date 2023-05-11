package EjerciciosPracticos.Guia4;

import java.util.Scanner;

/**
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
 * y le pida al usuario un número a buscar en el vector. El programa mostrará
 * dónde se encuentra el numero y si se encuentra repetido
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int vect[] = new int[10];
        int eleccion;

        for (int i = 0; i < vect.length; i++) {
            vect[i] = (int) (Math.random() * 10);
            if (i <= 8) {
                System.out.print(vect[i] + " - ");
            } else {
                System.out.println(vect[i]);
            }
        }
        System.out.println("Numero a elegir.");
        eleccion = teclado.nextInt();

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] == eleccion) {
                System.out.println("Encontramos coincidencias en el vector N:" + (i + 1));

            }
        }
    }
}
