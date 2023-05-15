package EjerciciosPracticos.Guia4.EXTRAS;

/* Realizar un programa que complete un vector con los N primeros números de la sucesión de Fibonacci. Recordar que la sucesión de 
Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),   */
public class Ejercicio7 {

    public static void main(String[] args) {
        final int MAX_VECTOR = 10;

        int[] vector = new int[MAX_VECTOR];
        fibonacci(vector);

    }

    public static void fibonacci(int[] vector) {
        int total = vector.length;
        int resultado = 0;

        int auxiliar = 1;
        int contador = 0;
        int i = 0;
        do {
            resultado = i + auxiliar;
            auxiliar = i;
            i = resultado;
            vector[contador] = resultado;
            System.out.println(vector[contador]);
            contador++;

        } while (contador < total);

    }
}
