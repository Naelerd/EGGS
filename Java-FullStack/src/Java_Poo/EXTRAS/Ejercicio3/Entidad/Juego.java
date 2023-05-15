package Java_Poo.EXTRAS.Ejercicio3.Entidad;

import java.util.Scanner;

/* Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números. El primer jugador elige 
un número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" 
después de cada intento. El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. Registra el número de intentos necesarios 
para adivinar el número y el número de veces que cada jugador ha ganado.
 */
public class Juego {

    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    private int num_Principal;
    private int num_adivinador;
    private boolean adivinar;

    public Juego() {
    }

    public Juego(int numPrincipal, int numAdinar, boolean adivinar) {
        this.num_Principal = numPrincipal;
        this.num_adivinador = numAdinar;
        this.adivinar = adivinar;
    }

    public int getNumPrincipal() {
        return num_Principal;
    }

    public void setNumPrincipal(int numPrincipal) {
        this.num_Principal = numPrincipal;
    }

    public int getNumAdinar() {
        return num_adivinador;
    }

    public void setNumAdinar(int numAdinar) {
        this.num_adivinador = numAdinar;
    }

    public boolean isAdivinar() {
        return adivinar;
    }

    public void setAdivinar(boolean adivinar) {
        this.adivinar = adivinar;
    }

    public void iniciar_juego() {
        System.out.println("Jugador N1, ingrese el numero a adivinar por el proximo jugador: ");
        this.num_Principal = teclado.nextInt();

        System.out.println("Jugador N2, tendra un maximo de 10 intentos para adivinar el N.");

        int player1 = 0;
        int player2 = 0;
        int contador = 0;

        do {
            System.out.println("Ingrese el intento N: " + (contador + 1));
            this.num_adivinador = teclado.nextInt();
            contador++;

            if (num_Principal - num_adivinador <= 4) {
                System.out.println("CALIENTE!");
            } else if (num_Principal - num_adivinador > 4 && num_Principal - num_adivinador <= 7) {
                System.out.println("TIBIO");
            } else {
                System.out.println("FRIO");
            } 

            if (num_Principal == num_adivinador) {
                adivinar = true;
            }

        } while (!adivinar && contador < 10);
        if (adivinar) {
            player2++;
            System.out.println("Felicitaciones, has adivinado el N!    "
                    + "\n Player 1: " + player1 + " victorias."
                    + "\n Player 2: " + player2 + " victorias.");
        } else {
            player1++;
            System.out.println("El Jugador N2 no pudo encontrar el N!"
                    + "\n Player 1: " + player1 + " victorias."
                    + "\n Player 2: " + player2 + " victorias.");
        }

    }
}
