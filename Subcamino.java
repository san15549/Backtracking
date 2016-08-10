
import java.util.Vector;

/**
 *
 * @author Jose
 */
public class Subcamino {
    
    private Vector subcamino;
    private int ii;
    
    public Subcamino(){
        this.subcamino = new Vector(0,1);
        this.ii = 0;
    }
    
    public void setSubcamino(Vector subcamino){
        this.subcamino = subcamino;
    }
    
    public Vector getSubcamino(){
        return subcamino;
    }
    
    public void agregarMovimiento(String movimiento){
        subcamino.addElement(movimiento);
        ii++;
    }
    
    public void eliminarMovimiento(){
        subcamino.removeElementAt(ii);
        ii = ii - 1;
    }
}
