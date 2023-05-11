package EjerciciosPracticos.Guia4;

public class Ejercicio4 {

    public static void main(String[] args) {

        int matriz[][] = new int[4][4];
        int revez[][] = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Matriz original:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                revez[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz al revez:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(revez[i][j] + " ");
            }
            System.out.println();
        }
    }
}
