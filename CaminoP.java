
import java.util.Vector;

/*
 *
 * @author Jose
 */

public class CaminoP {
    
    private Vector caminoP;
    private int i; //Indica la posicion del vector principal
    
    public CaminoP(){
        this.caminoP = new Vector(0,1);
        this.i = 0;
    }
    
    public void setCamino(Vector camino){
        this.caminoP = camino;
    }
    
    public Vector getCamino(){
        return caminoP;
    }
    
    public void agregarSubcamino(Subcamino subCamino){
        caminoP.addElement(subCamino);
        i++;
    }
    
    public void eliminarSubcamino(){
        caminoP.removeElementAt(i);
        i = i - 1;
    }
}
