package EjerciciosPracticos.Guia3.EXTRAS;

import java.util.Random;
import java.util.Scanner;

/* Implementar una función que permita obtener un número entero aleatorio 
  comprendido entre dos límites que introduciremos por teclado. 
  El número obtenido se debe mostrar por pantalla. */
public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int min, max;

        System.out.println("Escriba un numero minimo.");
        min = teclado.nextInt();

        System.out.println("Escribe un numero maximo.");
        max = teclado.nextInt();

        System.out.println("El numero aleatorio es: " + aleatorio(min, max));

    }

    public static int aleatorio(int min, int max) {

        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
