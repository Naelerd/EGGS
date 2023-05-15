package EjerciciosPracticos.Guia2.EXTRAS;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int aleatorio = (int) (Math.random() * 10 * Math.random() * 10);
        int num, diferencia;
        boolean adivino = false;

        do {
            System.out.println("Bienvenido al juego ADIVINADOR, ingresa el numero para ver si le atinas.");
            num = teclado.nextInt();

            if (num == aleatorio) {
                adivino = true;
            } else {
                diferencia = Math.abs(num - aleatorio);

                if (diferencia <= 4) {
                    System.out.println("CALIENTE.");
                } else if (diferencia <= 10) {
                    System.out.println("TIBIO.");
                } else {
                    System.out.println("FRIO.");
                }
            }
        } while (!adivino);
        System.out.println("Felicitaciones, has ganado el juego!");
    }
}
