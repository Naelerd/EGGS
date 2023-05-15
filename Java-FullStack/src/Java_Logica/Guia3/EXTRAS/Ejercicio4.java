package EjerciciosPracticos.Guia3.EXTRAS;

import java.util.Scanner;

/* Crea un programa que pida el nombre al usuario y lo escriba al revés (de la última letra a la primera). */
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        String nombre;

        System.out.println("Escriba su nombre para escribirlo al revez.");
        nombre = teclado.next();
        nombre(nombre);
    }

    public static void nombre(String palabra) {

        for (int i = palabra.length() - 1; i >= 0; i--) {
            System.out.print(palabra.charAt(i));
        }
        System.out.println(" ");
    }

}
