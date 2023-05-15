package EjerciciosPracticos.Guia4;

import java.util.Random;

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1
 * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        int one = 0, two = 0, three = 0, foor = 0, five = 0;
        String aPalabra;
        int vect[] = new int[10];
        Random aleatorio = new Random();

        for (int i = 0; i < vect.length; i++) {
            vect[i] = aleatorio.nextInt(1000 - 1 + 1);
        }

        for (int i = 0; i < vect.length; i++) {
            if (i <= 8) {
                System.out.print(vect[i] + " - ");
            } else {
                System.out.print(vect[i]);
            }
        }

        for (int i = 0; i < vect.length; i++) {
            aPalabra = String.valueOf(vect[i]);

            switch (aPalabra.length()) {
                case 1:
                    one += 1;
                    break;
                case 2:
                    two += 1;
                    break;
                case 3:
                    three += 1;
                    break;
                case 4:
                    foor += 1;
                    break;
                case 5:
                    five += 1;
                    break;
            }
        }
        System.out.println("");
        System.out.println("Numeros con 1 digito: " + one);
        System.out.println("Numeros con 2 digito: " + two);
        System.out.println("Numeros con 3 digito: " + three);
        System.out.println("Numeros con 4 digito: " + foor);
        System.out.println("Numeros con 5 digito: " + five);
    }

}
