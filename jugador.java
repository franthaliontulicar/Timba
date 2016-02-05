import java.util.ArrayList;
/**
 * Write a description of class jugador here.
 * CUIDADO CON LOS CAMBIOS,NO SE ESTÁN GUARDANDO BIEN
 * @author (Noelia) 
 * @version (the good one)
 */
public class jugador 
{
    // Nombre del jugador
    private String nombre;
    //id del jugador
    private int id;
    //Cartas en la mano
    private ArrayList<String>cartas;//nombre

    /**
     * Constructor para los objetos de la clase
     * jugador.Empieza sin cartas
     */
    public jugador(String nombre, int id)
    {
        // Inicializamos con el nombre, el id y las cartas
        this.id = id;
        this.nombre = nombre;
         cartas = new ArrayList<String>();
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
     * a las que posee el jugador
     * 
     * 
     */
    public void recibirCarta()
    {
       
        carta = carta + 1;
    }
       /**
     * Devuelve una colección de String
     * con los nombres de las cartas.
     */
    public void cartasQueTieneEnLaMano()
    {
        // ArrayList<String>cartas
        //bucle for
        
    }
}
