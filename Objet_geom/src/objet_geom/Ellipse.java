/*
 * Ellipse.java
 *
 * Created on 9 octobre 2008, 09:16
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package objet_geom;
import shape.shape2D.Shape2D;

/**
 *
 * @author rm188766
 */
public class Ellipse extends Shape2D{
    
    protected double r1;
    protected double r2;
    
    /** Creates a new instance of Ellipse */
    public Ellipse(String name, double r1, double r2) {
        
        this.name = name;
        this.r1 = r1;
        this.r2 = r2;
        this.count++;
    }
    
    public double Area(){
        
        return Math.PI * r1 * r2;
        
    }
    
    
    public double Perimeter(){
        
        return 2 * Math.PI * Math.sqrt( ((r1 * r1) + (r2 * r2)) / 2 );
        
        
    }
    
    
    
}
