import java.util.Scanner;

/* Desarrollar una clase Cancion con los siguientes atributos: título y autor. Se deberá definir además dos constructores: uno vacío que inicializa el 
título y el autor a cadenas vacías y otro que reciba como parámetros el título y el autor de la canción. Se deberán además definir los métodos getters y 
setters correspondientes.
 */
public class Cancion {

    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    private String titulo;
    private String autor;

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }

    public void llenarDatos() {
        System.out.println("Ingrese el titulo del libro: ");
        this.titulo = teclado.nextLine();

        System.out.println("Ingrese el autor del libro: ");
        this.autor = teclado.nextLine();
    }

    public void devolverDatos() {
        System.out.println("Titulo del libro: " + titulo);
        System.out.println("Autor del libro: " + autor);

    }

}
