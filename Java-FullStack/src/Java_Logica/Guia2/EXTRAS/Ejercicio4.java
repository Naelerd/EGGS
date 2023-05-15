package EjerciciosPracticos.Guia2.EXTRAS;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        String num;

        do {
            System.out.println("Ingrese un numero para convertirlo a romano.");
            System.out.println("Ingrese [0] en caso de querer finalizar.");
            num = teclado.next();

            switch (num) {
                case "1":
                    System.out.println("La representacion de " + num + " en N romanos es: I");
                    System.out.println(" ");
                    break;
                case "2":
                    System.out.println("La representacion de " + num + " en N romanos es: II");
                    System.out.println(" ");
                    break;
                case "3":
                    System.out.println("La representacion de " + num + " en N romanos es: III");
                    System.out.println(" ");
                    break;
                case "4":
                    System.out.println("La representacion de " + num + " en N romanos es: IV");
                    System.out.println(" ");
                    break;
                case "5":
                    System.out.println("La representacion de " + num + " en N romanos es: V");
                    System.out.println(" ");
                    break;
                case "6":
                    System.out.println("La representacion de " + num + " en N romanos es: VI");
                    System.out.println(" ");
                    break;
                case "7":
                    System.out.println("La representacion de " + num + " en N romanos es: VII");
                    System.out.println(" ");
                    break;
                case "8":
                    System.out.println("La representacion de " + num + " en N romanos es: VIII");
                    System.out.println(" ");
                    break;
                case "9":
                    System.out.println("La representacion de " + num + " en N romanos es: IX");
                    System.out.println(" ");
                    break;
                case "10":
                    System.out.println("La representacion de " + num + " en N romanos es: X");
                    System.out.println(" ");
                    break;
            }
        } while (!"0".equals(num));
        System.out.println("Gracias por ulitizar nuestra APP.");
    }
}
