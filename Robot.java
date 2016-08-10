/**
 * @author Jose Martinez, David Sanchinelli, Juan Pablo Zea, Diego Hurtarte
 * @version 10/08/16
 */
public class Robot {
    
    private int posx;
    private int posy;
    private int direccion; //1 es norte, 2 es oeste, 3 es sur, 4 es este.
    
    public Robot(int posx, int posy, int direccion){
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }

    public void analizar() {
        
    }
    
    public void moverNorte() {
        
    }
    
    public void moverOeste() {
       
    }

    public void moverEste() {
        
    }
    
    public void moverSur() {
        
    }

    @Override
    public boolean libreAdelante(String[][] lab) {
        boolean libre = false;
        if (direccion == 1){
            if (lab[posy - 1][posx].equals(" ")){
                libre = true;
            } else {
                libre = false;
            }
        } else if (direccion == 2){
            if (lab[posy][posx - 1].equals(" ")){
                libre = true;
            } else {
                libre = false;
            }
        } else if (direccion == 3){
            if (lab[posy + 1][posx].equals(" ")){
                libre = true;
            } else {
                libre = false;
            }
        } else if (direccion ==4){
            if (lab[posy][posx + 1].equals(" ")){
                libre = true;
            } else {
                libre = false;
            }
        }
        
        return libre;
    }

    @Override
    public boolean libreDerecha(String[][] lab) {
        if (direccion == 1){
            
        } else if (direccion == 2){
            
        } else if (direccion == 3){
            
        } else if (direccion ==4){
            
        }
    }

    @Override
    public boolean libreIzquierda(String[][] lab) {
        if (direccion == 1){
            
        } else if (direccion == 2){
            
        } else if (direccion == 3){
            
        } else if (direccion ==4){
            
        }
    }
    
}
