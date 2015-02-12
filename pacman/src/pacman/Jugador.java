package pacman;

/**
 * Classe: Jugador
 * Descripció: Aquesta classe representa el protagonista del joc Pacman
 */

public class Jugador {

    /** Variables propies del protagonista per la posició i direcció */
    protected int posicioX;
    protected int posicioY;
    protected int direccio;

    /** Constants per les 4 direccions possibles */
    protected static final int DIRECCIO_AMUNT = 0;
    protected static final int DIRECCIO_AVALL = 1;
    protected static final int DIRECCIO_ESQUERRA = 2;
    protected static final int DIRECCIO_DRETA = 3;

    /**
     * Constructor que rep tota la informació sobre el jugador
     * @param posicioX Posició X inicial del jugador
     * @param posicioY Posició Y inicial del jugador
     * @param direccio Direcció inicial del jugador 
     */
    public Jugador(int posicioX, int posicioY, int direccio) {
        this.posicioX = posicioX;
        this.posicioY = posicioY;
        this.direccio = direccio;
    }

    /**
     * Mètode que indica al jugador que es mogui. Per això se li passen com 
     * paràmetre les caselles del tauler
     * @param caselles Les caselles del tauler
     * @param teclaPolsada Tecla polsada per l'usuari final
     */
    public void moute(Casella[][] caselles, String teclaPolsada) {

        // Modifica la direcció si s'ha polsat una de les tecles de canvi de direcció
        if(teclaPolsada.equals("W") || teclaPolsada.equals("w")) {
            //que vagi amunt
        }
        else if(teclaPolsada.equals("S") || teclaPolsada.equals("s")) {
            //que vagi avall
        }


//cas dreta i esquerra

//cas que si apretes la Q surti





        // Es mou
        //switch(direccio) {

		/* igual que als fantasmes, mirar si pot anar amunt, avall, dreta o esquerra */



    /**
     * Comprova si la posició del jugador coincideix amb la de un altre donat
     * @param un altre Jugador amb el que comparar la posició
     * @return true si coincideixen, false si no.
     */
    
	//igual que als fantasmes	

    /**
     * Comprova si la posició d'aquest jugador coincideix amb una donada
     * @param x Posició x donada
     * @param y Posició y donada
     * @return true si coincideixen, false si no
     */
    
	//igual que als fantasmes

    /**
     * Retorna la posició x del jugador
     * @return La posició x del jugador
     */
    
    /**
     * Retorna la posició y del jugador
     * @return La posició y del jugador
     */
    
    /**
     * Estableix la posició X del jugador
     * @param posicioX La posició X
     */
    
    /**
     * Estableix la posició Y del jugador
     * @param posicioY La posició Y
     */
    
    /**
     * Estableix la direcció del jugador
     * @param direccio La direcció
     */
    
    /**
     * Retorna la direcció actual del jugador
     * @return La direcció actual del jugador
     */
    
}

