/*
 * Shape.java
 *
 * Created on 9 octobre 2008, 08:49
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package shape;

/**
 *
 * @author rm188766
 */
public abstract class Shape {
    
    protected String name;
    protected static int count;
    
    /** Creates a new instance of Shape */
    public Shape() {
    }
    
    public abstract double Area();
    
    public void finalize() throws Throwable{
        
        System.out.println("Shape-finalize");
        super.finalize();
        this.count--;
        
    }
    
    
}
