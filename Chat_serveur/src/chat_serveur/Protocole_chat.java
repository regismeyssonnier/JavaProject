/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package chat_serveur;

import java.util.*;

/**
 *
 * @author Régis
 */
public class Protocole_chat {
    
    private ArrayList<Salon> Salon_chat;
    private ArrayList<Client> Client_chat;
    private Client client;
    
    public Protocole_chat(ArrayList<Salon> Salon_chat, ArrayList<Client> Client_chat, Client client){
        
        this.Salon_chat = Salon_chat;  
        this.Client_chat = Client_chat;
        this.client = client;
        
    }
    
    public String Analyse_chaine(String str){
        
        String[] s;
        String reponse = "";
        
        if(str.indexOf("|") != -1)
        {
            s = str.split("\\|");
                  
        }
        else
        {
            s = new String[1];
            s[0] = str;
            
        }
        
        reponse = Analyse_protocole(s);
        
        return reponse;
        
        
    }
    
    
    private String Analyse_protocole(String[] prot){
        
        String reponse = "";
        
        if(prot[0].equals("Bonjour"))
        {
            this.client.Set_pseudonyme(prot[1]);
            reponse = "Bonjour|" + this.client.Get_id_client();
            
        }
        else if(prot[0].equals("Recherche_salon"))
        {
            reponse = "Salon|" + String.valueOf(Salon_chat.size());
            
            for(int i=0;i < Salon_chat.size();i++)
            {
                reponse += "|" + Salon_chat.get(i).Get_id_salon() + ":" + Salon_chat.get(i).Get_nom_salon();
            }
            
        }
        else if(prot[0].equals("Connecter_salon"))
        {
            reponse = "Salon|" + String.valueOf(Salon_chat.size());
            
                        
        }
        
        
        return reponse;
        
    }
    
    
    
    

}
