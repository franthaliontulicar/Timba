
/**
 * Write a description of class Carta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carta
{
    // instance variables - replace the example below with your own
    private int valor;
    private String palo;
    private String nombre;

    public Carta(int valor2, String palo2){

        valor = valor2;
        palo = palo2;

    }

    public int getValor(){
        return valor;

    }

    public String getPalo(){
        return palo;
    }

    public String getNombre(){
        return nombre;
    }
}
