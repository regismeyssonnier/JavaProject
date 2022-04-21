/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fenetre_cercle;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author rm188766
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame cadre = new JFrame();
        cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cadre.setContentPane(new FenCercle());
        cadre.setLocation(50,50);
        cadre.setVisible(true);
        cadre.setSize(new Dimension(250, 250));
        
        
    }

}
