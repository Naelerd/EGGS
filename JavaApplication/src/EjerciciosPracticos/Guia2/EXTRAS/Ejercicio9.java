// Simular la división usando solamente restas. Dados dos números enteros mayores que uno, realizar un algoritmo que calcule el cociente 
// y el residuo usando sólo restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, 
// este resultado es el residuo, y el número de restas realizadas es el cociente.

package EjerciciosPracticos.Guia2.EXTRAS;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int residuo = 0, cociente = 0;

        System.out.println("Ingrese el dividendo: ");
        int dividendo = leer.nextInt();
        
        System.out.println("Ingrese el divisor: ");
        int divisor = leer.nextInt();
       
        do {
            dividendo -= divisor;

            residuo = dividendo;
            cociente++;     
        } while (dividendo > divisor);

        System.out.println("El cociente de la division es: " + cociente);
        System.out.println("El residuo de la division es: " +residuo);
   }     
}

        
    

