package EjerciciosPracticos.Guia4;

import java.util.Random;

public class Ejercicio5 {

    public static void main(String[] args) {

        int matriz[][] = new int[4][4];
        int antisimétrica[][] = new int[4][4];
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(10 - 1) + 1;
            }
        }

        System.out.println("Matriz original:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                antisimétrica[i][j] = matriz[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                antisimétrica[j][i] = -(antisimétrica[j][i]);
            }
        }

        System.out.println("Matriz antisimétrica");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(antisimétrica[j][i] + " ");
            }
            System.out.println("");
        }

    }
}
