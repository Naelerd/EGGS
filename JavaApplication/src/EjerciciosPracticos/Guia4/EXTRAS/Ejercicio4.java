package EjerciciosPracticos.Guia4.EXTRAS;

import java.util.Scanner;

public class Ejercicio4 {

    /*Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 10 alumnos para luego obtener una 
cantidad de aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. 

Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del programa los profesores necesitan obtener por pantalla la 
cantidad de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso. */
    public static void main(String[] args) {
        final int NUM_ALUMNOS = 10;
        final double TP1_PONDERACION = 0.1;
        final double TP2_PONDERACION = 0.15;
        final double INT1_PONDERACION = 0.25;
        final double INT2_PONDERACION = 0.5;
        final int NOTA_MIN_APROBACION = 7;

        String[] alumnos = new String[NUM_ALUMNOS];
        double[] promedio = new double[NUM_ALUMNOS];
        int aprobados = 0;
        int desaprobados = 0;

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < NUM_ALUMNOS; i++) {
            System.out.println("Ingrese el nombre del alumno N: " + (i + 1));
            alumnos[i] = teclado.next();

            double tp1Nota, tp2Nota, int1Nota, int2Nota;
            System.out.println("Ingrese la nota del alumno " + alumnos[i] + " en su primer trabajo practico: ");
            tp1Nota = teclado.nextDouble();
            if (tp1Nota >= NOTA_MIN_APROBACION) {
                promedio[i] += tp1Nota * TP1_PONDERACION;
            }

            System.out.println("Ingrese la nota del alumno " + alumnos[i] + " en su segundo trabajo practico: ");
            tp2Nota = teclado.nextDouble();
            if (tp2Nota >= NOTA_MIN_APROBACION) {
                promedio[i] += tp2Nota * TP2_PONDERACION;
            }

            System.out.println("Ingrese la nota del alumno " + alumnos[i] + " en su primer integrador: ");
            int1Nota = teclado.nextDouble();
            if (int1Nota >= NOTA_MIN_APROBACION) {
                promedio[i] += int1Nota * INT1_PONDERACION;
            }

            System.out.println("Ingrese la nota del alumno " + alumnos[i] + " en su segundo integrador: ");
            int2Nota = teclado.nextDouble();
            if (int2Nota >= NOTA_MIN_APROBACION) {
                promedio[i] += int2Nota * INT2_PONDERACION;
            }

            promedio[i] = Math.round(promedio[i] * 100.0) / 100.0; // Redondear a dos decimales
        }

        for (int i = 0; i < NUM_ALUMNOS; i++) {
            if (promedio[i] >= 7) {
                System.out.println("El alumno " + alumnos[i] + " aprobo con un promedio de " + promedio[i]);
                aprobados++;
            } else {
                System.out.println("El alumno " + alumnos[i] + " desaprobo con un promedio de " + promedio[i]);
                desaprobados++;
            }
        }

        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);

    }
}
