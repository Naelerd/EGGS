package EjerciciosPracticos.Guia1;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        String frase = "";

        System.out.println("Escriba una frase.");
        frase = teclado.nextLine();

        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
}
