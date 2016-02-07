import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;//por si acaso

/**
 * Write a description of class Mazo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mazo
{
    // instance variables - replace the example below with your own
    private ArrayList<Carta>cartas;

    /**
     * Constructor for objects of class Mazo
     */
    public Mazo()
    {
        // initialise instance variables
        cartas = new ArrayList<>();

        int valor = 1;
        int numPalo = 1; //Este sera el valor del palo inicializado  en este caso Treboles
        String palo ="Treboles";

        while(numPalo < 5){
            cartas.add(new Carta(valor,palo));
            if(valor == 14){
                valor = 0;
                numPalo++;
                if(numPalo == 2){
                    palo = "Corazones";

                } 

                else if(numPalo == 3){
                    palo ="Diamantes";
                }

                else{
                    palo ="Picas";
                }

            }

            valor++;
        }

    }

    public void barajar(){
        Collections.shuffle(cartas);

    }

    public Carta tomarPrimera(){
        Carta primera = null;//Igualamos a null porque de momento no hemos sacado ninguna carta

        if(cartas.size() != 0){//Comprobamos que hay  cartas en el mazo
            primera = cartas.get(0);//obtenemos la carta que ocupa la posicion 0
            cartas.remove(0);//Elimonamos la  primera carta del mazo. En  caso de que no nos  quede cartas nos devolvera null
        }
        return primera;
    }
    
    
    public int quedan(){
    
        return cartas.size();
    }
}
