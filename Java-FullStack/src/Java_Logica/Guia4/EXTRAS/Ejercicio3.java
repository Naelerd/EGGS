package EjerciciosPracticos.Guia4.EXTRAS;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector.");
        int tamaño = teclado.nextInt();

        int[] numeros = generarNumerosAleatorios(tamaño);
        imprimir(numeros);
    }

    public static int[] generarNumerosAleatorios(int tamaño) {
        int[] vector = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {
            vector[i] = (int) (Math.random() * 9) + 1;
        }
        return vector;
    }

    public static void imprimir(int[] elementos) {
        int total = elementos.length;

        for (int i = 0; i < total; i++) {
            System.out.print(elementos[i] + "\t");
        }
        System.out.println(" ");
    }
}
