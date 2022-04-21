/*
 * Ligne.java
 *
 * Created on 29 septembre 2008, 15:48
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package geomtest;

/**
 *
 * @author rm188766
 */
public class Ligne {
    
    private final int MAXPT = 100;
    private int NB_POINT;
    private Point[] tab_pt;
    
    /** Creates a new instance of Ligne */
    public Ligne() {
    
               
        tab_pt = new Point[10];
        this.NB_POINT = 10;
        
        for(int i=0;i < this.NB_POINT;i++)
            this.tab_pt[i] = new Point((int)(Math.random()*100), (int)(Math.random()*100));
        
        
    }
    
    
    public Ligne(int nb_point){
        
        if(nb_point > this.MAXPT)nb_point = this.MAXPT;
        tab_pt = new Point[nb_point];
        this.NB_POINT = nb_point;
        
        for(int i=0;i < this.NB_POINT;i++)
            this.tab_pt[i] = new Point((int)(Math.random()*100), (int)(Math.random()*100));
        
    }
    
    public Point getPoint(int i){
        
        return this.tab_pt[i];
        
    }
    
    public int getNbPoint(){
        
        return this.NB_POINT;
        
    }
    
    public void Mise_a_jour_Point(int i, int x, int y){
        
        this.tab_pt[i].SetXY(x, y);
        
    }
    
     public String toString(){
        
         String s = "";
         
         for(int i=0;i < this.NB_POINT;i++)
             s += this.tab_pt[i].toString() + "\n";
         
         return s;
            
        
    }
     
    public void Afficher(){
        
        System.out.println(this.toString());
        
    }
    
    
     
     
     
     
}
