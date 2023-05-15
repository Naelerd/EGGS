package EjerciciosPracticos.Guia2;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int correctas = 0, incorrectas = 0;
        String cadena;

        do {
            System.out.println("Ingrese el codigo - para finalizar ingrese [&&&&&]");
            cadena = teclado.nextLine();

            boolean b = cadena.length() <= 5 && cadena.startsWith("X") && cadena.endsWith("O");
            if (b) {
                correctas++;
            } else {
                incorrectas++;
            }
        } while (!"&&&&&".equals(cadena));

        System.out.println("Codigo CORRECTO:" + correctas
                + "\nCodigo INCORRECTO:" + (incorrectas - 1));
    }
}
