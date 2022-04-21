/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fenetre_cercle;
import java.awt.*;


/**
 *
 * @author rm188766
 */
public class Cercle {
    
    private int x;
    private int y;
    private int rayon;
    
    public Cercle(int x, int y, int rayon){
        
        this.x = x;
        this.y = y;
        this.rayon = rayon;
        
        
    }
    
    public void dessine(Graphics g){
        
        g.fillOval(this.x, this.y, this.rayon, this.rayon);
        
    }
    

}
