//  Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.  
//  Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A. 
//  Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.  
//  Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del 
//  tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio. 
package EjerciciosPracticos.Guia2.EXTRAS;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
 
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        String tipoS;
        double tratamiento;
        double descuento;

        do {
            System.out.println("Ingrese con su respectiva letra el tipo de socio que usted es:"
                    + "\nTipo [A]"
                    + "\nTipo [B]"
                    + "\nTipo [C]"
                    + "\nExit [D]");
            tipoS = teclado.next();

            switch (tipoS.toUpperCase()) {
                case "A":
                    System.out.println("Ingrese el costo del tratamiento.");
                    tratamiento = teclado.nextInt();

                    tratamiento += 1000;
                    descuento = tratamiento * 0.50;
                    tratamiento -= descuento;

                    System.out.println("El costo de su tratamiento mas la cuota de $1000 pesos, es de: $" + Math.round(tratamiento));
                    System.out.println(" ");
                    break;
                case "B":
                    System.out.println("Ingrese el costo del tratamiento.");
                    tratamiento = teclado.nextInt();

                    tratamiento += 500;
                    descuento = tratamiento * 0.35;
                    tratamiento -= descuento;

                    System.out.println("El costo de su tratamiento mas la cuota de $500 pesos y el descuento de 35%, es de: $" + Math.round(tratamiento));
                    System.out.println(" ");
                    break;
                case "C":
                    System.out.println("Ingrese el costo del tratamiento.");
                    tratamiento = teclado.nextInt();
                    System.out.println("El costo de su tratamiento sin descuento es de: $" + Math.round(tratamiento));
                    System.out.println(" ");
                    break;
            }
        } while (!"D".equals(tipoS));
        System.out.println("Gracias por utilizar nuestra APP.");
    }
}
