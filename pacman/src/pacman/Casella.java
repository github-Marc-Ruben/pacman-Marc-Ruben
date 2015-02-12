package pacman;

/**
 * Classe: Casella
 * Descripció: Aquesta classe representa una casella del tauler del joc del Pacman
 */

public class Casella {
    public static final int TIPUS_BUIDA = 1;
    public static final int TIPUS_MUR = 2;
    public static final int TIPUS_PUNT = 3;
    public static final int TIPUS_PUNT_ESPECIAL = 4;

    // Variable que representa el tipus d'una casella
    private int tipus;

    /**
     * Constructor d'una casella, que rep el seu tipus
     * @param tipus El tipus de la casella a crear
     */
    public Casella(int tipus) {
        
...

    }

    /**
     * Comprova si una casella es trepitjable
     * @return true si és trepitjable, false si no 
     */
    public boolean esOcupable() {
        
    //retornar un tipus que sigui diferent a tipus Mur
}

    /**
     * Comprova si una casella és un mur
     * @return true si és un mur, false si no 
     */
    public boolean esMur() {
 //retornar tipus mur       

    }

    /**
     * Comprova si una casella està buida
     * @return true si està buida, false si no
     */
    public boolean esBuida() {
 //retornar tipus buida       
    }

    /**
     * Comprova si una casella és un punt
     * @return true si és un punt, false si no
     */
    public boolean esPunt() {

//retornar tipus punt
    }

    /**
     * Comprova si una casella es un punt especial
     * @return true si és un punt, false si no
     */
    public boolean esPuntEspecial() {
        return tipus == TIPUS_PUNT_ESPECIAL;
    }

    /**
     * Selecciona el tipus d'una casella
     * @param tipus El nou tipus de la casella
     */
    public void setTipus(int tipus) {
        
	//constructor tipus


    }


    /**
     * Retorna el tipus de la casella
     * @return El tipus de la casella
     */
    public int getTipus() {
        
	//obtenció tipus

    }

    /**
     * Retorna la casella representada com a cadena de text
     * @return La casella representada com a cadena de text
     */
    public String toString() {
        switch(tipus) {
            case TIPUS_BUIDA:
                return " ";
            case TIPUS_MUR:
                return "#";
            case TIPUS_PUNT:
                return ".";
            case TIPUS_PUNT_ESPECIAL:
                return "*";
            default:
                return "";
        }
    }
}

