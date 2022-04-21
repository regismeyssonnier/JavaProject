/*
 * Main.java
 *
 * Created on 29 septembre 2008, 15:09
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package geomtest;
import java.util.Scanner;
import java.math.*;
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
        
        Vecteur v = new Vecteur(50, 50);
        v.Afficher();
       
        Point pt = new Point(10, 10);
        pt.Afficher();
        pt.SetXY(15, 15);
        pt.Afficher();
       
        Ligne l = new Ligne();
        l.Afficher();
        
        double lg = Longueur(l);
        System.out.println("longueur:" + lg);
        
        System.out.println("Translate");
        Translate(pt, v);
        System.out.println(pt.toString());
        
        
    }
    
    public static double Longueur(Ligne l){
        
        double lg = 0;
        
        for(int i=0;i < l.getNbPoint()-1;i++)
        {
            lg += Math.sqrt(Math.pow(l.getPoint(i).getX() - l.getPoint(i+1).getX(), 2) + 
                            Math.pow(l.getPoint(i).getY() - l.getPoint(i+1).getY(), 2));
                            
            
        }
        
        return lg;
        
    }
    
    public static void Translate(Point p, Vecteur v){
        
        int x = p.getX() + v.getdx();
        int y = p.getY() + v.getdy();
        
        p.SetXY(x, y);
        
    }
    
    
    
}
