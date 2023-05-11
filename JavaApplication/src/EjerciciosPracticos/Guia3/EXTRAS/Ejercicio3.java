package EjerciciosPracticos.Guia3.EXTRAS;

import java.util.Scanner;

/*Diseñar un procedimiento que permita convertir coordenadas polares (radio, ángulo) 
en cartesianas (x,y). NOTA: x=radio*cos(ángulo) e y=radio*sen(ángulo). */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        double rad, ang;

        System.out.println("Ingrese el radio de sus cordenadas polares.");
        rad = teclado.nextInt();

        System.out.println("Ingrese el angulo de sus cordenadas polares.");
        ang = teclado.nextInt();

        System.out.println("Cordenadas polares:"
                + "\nRadio:" + rad
                + "\nAngulo:" + ang
                + "\n"
                + "\nCordenadas cartesianas:"
                + "\nX:" + radio(rad, ang)
                + "\nY:" + angulo(rad, ang));

    }

    public static double radio(double radio, double angulo) {
        double anguloCorrect = Math.toRadians(angulo);
        return radio * Math.cos(anguloCorrect);

    }

    public static double angulo(double radio, double angulo) {
        double anguloCorrect = Math.toRadians(angulo);
        return radio * Math.sin(anguloCorrect);

    }
}
