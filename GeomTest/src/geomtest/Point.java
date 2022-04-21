/*
 * Point.java
 *
 * Created on 29 septembre 2008, 15:32
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package geomtest;

/**
 *
 * @author rm188766
 */
public class Point {
    
    private int x;
    private int y;
    
    
    /** Creates a new instance of Point */
    public Point() {
        
        this.x = 10;
        this.y = 10;
        
    }
    
    public Point(int x, int y){
        
        this.x = x;
        this.y = y;
        
    }
    
    public int getX(){
        
        return this.x;
        
    }
    
    public int getY(){
        
        return this.y;
        
    }
    
    public void SetXY(int x, int y){
        
        this.x = x;
        this.y = y;
      
    }
    
    
    public String toString(){
        
        return "x:" + String.valueOf(this.x) + " y:" + String.valueOf(this.y);
        
    }
    
    public void Afficher(){
        
        System.out.println(this.toString());
        
    }
    
}
