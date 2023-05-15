package JAVA_POO.Ejercicio1.Entidad;

import java.util.Scanner;

/* Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos
pasados por parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método
el número de ISBN, el título, el autor del libro y el número de páginas. */
public class Libro {

    public int ISBN;
    public String Título;
    public String Autor;
    public int Número_páginas;

    public Libro() {
    }

    public Libro(int ISBN, String Título, String Autor, int Número_páginas) {
        this.ISBN = ISBN;
        this.Título = Título;
        this.Autor = Autor;
        this.Número_páginas = Número_páginas;
    }

    public void cargarLibro() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escriba el nombre del titulo: ");
        this.Título = teclado.nextLine();

        System.out.print("Escriba el autor del libro: ");
        this.Autor = teclado.nextLine();

        System.out.print("Escriba el N ISBN del libro:");
        this.ISBN = teclado.nextInt();

        System.out.print("Escriba el N de paginas: ");
        this.Número_páginas = teclado.nextInt();
    }

    public void devolverInformacion() {
        System.out.println("El libro " + this.Título + " del autor " + this.Autor + " contiene " + this.Número_páginas + " y el numero de ISBN es " + this.ISBN);
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTítulo() {
        return Título;
    }

    public void setTítulo(String Título) {
        this.Título = Título;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNúmero_páginas() {
        return Número_páginas;
    }

    public void setNúmero_páginas(int Número_páginas) {
        this.Número_páginas = Número_páginas;
    }

}
