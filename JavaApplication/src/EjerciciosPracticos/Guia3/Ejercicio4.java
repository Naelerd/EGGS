package EjerciciosPracticos.Guia3;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

// /*Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, 
//  estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir 
//  que será una cadena,
//  este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
//  El cambio de divisas es:
//  * 0.86 libras es un 1 €
//  * 1.09 $ es un 1 €
//  * 129.852 yenes es un 1 € */        
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        String tipoMoneda;
        double cantidad = 0;

        System.out.println("Ingresa la cantidad de euros que tiene para su conversion.");
        cantidad = teclado.nextInt();

        System.out.println("Ingrese el respectivo numero que hace referencia al tipo de moneda que quiere convertir."
                + "\n [1]-LIBRAS"
                + "\n [2]-DOLARES"
                + "\n [3]-YENES"
                + "\n [4]-SALIR");
        tipoMoneda = teclado.next();

        switch (tipoMoneda) {
            case "1":
                System.out.println(cantidad + " euros son: " + libras(cantidad));
                break;
            case "2":
                System.out.println(cantidad + " euros son: " + dolares(cantidad));
                break;
            case "3":
                System.out.println(cantidad + " euros son: " + yenes(cantidad));
                break;
            case "4":
                break;

        }
    }

    public static double libras(double cambio1) {
        cambio1 *= 0.88;
        return Math.floor(cambio1);
    }

    public static double dolares(double cambio2) {
        cambio2 *= 1.09;
        return Math.floor(cambio2);
    }

    public static double yenes(double cambio3) {
        cambio3 = cambio3 * 145.92;
        return Math.floor(cambio3);
    }

}
