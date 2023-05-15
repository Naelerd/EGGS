package EjerciciosPracticos.Guia2.EXTRAS;

public class Ejercicio2 {

    public static void main(String[] args) {

        int a = 10, b = 100, c = 1000, d = 10000, aux;

        System.out.println("Variables Originales:"
                + "\nA:" + a
                + "\nB:" + b
                + "\nC:" + c
                + "\nD:" + d);

        System.out.println(" ");

        aux = d;
        d = c;
        c = b;
        b = a;

        System.out.println("Variables Actualizadas:"
                + "\nB:" + b
                + "\nC:" + c
                + "\nD:" + d
                + "\nAUX:" + aux);
    }
}
