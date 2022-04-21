/*
 * Sphere.java
 *
 * Created on 9 octobre 2008, 09:44
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
public class Sphere extends Shape3D{
    
    /** Creates a new instance of Sphere */
    public Sphere(String name, double r) {
        
        this.name = name;
        this.rayon = r;
        this.count++;
        
    }
    
    public double Area(){
        
        return 4 * Math.PI * this.rayon * this.rayon;
        
    }
    
    public double Volume(){
        
        return (4 * Math.PI * this.rayon * this.rayon * this.rayon) / 3;
        
    }
    
}
