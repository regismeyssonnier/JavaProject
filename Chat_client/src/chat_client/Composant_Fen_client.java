/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package chat_client;

import javax.swing.*;



/**
 *
 * @author Régis
 */
public class Composant_Fen_client {
    
    public JTextArea Reponse_serveur_area;
    public JList Liste_salon;
    public Liste_item_salon List_item_salon;
    
    public Composant_Fen_client(JTextArea Reponse_serveur_area, JList Liste_salon, Liste_item_salon List_item_salon){
        
        this.Reponse_serveur_area = Reponse_serveur_area;
        this.Liste_salon = Liste_salon;
        this.List_item_salon = List_item_salon;
        
    }

}
