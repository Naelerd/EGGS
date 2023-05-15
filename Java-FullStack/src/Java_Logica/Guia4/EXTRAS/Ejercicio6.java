package EjerciciosPracticos.Guia4.EXTRAS;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {

    /*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando, construya una 
“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de 
manera aleatoria. Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente 
imprima por pantalla la sopa de letras creada. */
    public static void main(String[] args) {
        final int CARACT_MAX = 5;
        final int CARACT_MIN = 3;
        final int PALABRAS_MAX = 5;
        final int TAMANO = 20;

        char[][] sopa = new char[TAMANO][TAMANO];
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        String palabras = "";
        Random random = new Random();
        int fila = 0;

        for (int i = 0; i < PALABRAS_MAX; i++) {
            fila = random.nextInt(20);

            do {
                System.out.print("Ingrese una palabra entre 3 y 5 caracteres: ");
                palabras = teclado.nextLine();
            } while (palabras.length() < CARACT_MIN || palabras.length() > CARACT_MAX);
            for (int j = 0; j < palabras.length(); j++) {
                sopa[fila][j] = palabras.charAt(j);
            }
        }

        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa.length; j++) {
                if (sopa[i][j] == '\u0000') {
                    sopa[i][j] = (char) ('0' + random.nextInt(10));
                }
                System.out.print(sopa[i][j] + "\t");
            }
            System.out.println(" ");
        }

    }
}
