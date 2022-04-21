/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package chat_serveur;

/**
 *
 * @author rm188766
 */
public class Main {

    private static Serveur serveur;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        serveur = new Serveur(5607);
        
        
    }

}
