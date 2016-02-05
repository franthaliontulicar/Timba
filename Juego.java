<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;//por si acaso
=======

>>>>>>> b3a43413dd94df99723505f4ab7df5b0fae17141
/**
 * Write a description of class Juego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Juego
{
<<<<<<< HEAD
    // ArrayList que almacena los jugadores de la partida.
    private ArrayList<Jugador>jugadores;
    private int numerojugador;//numero de jugadores
    //mazo?otro ArrayList<loquedigapaco>cartas;
    /**
     * Constructor que cera un objeto de la clase juego,el cual crea
     * el número de jugadores indicados y crea el mazo.
     * Si el número de jugadores no es válido,se crea un
     * juego con 4 jugadores por defecto.
=======
    // instance variables - replace the example below with your own
    private ArrayList<String>jugadores;
    private int numerojugador;//numero de jugadores
    /**
     * Constructor for objects of class Juego
>>>>>>> b3a43413dd94df99723505f4ab7df5b0fae17141
     */
    public Juego(int numero )
    {
        // initialise instance variables
        numerojugador = numero;
<<<<<<< HEAD
        jugadores = new ArrayList<Jugador>();
        //mazo = new ArrayList<loquedigapaco>();
        //¿pide esto el enunciado?no me consta,pero lo acoto asi por si acaso
        if( (numero>2) && (numero<8))
        {
            
        }
        //para añadir jugadores asList
    }

    /**
     * Método que reparte todas las cartas barajando el mazo
     * y entregando alternativamente cartas a los jugadores
     * tomando siempre la primera carta del mazo.
     * Pueden quedar cartas en el mazo
     * 
     */
    public void repartir()//no sé cuantas cartas hay size()
    {
        // utilizo shuffle para barajar
        Collections.shuffle(cartas);//el nombre que diga paco
        jugadores.clear();
        int numCarta = 0;
        int idJugador = 0;
        while(numero < numCarta)
        {
            cartas.get(numCarta);
            idJugador.add(cartas.get(numCarta));
            numCarta = numCarta + 1
            
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
          system.out.println( "El id del jugador es " + jugador.getId() + " Y tiene " + jugador.manoCarta())
        }
        
=======
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    /**
     * Método que reparte todas las cartas
     * a los jugadores de forma habitual
     * 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
>>>>>>> b3a43413dd94df99723505f4ab7df5b0fae17141
    }
}
