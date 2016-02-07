
import java.util.ArrayList;
import java.util.Collections;


/**
 * Write a description of class Juego here.
 * 
 * @author (Noelia) 
 * @version (the good one)
 */
public class Juego
{

    // ArrayList que almacena los jugadores de la partida.
    private ArrayList<Jugador>jugadores;
    private int numerojugador;//numero de jugadores
    //mazo de cartas para jugar la partida
     private Mazo mazo;
    /**
     * Constructor que cera un objeto de la clase juego,el cual crea
     * el número de jugadores indicados y crea el mazo con 50 cartas..
     * Si el número de jugadores no es válido,se crea un
     * juego con 4 jugadores por defecto.

     */
    public Juego(int numero )
    {
        // se inicia el juego con el número de jugadores y se crea el mazo.
        numerojugador = numero;
        jugadores = new ArrayList<Jugador>();
        mazo = new Mazo ();
        int id = 1 ;
        if( (numero>2) && (numero<8))
        {
            System.out.println("El número de jugadores es válido.Comienza la partida");

            while(id <= numero)
            {
                jugadores.add(new Jugador(id));
                id = id +1;
            }
        }
        else
        {

            System.out. println("El número de jugadores no es válido,se crea un juego de 4 personas");
            jugadores.add (new Jugador(1));
            jugadores.add (new Jugador (2));
            jugadores.add ( new Jugador(3));
            jugadores.add (new Jugador(4));

        }

    }

    /**
     * Método que reparte todas las cartas barajando el mazo
     * y entregando alternativamente cartas a los jugadores
     * tomando siempre la primera carta del mazo.
     * Pueden quedar cartas en el mazo
     * 
     */
    public void repartir()
    {
        
        mazo.barajar();//baraja las cartas
        int mazos = 50;//numero de cartas a repartir
        int numCarta = 0;// número de cartas para cada jugador
        int id = 1;//id de cada jugador
        
        while(numCarta>(mazos/jugadores.size()))
        {
           jugadores.get(id).recibirCarta(mazo.tomarPrimera());
           id = id +1;
           numCarta = numCarta + 1;
        }
    }

    /**
     * Método que muestra por pantalla el id
     * de cada jugador junto a las cartas que 
     * tiene en la mano.
     */
    public void mostrarCartasJugadores()
    {
        for(Jugador jugador :jugadores)
        {
            System.out.println( "El id del jugador es " + jugador.getId() + " Y tiene " + jugador.cartasQueTieneEnLaMano());
        }

    }

}
