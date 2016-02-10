
import java.util.ArrayList;
/**
 * Write a description of class jugador here.
 * 
 * @author (Noelia) 
 * @version (the good one)
 */
public class Jugador 
{

    //id del jugador
    private int id;
    //Cartas en la mano
    private ArrayList<String> cartasQueTienes;

    /**
     * Constructor para los objetos de la clase
     * jugador.Empieza sin cartas
     */
    public Jugador( int id)
    {
        // Inicializamos con  el id y las cartas
        this.id = id;
        cartasQueTienes = new ArrayList<String>();
    }

    /**
     * Método que devuelve el identificador
     * del jugador
     */
    public int getId()
    {
        // devuelve la id
        return  id;
    }

    /**
     * Método que agrega una carta
     * a las que posee el jugador.
     */
    public void recibirCarta(Carta unaCarta)
    {

        cartasQueTienes.add(unaCarta.getNombre());

    }

    /**
     * Devuelve una colección(ArrayList) de String
     * con los nombres de las cartas.
     */
    public ArrayList cartasQueTieneEnLaMano()
    {

        return cartasQueTienes;

    }
}