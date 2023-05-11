package EjerciciosPracticos.Guia4.EXTRAS;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int n = 0;

        System.out.println("Ingrese el tamaño de la matriz.");
        n = teclado.nextInt();

        int[][] numeros = new int[n][n];
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                int valores = 0;
                do {
                    System.out.println("Ingrese un valor entre (1-9) para el elemento N: " + "[" + i + "]" + "[" + j + "]");
                    valores = teclado.nextInt();
                } while (valores == 0 || valores > 9);
                numeros[i][j] = valores;
            }
        }

        int sumaElementos = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                sumaElementos += numeros[i][j];
            }
        }

        System.out.println("La suma de todos los elementos da un total de: " + sumaElementos);
    }

}
