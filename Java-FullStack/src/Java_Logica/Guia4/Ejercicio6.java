package EjerciciosPracticos.Guia4;

import java.util.Scanner;

/* Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, sus columnas y 
sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es 
mágico o no. El programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9. */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int[][] matriz = new int[3][3];
        int iCentro = 0, jCero = 0, diagonal = 0;
        boolean esMagic = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int valor;
                do {
                    System.out.println("Ingrese un valor para el elemento N: " + "[" + i + "]" + "[" + j + "]");
                    valor = teclado.nextInt();
                } while (valor == 0 || valor > 9);
                matriz[i][j] = valor;
            }

        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == 0) {
                    jCero += matriz[i][j];
                }
                if (i == 1) {
                    iCentro += matriz[i][j];
                }
                if (i == j) {
                    diagonal += matriz[i][j];
                }
            }
        }

        if (jCero == iCentro && iCentro == diagonal) {
            esMagic = true;
            System.out.println("La matriz es magica!");
        } else {
            System.out.println("La matriz no es magica!");
        }
    }
}
