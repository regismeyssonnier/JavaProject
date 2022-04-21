/*
 * Main.java
 *
 * Created on 9 octobre 2008, 08:14
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package objet_geom;

/**
 *
 * @author rm188766
 */
public class Main {

    /** Creates a new instance of Main */
    public Main() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Rectangle[] rect = new Rectangle[2];
               
        Rectangle r = new Rectangle("rect", 50, 60);
        System.out.println("Aire:" + r.Area() + " Perimetre:" + r.Perimeter());
        rect[0] = r;
        
        Square s = new Square("square", 50);
        System.out.println("Aire:" + s.Area() + " Perimetre:" + s.Perimeter());
        rect[1] = s;
        
        for(int i=0;i < rect.length;i++)
            System.out.println("tab rect aire:" + rect[i].Area() + " perimetre:" + rect[i].Perimeter());
        
               
        
        Ellipse e = new Ellipse("ellipse", 50, 60);
        System.out.println("ellipse Aire:" + e.Area() + " Perimetre:" + e.Perimeter());
        
        Circle c = new Circle("Circle", 60);
        System.out.println("Circle Aire:" + c.Area() + " Perimetre:" + c.Perimeter());
        
        Sphere sp = new Sphere("sphere", 40);
        System.out.println("sphere Aire:" + sp.Area() + " Volume:" + sp.Volume());
           
        
        Cylinder cy = new Cylinder("Cylinder", 40, 20);
        System.out.println("Cylinder Aire:" + cy.Area() + " Volume:" + cy.Volume());
        
       
        
        try{
            cy.finalize();
            
        }
        catch(Throwable th)
        {
            System.out.println(th);
            
        }
       
        
      
        
    }
    
}
