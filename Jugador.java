public class Jugador
{
    private String nombreJugador;
    private int dorsal;
    private Equipo estadio;
    public Jugador (String nombreDelJugador, int dorsalJugador, Equipo nombreEstadio){
        nombreJugador = nombreDelJugador;
        dorsal = dorsalJugador;
        estadio = nombreEstadio;
    }

    public String getNombre() {
        return nombreJugador;
    }

    public int getdorsal() {
        return dorsal;
    }

    public Equipo getEstadio() {
        return estadio;
    }
}