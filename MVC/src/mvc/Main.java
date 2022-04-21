/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mvc;

/**
 *
 * @author Régis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Modeletemperature mt = new Modeletemperature();
        Fenetre1 fen1 = new Fenetre1(mt);
        mt.addObserver(fen1);
        Fenetre2 fen2 = new Fenetre2(mt);
        mt.addObserver(fen2);
        Fenetre3 fen3 = new Fenetre3(mt);
        mt.addObserver(fen3);
        
    }

}
