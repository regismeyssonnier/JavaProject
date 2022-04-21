/*
 * cadre.java
 *
 * Created on 20 octobre 2008, 15:30
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package interface_graphique;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author rm188766
 */
public class cadre extends JFrame implements ActionListener{
    
    
    JButton trace = new JButton("tracer");
    JButton efface = new JButton("effacer");
    dessin cercle = new dessin();
    
    JButton rect = new JButton("rectangle");
    JButton cerc = new JButton("cercle");
    
    
    /** Creates a new instance of cadre */
    public cadre() {
        
        JPanel choixpan = new JPanel();
        choixpan.add(rect);
        choixpan.add(cerc);
                
        JPanel mesBoutons = new JPanel();
        mesBoutons.add(trace);
        mesBoutons.add(efface);
        this.setLayout(new BorderLayout(5,5));
        this.add(mesBoutons, BorderLayout.NORTH);
        this.add(cercle, BorderLayout.CENTER);
        this.add(choixpan, BorderLayout.SOUTH);
        
        trace.addActionListener(this);
        efface.addActionListener(this);
        rect.addActionListener(this);
        cerc.addActionListener(this);
        
        
    }
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == trace)
        {
            cercle.dessiner = true;
            cercle.repaint();
        }
        
        if(e.getSource() == efface)
        {
            cercle.dessiner = false;
            cercle.repaint();
        }
       
        if(e.getSource() == rect)
        {
            cercle.cercle = false;
            
            
        }
        
        if(e.getSource() == cerc)
        {
            cercle.cercle = true;
            
        }
        
        
        
        
        
        
        
    }
    
}
