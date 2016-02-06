import java.util.ArrayList;
/**
 * Write a description of class jugador here.
 * 
 * @author (Noelia) 
 * @version (the good one)
 */
public class Jugador 
{
    // Nombre del jugador
    private String nombre;
    //id del jugador
    private int id;
    //Cartas en la mano
    private ArrayList<String>cartasQueTienes;

    /**
     * Constructor para los objetos de la clase
     * jugador.Empieza sin cartas
     */
    public Jugador(String nombre, int id)
    {
        // Inicializamos con el nombre, el id y las cartas
        this.id = id;
        this.nombre = nombre;
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
<<<<<<< HEAD
        cartasQueTienes.add(unaCarta.getNombre());
=======
       /**
       debes añadir al arrayList de cartas
       */
        carta = carta + 1;
>>>>>>> 3ab5b5668da32513885a7f79d874309a0cd2f33d
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
