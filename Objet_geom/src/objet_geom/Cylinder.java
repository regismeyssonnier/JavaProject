/*
 * Cylinder.java
 *
 * Created on 9 octobre 2008, 09:49
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package objet_geom;
import shape.shape3D.Shape3D;

/**
 *
 * @author rm188766
 */
public class Cylinder extends Shape3D{
    
    private double hauteur;
    /** Creates a new instance of Cylinder */
    public Cylinder(String name, double h, double r) {
        
        this.name = name;
        this.rayon = r;
        this.hauteur = h;
        this.count++;
        
    }
    
    public double Area(){
        
        return (this.rayon + this.hauteur) * 2 * Math.PI * this.rayon;
        
    }
    
    public double Volume(){
        
        return Math.PI * this.rayon * this.rayon * this.hauteur;
        
    }
    
}
