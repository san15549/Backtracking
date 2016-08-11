/**
 * @author Jose Martinez, David Sanchinelli, Juan Pablo Zea, Diego Hurtarte
 * @version 10/08/16
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] maze =
       {{"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},
	{"#", "X", "#", " ", "#", "#", "#", " ", "O", "#"},
	{"#", " ", " ", " ", "#", "#", " ", " ", "#", "#"},
	{"#", " ", "#", " ", "#", " ", " ", "#", " ", "#"},
	{"#", " ", "#", " ", "#", " ", "#", "#", " ", "#"},
	{"#", " ", "#", " ", "#", " ", " ", " ", " ", "#"},
	{"#", " ", "#", " ", "#", "#", "#", "#", " ", "#"},
	{"#", " ", "#", " ", " ", " ", "#", "#", " ", "#"},
        {"#", " ", "#", " ", "#", " ", " ", " ", " ", "#"},
        {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#"},};
        
        Robot robot = new Robot(1,1,3,maze);
        robot.solve();
    }
    
}
