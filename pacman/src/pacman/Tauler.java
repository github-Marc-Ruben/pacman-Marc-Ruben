package pacman;

/**
 * Classe: Tauler
 * Descripció: Aquesta classe representa un tauler pel joc del Pacman
 * 
 */

public class Tauler {

    /** Caselles del Tauler */
    private Casella[][] Caselles;

    /** Llista de Fantasmes */
    private Fantasma[] Fantasmes;

    /** Jugador */
    private Jugador prota;

    /** ample del Tauler */
    private int ample;

    /** alcada del Tauler */
    private int alcada;

    /** punts acumulats */
    private int punts;

    /** vides */
    private int vides;

    /** Posició de partida del Jugador */
    private int protaXInicial, protaYInicial, protaDireccioInicial;

    /** Posició de partida dels Fantasmes */
    private int[] FantasmesXInicial, FantasmesYInicial, FantasmesDireccioInicial;

    /** Constant per l'increment de punts cada vegada que es mengi un */
    private static final int INCREMENT_punts = 10;

    /** Constant pel número de vides inicial */
    private static final int VIDES_INICIALS = 3;

    /** Constant per l'alcada i ample per defecte del Tauler */
    private static final int ALCADA  = 17;
    private static final int AMPLE = 19;


    /**
     * Constructor del Tauler donat l'ample, l'alcada, les Caselles, els Fantasmes i el Jugador
     */
    public Tauler() {
        /* Tauler per defecte */
        /*
         *       ###################
         *       #........#........#
         *       #.##.###.#.###.##.#
         *       #.................#
         *       #.##.#.#####.#.##.#
         *       #....#??.#.?.#....#
         *       ####.###.#.###.####
         *       ####.#.......#.####
         *       ####...#####...####
         *       ####.#.......#.####
         *       ####.###.#.###.####
         *       #....#...#...#....#
         *       #.##.#.#####.#.##.#
         *       #........C........#
         *       #.##.###.#.###.##.#
         *       #........#........#
         *       ###################
         */

        // Assigna les variables del Tauler
        this.alcada  = ALCADA;
        this.ample = AMPLE;
        int mur = Casella.TIPUS_MUR;
        int pnt = Casella.TIPUS_PUNT;
        int[][] tmp = new int[][] {
                {mur,mur,mur,mur,mur,mur,mur,mur,mur,mur,mur,mur,mur,mur,mur,mur,mur,mur,mur},
                {mur,pnt,pnt,pnt,pnt,pnt,pnt,pnt,pnt,mur,pnt,pnt,pnt,pnt,pnt,pnt,pnt,pnt,mur},
                {mur,pnt,mur,mur,pnt,mur,mur,mur,pnt,mur,pnt,mur,mur,mur,pnt,mur,mur,pnt,mur},
                {mur,pnt,pnt,pnt,pnt,pnt,pnt,pnt,pnt,pnt,pnt,pnt,pnt,pnt,pnt,pnt,pnt,pnt,mur},
                {mur,pnt,mur,mur,pnt,mur,pnt,mur,mur,mur,mur,mur,pnt,mur,pnt,mur,mur,pnt,mur},
                {mur,pnt,pnt,pnt,pnt,mur,pnt,pnt,pnt,mur,pnt,pnt,pnt,mur,pnt,pnt,pnt,pnt,mur},
                {mur,mur,mur,mur,pnt,mur,mur,mur,pnt,mur,pnt,mur,mur,mur,pnt,mur,mur,mur,mur},
                {mur,mur,mur,mur,pnt,mur,pnt,pnt,pnt,pnt,pnt,pnt,pnt,mur,pnt,mur,mur,mur,mur},
                {mur,mur,mur,mur,pnt,pnt,pnt,mur,mur,mur,mur,mur,pnt,pnt,pnt,mur,mur,mur,mur},
                {mur,mur,mur,mur,pnt,mur,pnt,pnt,pnt,pnt,pnt,pnt,pnt,mur,pnt,mur,mur,mur,mur},
                {mur,mur,mur,mur,pnt,mur,mur,mur,pnt,mur,pnt,mur,mur,mur,pnt,mur,mur,mur,mur},
                {mur,pnt,pnt,pnt,pnt,mur,pnt,pnt,pnt,mur,pnt,pnt,pnt,mur,pnt,pnt,pnt,pnt,mur},
                {mur,pnt,mur,mur,pnt,mur,pnt,mur,mur,mur,mur,mur,pnt,mur,pnt,mur,mur,pnt,mur},
                {mur,pnt,pnt,pnt,pnt,pnt,pnt,pnt,pnt,pnt,pnt,pnt,pnt,pnt,pnt,pnt,pnt,pnt,mur},
                {mur,pnt,mur,mur,pnt,mur,mur,mur,pnt,mur,pnt,mur,mur,mur,pnt,mur,mur,pnt,mur},
                {mur,pnt,pnt,pnt,pnt,pnt,pnt,pnt,pnt,mur,pnt,pnt,pnt,pnt,pnt,pnt,pnt,pnt,mur},
                {mur,mur,mur,mur,mur,mur,mur,mur,mur,mur,mur,mur,mur,mur,mur,mur,mur,mur,mur}
        };

        // Crea les Caselles
        
		/* és una matriu, per tant son 2 for's, una per la 		alçada i l'altra per l'ample */


            }
        }

        // Crea els Fantasmes
        this.Fantasmes = new Fantasma[3];
        Fantasmes[0] = new Fantasma(6,  5, Fantasma.DIRECCIO_AVALL);
        Fantasmes[1] = new Fantasma(11, 5, Fantasma.DIRECCIO_AMUNT);
        Fantasmes[2] = new Fantasma(7, 5, Fantasma.DIRECCIO_AMUNT);

        // Crea el Jugador
        this.prota = new Jugador(9, 13, Jugador.DIRECCIO_DRETA);

        // Inicialmente els punts son zero
        this.punts = 0;

        // Inicialitza el nombre de vides
        this.vides = VIDES_INICIALS;

        // Desa les posicions d'inici per si mor el Jugador
        protaXInicial = prota.getPosicioX();
        protaYInicial = prota.getPosicioY();
        protaDireccioInicial = prota.getDireccio();
        FantasmesXInicial = new int[Fantasmes.length];
        FantasmesYInicial = new int[Fantasmes.length];
        FantasmesDireccioInicial = new int[Fantasmes.length];
        for(int i=0; i<Fantasmes.length; i++) {
            FantasmesXInicial[i] = Fantasmes[i].getPosicioX();
            FantasmesYInicial[i] = Fantasmes[i].getPosicioY();
            FantasmesDireccioInicial[i] = Fantasmes[i].getDireccio();
        }
    }


    /**
     * Constructor del Tauler donat l'ample, l'alcada, les Caselles, els Fantasmes i el Jugador
     * @param ample ample del Tauler
     * @param alcada alcada del Tauler
     * @param Caselles Caselles del joc
     * @param Fantasmes Fantasmes
     * @param prota Jugador
     */
    public Tauler(int ample, int alcada, Casella[][] Caselles,
                   Fantasma[] Fantasmes, Jugador prota) {
        // Assigna les variables del Tauler
        
        // Inicialment els punts son zero
        this.punts = 0;

        // Inicialitza el número de vides
        this.vides = VIDES_INICIALS;

        // Desa les posicions d'inici per si mor el Jugador
        protaXInicial = prota.getPosicioX();
        protaYInicial = prota.getPosicioY();
        protaDireccioInicial = prota.getDireccio();
        FantasmesXInicial = new int[Fantasmes.length];
        FantasmesYInicial = new int[Fantasmes.length];
        FantasmesDireccioInicial = new int[Fantasmes.length];
        for(int i=0; i<Fantasmes.length; i++) {
            FantasmesXInicial[i] = Fantasmes[i].getPosicioX();
            FantasmesYInicial[i] = Fantasmes[i].getPosicioY();
            FantasmesDireccioInicial[i] = Fantasmes[i].getDireccio();
        }
    }


    /**
     * Realitza el següent moviment del Tauler, movent tant els 
     * Fantasmes com el Jugador. Retorna false si s'ha perdut perque algun
     * Fantasma ha mort el Jugador
     * @param teclaPolsada Tecla polsada per l'usuari
     */
    public void seguentMoviment(String teclaPolsada) {
        // Primer mou al Jugador
        prota.moute(Caselles, teclaPolsada);

        // Suma punts al marcador si es necessari
        if(Caselles[prota.getPosicioY()][prota.getPosicioX()].esPunt()) {
            punts += INCREMENT_punts;
            Caselles[prota.getPosicioY()][prota.getPosicioX()].setTipus(Casella.TIPUS_BUIDA);
        }

        // Després mou als Fantasmes
        
	// hi ha més d'un fantasma (for), utilitza la funcio moute

        }
    }

    /**
     * Comprova si s'ha perdut el joc, perquè algun Fantasma està a la mateixa
     * Casella que el Jugador
     * @return true si s'ha perdut, false si no
     */
    public boolean jocPerdut() {
        // Comprova si algun Fantasma ha arribat al Jugador
        for(int i=0; i<Fantasmes.length; i++) {

			// ha de comprobar que si estas a la mateixa 				//	casella, i restarte una vida


                return true;
            }
        }
        return false;
    }

    /**
     * Comprova si s'ha guanyat el joc, veient que no queda cap Casella amb punts
     * @return true si s'ha guanyat, false si no
     */
    public boolean jocGuanyat() {
        
		//Recorrer el tauler mirant si queda alguna casella que sigui punt

		 {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Retorna el número de vides del Jugador
     * @return El número de vides del Jugador
     */
     
  /**
     * El Jugador perd una vida
     */
    public void perdVida() {

        // Retorna al Jugador i els Fantasmes a la posició inicial
        prota.setPosicioX(protaXInicial);
        prota.setPosicioY(protaYInicial);
        prota.setDireccio(protaDireccioInicial);
        for(int i=0; i<Fantasmes.length; i++) {
            Fantasmes[i].setPosicioX(FantasmesXInicial[i]);
            Fantasmes[i].setPosicioY(FantasmesYInicial[i]);
            Fantasmes[i].setDireccio(FantasmesDireccioInicial[i]);
        }
    }

    /**
     * Retorna la representació del Tauler en forma de cadena de text
     * @return La representació del Tauler en forma de cadena de text
     */
    public String toString() {
        String ret = "";
        for(int i=0; i<alcada; i++) {
            for(int j=0; j<ample; j++) {
                // Si està el Jugador l'imprimeix
                if(prota.coincideix(j, i)) {
                    ret += "C";
                }
                else {
                    boolean tmp = true;
                    // Si hi ha algun Fantasma en aquella Casella, l'imprimeix
                    for(int k=0; k<Fantasmes.length; k++) {
                        if(Fantasmes[k].coincideix(j, i)) {
                            ret += "?";
                            tmp = false;
                        }
                    }
                    // Si no, imprimeix la Casella
                    if(tmp) {
                        ret += Caselles[i][j].toString();
                    }
                }
            }
            ret += "\n";
        }
        ret += "punts: " + punts + "\n";
	ret += "vides:  " + vides  + "\n";
        return ret;
    }

    /**
     * Retorna les Caselles del joc
     * @return Les Caselles del joc
     */
    
    /**
     * Retorna els Fantasmes del joc
     * @return Els Fantasmes del joc
     */
    
    /**
     * Retorna el Jugador del joc
     * @return El Jugador del joc
     */
    
    /**
     * Retorna l'ample del Tauler
     * @return l'ample del Tauler
     */
    
    /**
     * Retorna l'alcada del Tauler
     * @return l'alcada del Tauler
     */
    
    /**
     * Retorna els punts actuals del joc
     * @return Els punts actuals del joc
     */
}

