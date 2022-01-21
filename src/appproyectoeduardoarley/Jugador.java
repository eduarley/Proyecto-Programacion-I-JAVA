
package appproyectoeduardoarley;

public class Jugador {
    
    private String nickname;
    private int puntaje =0;
    private static int contJugador=1;
    private int numJugador;
    public Jugador( String nickname) {
        
        this.nickname = nickname;
        this.puntaje = 0;
        this.numJugador+=contJugador++;
    }

    public int getNumJugador() {
        return numJugador;
    }

   

    public String getNickname() {
        return nickname;
    }

    public int getPuntaje() {
        return puntaje;
    }

    

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje += puntaje;
    }

    @Override
    public String toString() {
        return "Jugador: "+numJugador+" " + nickname;
    }
    
}
