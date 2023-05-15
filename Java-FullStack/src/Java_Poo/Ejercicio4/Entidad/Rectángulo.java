package Java_Poo.Ejercicio4.Entidad;

import java.util.Scanner;

/* Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. La clase incluirá un método 
para crear el rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la superficie del rectángulo y un 
método para calcular el perímetro del rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura.
Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
public class Rectángulo {

    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    private int base;
    private int altura;
    private int resultado;
    private int[][] rectangulo;

    public Rectángulo() {
    }

    public Rectángulo(int base, int altura, int resultado) {
        this.base = base;
        this.altura = altura;
        this.resultado = resultado;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int[][] getRectangulo() {
        return rectangulo;
    }

    public void setRectangulo(int[][] rectangulo) {
        this.rectangulo = rectangulo;
    }

    public void crearRectángulo() {
        System.out.println("Ingrese la base del rectangulo: ");
        this.base = teclado.nextInt();

        System.out.println("Ingrese la altura del rectangulo: ");
        this.altura = teclado.nextInt();

        this.rectangulo = new int[altura][base];
    }

    public void calcularSuperficie() {
        this.resultado = base * altura;
        System.out.println("La superficie del rectangulo es: " + resultado);
    }

    public void calcularPerímetro() {
        this.resultado = (base + altura) * 2;
        System.out.println("El perimetro del rectangulo es: " + resultado);
    }

    public void dibujarRectangulo() {
        System.out.println("Rectangulo en 2D:");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }
    }
}
