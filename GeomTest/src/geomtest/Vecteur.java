/*
 * Vecteur.java
 *
 * Created on 29 septembre 2008, 15:10
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package geomtest;
import java.util.Scanner;
/**
 *
 * @author rm188766
 */
public class Vecteur {
    
    private int dx;
    private int dy;
    
    /** Creates a new instance of Vecteur */
    public Vecteur() {
        
        this.dx = 10;
        this.dy = 10;
    }
    
    public Vecteur(int dx, int dy){
        
        this.dx = dx;
        this.dy = dy;
        
    }
    
    
    public int getdx(){
        
        return this.dx;
        
    }
    
    public int getdy(){
        
        return this.dy;
    }
    
    public String toString(){
        
        return "dx:" +  String.valueOf(this.dx) + " dy:" + String.valueOf(this.dy);
        
    }
    
    public void Afficher(){
        
        System.out.println(this.toString());
        
    }
    
    
    public void Saisie(){
        
        System.out.println("Entrez la valeur de dx:");
        
        Scanner sc = new Scanner(System.in);
        this.dx = sc.nextInt();
        
        System.out.println("Entrez la valeur de dy:");
        this.dy = sc.nextInt();
        
    }
    
    
    
}
