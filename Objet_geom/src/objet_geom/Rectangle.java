/*
 * Rectangle.java
 *
 * Created on 9 octobre 2008, 08:55
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
public class Rectangle extends Shape2D{
    
    protected double Largeur;
    protected double Longueur;
    
    /** Creates a new instance of Rectangle */
    public Rectangle(String name, double La, double Lo) {
        
        this.name = name;
        this.Largeur = La;
        this.Longueur = Lo;
        this.count++;
        System.out.println("count:" + this.count + " name:" + this.name);
        
    }
    
    public double Area(){
        
        return this.Largeur * this.Longueur;
        
    }
    
    public double Perimeter(){
        
        return 2 * this.Largeur + 2 * this.Longueur;
        
        
    }
    
    
}
