/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package classe;
import java.math.*;



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
        
        Tableau t = new Tableau(10);
        for (int i=0;i<10;i++)
            t.Ajouter((int)(Math.random()*100));
        
        t.Afficher();
        
    }

}
