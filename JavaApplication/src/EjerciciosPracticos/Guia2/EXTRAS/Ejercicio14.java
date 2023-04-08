package EjerciciosPracticos.Guia2.EXTRAS;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        
// Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos. 
// Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos para averiguar 
// la media de edad de los hijos de todas las familias. 

       
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int familias = 0, cantHijos = 0, edadHijos, promedio = 0, sumaHijos = 0;
        
        System.out.println("Cuantas familias estan presentes?");
        familias = teclado.nextInt();
        
        for(int i = 0; i < familias; i++){
            System.out.println("Cuantos hijos tiene la familia N" + (i + 1));
            cantHijos = teclado.nextInt();
            sumaHijos += cantHijos;
            
            for(int j = 0; j < cantHijos; j++){
                System.out.println("Que edad tiene el hijo N" + (j + 1));
                edadHijos = teclado.nextInt();
                promedio += edadHijos;
                
            }
        }
        promedio /= sumaHijos;
        
        System.out.println("El promedio de edad calculado entre " + sumaHijos + " niños es de: " + promedio);
   }
}

