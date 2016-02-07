

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
        String nombre ="El "+getValor();
            if(valor > 10){
                if(valor == 11){
                    nombre =" la J  ";
                }
                else if(valor == 12){
                    nombre =" la Q  ";
                }
                else{
                    nombre ="La K ";
                }
            } else if(valor == 1){
                nombre ="El AS ";
            }
        
        return nombre+" de "+getPalo();
    }
}
