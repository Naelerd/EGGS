package EjerciciosPracticos.Guia4.EXTRAS;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int tamañoUno = 0, tamañoDos = 0;
        boolean esIgual = false;

        System.out.println("Ingrese el tamaño del primer vector:");
        tamañoUno = teclado.nextInt();

        int[] vectorUno = new int[tamañoUno];
        for (int i = 0; i < tamañoUno; i++) {
            System.out.println("Ingrese el valor para el elemento N: " + vectorUno[i]);
            vectorUno[i] = teclado.nextInt();
        }

        System.out.println("Ingrese el tamaño del segundo vector:");
        tamañoDos = teclado.nextInt();

        int[] vectorDos = new int[tamañoDos];
        for (int i = 0; i < tamañoDos; i++) {
            System.out.println("Ingrese el valor para el elemento N: " + vectorDos[i]);
            vectorDos[i] = teclado.nextInt();
        }

        for (int i = 0; i < vectorUno.length; i++) {
            if (vectorUno[i] == vectorDos[i] && vectorUno.length == vectorDos.length) {
                esIgual = true;
            } else {
                esIgual = false;
            }
        }

        if (esIgual) {
            System.out.println("Los elementos de cada vector son iguales!");
        } else {
            System.out.println("Los elementos de cada vector NO son iguales.");
        }

    }
}
