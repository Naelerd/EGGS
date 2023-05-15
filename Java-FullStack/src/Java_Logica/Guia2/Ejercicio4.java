package EjerciciosPracticos.Guia2;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        String palabra = "";

        System.out.println("Escriba una palabra");
        palabra = teclado.nextLine();

        palabra.equalsIgnoreCase(palabra);
        if (palabra.substring(0, 1).equalsIgnoreCase("a")) {
            System.out.println("CORRECTO!");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
