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
    
    public void setNombre (String nuevoJugador){
        nombreJugador = nuevoJugador;
    }
    
    public void setDorsal (int nuevoDorsal){
        dorsal = nuevoDorsal;
    }
    
    public void setnombreEstadio (Equipo nuevoNombreEstadio){
        estadio = nuevoNombreEstadio;
    }
    
    public void imprimirDetalles(){
        System.out.println( nombreJugador + " tiene el dorsal número " + dorsal + ", juega en el " + estadio.getNombreEquipo() + " cuya fundación fue en el " +estadio.getAnioFundacion());
    }
}