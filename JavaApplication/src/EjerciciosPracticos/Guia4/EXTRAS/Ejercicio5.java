package EjerciciosPracticos.Guia4.EXTRAS;

public class Ejercicio5 {

    public static void main(String[] args) {
        final int TAMAÑO = 10;
        int[] numeros = new int[TAMAÑO];

        int suma = aleatorioSuma(numeros);
        System.out.println("La suma de los números aleatorios es: " + suma);
    }

    public static int aleatorioSuma(int[] nums) {
        int total = nums.length;
        int resultado = 0;

        for (int i = 0; i < total; i++) {
            nums[i] = (int) (Math.random() * 9) + 1;
        }

        for (int i = 0; i < total; i++) {
            resultado += nums[i];
        }
        return resultado;
    }
}
