/*
 * Main.java
 *
 * Created on 20 octobre 2008, 15:24
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package interface_graphique;
import javax.swing.*;
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
        
        JFrame fen = new cadre();
        fen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fen.setLocation(300,100);
        fen.setSize(200,250);
        fen.setVisible(true);
        
        
    }
    
}
