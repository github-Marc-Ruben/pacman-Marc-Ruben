package pacman;

/**
 * Classe: Jugador
 * Descripci�: Aquesta classe representa el protagonista del joc Pacman
 */

public class Jugador {

    /** Variables propies del protagonista per la posici� i direcci� */
    protected int posicioX;
    protected int posicioY;
    protected int direccio;

    /** Constants per les 4 direccions possibles */
    protected static final int DIRECCIO_AMUNT = 0;
    protected static final int DIRECCIO_AVALL = 1;
    protected static final int DIRECCIO_ESQUERRA = 2;
    protected static final int DIRECCIO_DRETA = 3;

    /**
     * Constructor que rep tota la informaci� sobre el jugador
     * @param posicioX Posici� X inicial del jugador
     * @param posicioY Posici� Y inicial del jugador
     * @param direccio Direcci� inicial del jugador 
     */
    public Jugador(int posicioX, int posicioY, int direccio) {
        this.posicioX = posicioX;
        this.posicioY = posicioY;
        this.direccio = direccio;
    }

    /**
     * M�tode que indica al jugador que es mogui. Per aix� se li passen com 
     * par�metre les caselles del tauler
     * @param caselles Les caselles del tauler
     * @param teclaPolsada Tecla polsada per l'usuari final
     */
    public void moute(Casella[][] caselles, String teclaPolsada) {

        // Modifica la direcci� si s'ha polsat una de les tecles de canvi de direcci�
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
     * Comprova si la posici� del jugador coincideix amb la de un altre donat
     * @param un altre Jugador amb el que comparar la posici�
     * @return true si coincideixen, false si no.
     */
    
	//igual que als fantasmes	

    /**
     * Comprova si la posici� d'aquest jugador coincideix amb una donada
     * @param x Posici� x donada
     * @param y Posici� y donada
     * @return true si coincideixen, false si no
     */
    
	//igual que als fantasmes

    /**
     * Retorna la posici� x del jugador
     * @return La posici� x del jugador
     */
    
    /**
     * Retorna la posici� y del jugador
     * @return La posici� y del jugador
     */
    
    /**
     * Estableix la posici� X del jugador
     * @param posicioX La posici� X
     */
    
    /**
     * Estableix la posici� Y del jugador
     * @param posicioY La posici� Y
     */
    
    /**
     * Estableix la direcci� del jugador
     * @param direccio La direcci�
     */
    
    /**
     * Retorna la direcci� actual del jugador
     * @return La direcci� actual del jugador
     */
    
}

