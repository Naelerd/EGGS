package EjerciciosPracticos.Guia2.EXTRAS;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
     
        int dias = 0, hora = 0, minutos = 0;
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese la cantidad de minutos para convertir.");
        minutos = teclado.nextInt();
        
        hora = minutos / 60;
        dias = hora / 24;
        
        System.out.println("Cantidad de minutos: " + minutos
                          +"\nCantidad de horas: " + hora
                          +"\nCantidad de dias: " + dias); 
    }
}
