/*
 * dessin.java
 *
 * Created on 20 octobre 2008, 15:26
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package interface_graphique;

import javax.swing.JPanel;
import java.awt.*;


/**
 *
 * @author rm188766
 */
public class dessin extends JPanel{
    
    
    boolean cercle;
    boolean dessiner;
    
    /** Creates a new instance of dessin */
    public dessin() {
        
        this.setBackground(Color.PINK);
        this.setPreferredSize(new Dimension(200, 150));
        this.cercle = true;
        this.dessiner = false;
        
    }
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        if(dessiner)
        {
            if(cercle){
            
                g.setColor(Color.RED);
                g.drawOval(50,20,100,100);
                        
            }
            else
            {
                g.setColor(Color.BLACK);
                g.drawRect(50, 20, 120, 100);
            }
            
        }
        
        
    }
    
    
    
}
