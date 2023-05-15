package EjerciciosPracticos.Guia2.EXTRAS;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int escalera = 0;

        System.out.println("Ingrese la altura de la escalera.");
        escalera = teclado.nextInt();

        for (int i = 1; i <= escalera; i++) {
            System.out.println(" ");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
        }
        System.out.print(" ");
    }
}
