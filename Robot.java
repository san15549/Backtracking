/**
 * @author Jose Martinez, David Sanchinelli, Juan Pablo Zea, Diego Hurtarte
 * @version 10/08/16
 */
public class Robot {
    
    private int posx;
    private int posy;
    private int direccion; //1 es norte, 2 es oeste, 3 es sur, 4 es este.
    private CaminoP memoria;
    private String[][] lab;
    
    public Robot(int posx, int posy, int direccion, String[][] lab){
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
        this.lab = lab;
        memoria = new CaminoP();
    }
    
    public boolean[] analizar(){
        boolean libreN = false;
        boolean libreO = false;
        boolean libreS = false;
        boolean libreE = false;
        if (lab[posy + 1][posx].equals(" ")){
           libreN = true;  
        }
        if (lab[posy - 1][posx].equals(" ")){
            libreS = true;
        }
        if (lab[posy][posx + 1].equals(" ")){
            libreE = true;
        }
        if (lab[posy][posx - 1].equals(" ")){
            libreO = true;
        }
        boolean[] libre = new boolean[] {libreN,libreO,libreS,libreE};
        return libre;
    }

    public void moverNorte() {
        boolean[] libre = analizar();
        if (libre[1]==true){
            posy++;
            lab[posy][posx] = "X";
        }
    }
    
    public void moverOeste() {
       boolean[] libre = analizar();
        if (libre[2]==true){
            posx--;
            lab[posy][posx] = "X";
        }
    }

    public void moverEste() {
        boolean[] libre = analizar();
        if (libre[4]==true){
            posx++;
            lab[posy][posx] = "X";
        }
    }
    
    public void moverSur() {
        boolean[] libre = analizar();
        if (libre[3]==true){
            posy--;
            lab[posy][posx] = "X";
        }
    }
    

/*PARA ROBOT*/
    public boolean libreAdelante() {
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
        } else if (direccion == 4){
            if (lab[posy][posx + 1].equals(" ")){
                libre = true;
            } else {
                libre = false;
            }
        }
        return libre;
    }
/*PARA ROBOT*/
    public boolean libreDerecha(String[][] lab) {
        boolean libre = false;
    if (direccion == 4){
        if (lab[posy][posx + 1].equals(" ")){
            libre = true;
        }else {
            libre = false;
        }
    } else if (direccion == 1){
        if (lab[posy + 1][posx].equals(" ")){
            libre = true;
        }else {
            libre = false;
        }
    } else if (direccion == 2){
        if (lab[posy][posx - 1].equals (" ")){
            libre = true;
        } else {
            libre = false;
        }
    } else if (direccion == 3){
        if (lab[posy - 1][posx].equals (" ")){
            libre = true;
        } else {
            libre = false;
        }
    }
    return libre;
    }
/*PARA ROBOT*/
    public boolean libreIzquierda(String[][] lab) {
        boolean libre = false;
    if (direccion == 2){
        if (lab[posy][posx - 1].equals(" ")){
            libre = true;
        }else {
            libre = false;
        }
    } else if (direccion == 3){
        if (lab[posy - 1][posx].equals(" ")){
            libre = true;
        }else {
            libre = false;
        }
    } else if (direccion == 4){
        if (lab[posy][posx + 1].equals (" ")){
            libre = true;
        } else {
            libre = false;
        }
    } else if (direccion == 1){
        if (lab[posy + 1][posx].equals (" ")){
            libre = true;
        } else {
            libre = false;
        }
    }
    return libre;
    }

    /*Metodo para Solucionar*/
    public String solve(){
        
        
        return "Success";
    }
}
