/*
 * Shape3D.java
 *
 * Created on 9 octobre 2008, 09:42
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package shape.shape3D;

/**
 *
 * @author rm188766
 */
public abstract class Shape3D extends shape.Shape{
    
    protected double rayon;
    
    /** Creates a new instance of Shape3D */
    public Shape3D() {
    }
    
    public abstract double Volume();
    
    
    
}
