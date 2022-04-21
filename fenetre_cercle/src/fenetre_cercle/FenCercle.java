/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fenetre_cercle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
/**
 *
 * @author rm188766
 */
public class FenCercle extends JPanel implements MouseListener{
    
    private ArrayList<Cercle> AllCercles;
    
    public FenCercle(){
        
        this.setPreferredSize(new Dimension(250, 250));
        this.addMouseListener(this);
        AllCercles = new ArrayList<Cercle>();
        
        
    }
    
    public void mousePressed(MouseEvent evt){
        
        
        
        
    }
    
    public void mouseReleased(MouseEvent evt){
        
        
        
        
    }
    
    public void mouseEntered(MouseEvent evt){
        
        
        
        
    }
    
    public void mouseExited(MouseEvent evt){
        
        
        
        
    }
    
    public void mouseClicked(MouseEvent evt){
        
        Cercle c = new Cercle(evt.getX(), evt.getY(), 20);
        AllCercles.add(c);
        this.repaint();
        
    }
    
    public void paintComponent(Graphics g){
        
        for(int i=0;i < AllCercles.size();i++){
            
            AllCercles.get(i).dessine(g);
            
            
        }
        
        
    }
    
    

}
