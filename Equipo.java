
/**
 * Write a description of class Equipo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Equipo
{
    // instance variables - replace the example below with your own
    private String nombreEquipo;
    private int anioFundacion;

    /**
     * Constructor for objects of class Equipo
     */
    public Equipo(String nombreDeEquipo, int anioDeLaFundacion){
        nombreEquipo = nombreDeEquipo;
        anioFundacion = anioDeLaFundacion;
    }

    public String getNombreEquipo(){
        return nombreEquipo;
    }

    public int getAnioFundacion(){
        return anioFundacion;
    }

    public void setNombre(String nuevoNombre){
        nombreEquipo = nuevoNombre;
    }

    public void setanioFundacion(int nuevoanio){
        anioFundacion = nuevoanio;
    }
    
    public void imprimirDetalles(){
        System.out.println("El " + nombreEquipo + " fue fundado en el " + anioFundacion);
    }
}
