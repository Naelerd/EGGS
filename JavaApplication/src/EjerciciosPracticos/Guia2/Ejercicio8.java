package EjerciciosPracticos.Guia2;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int num;

        System.out.println("Escriba el tamaño del cuadrado.");
        num = teclado.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || i == num - 1 || j == 0 || j == num - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("  ");
        }
    }
}
