package EjerciciosPracticos.Guia2;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int num = 0;

        System.out.println("Ingrese un numero.");
        num = teclado.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero ingresado es PAR.");
        } else {
            System.out.println("El numero ingresado es IMPAR.");
        }
    }
}
