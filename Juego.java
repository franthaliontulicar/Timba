
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;//por si acaso


/**
 * Write a description of class Juego here.
 * 
 * @author (Noelia) 
 * @version (a version number or a date)
 */
public class Juego
{

    // ArrayList que almacena los jugadores de la partida.
    private ArrayList<Jugador>jugadores;
    private int numerojugador;//numero de jugadores
    //mazo falta
    private ArrayList<Carta>cartas;//o string?
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
        //mazo = new ArrayList<>();//?  la clase mazo(falta)
        int id = 1 ;
        if( (numero>2) && (numero<8))
        {
           System.out.println("El número de jugadores es válido.Comienza la partida");
            
           while(id < numero)//? o =
           {
             jugadores.add(de alguna manera)
             id = id +1;
            }
        }
        else
        {
            
           System.out. println("El número de jugadores no es válido,se crea un juego de 4 personas");
           jugadores.add (new Jugador(1));//corrige y termina.
           jugadores.add (2);
           jugadores.add (3);
           jugadores.add (4);

        }
        
    }

    /**
     * Método que reparte todas las cartas barajando el mazo
     * y entregando alternativamente cartas a los jugadores
     * tomando siempre la primera carta del mazo.
     * Pueden quedar cartas en el mazo
     * 
     */
    public void repartir()//n size()dice google 50
    {
        // utilizo shuffle para barajar o vale método barajar, de la clase mazo(falta)
        Collections.shuffle(cartas);//
        jugadores.clear();
        int numCarta = 0;
        int idJugador = 0;
        while(numero < numCarta)
        {
            cartas.get(numCarta);//clase carta
            idJugador.add(cartas.get(numCarta));
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
            system.out.println( "El id del jugador es " + jugador.getId() + " Y tiene " + jugador.manoCarta());
        }

    }
    
}
