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
public class Salon {
    
    private String id_salon;
    private String nom_salon;
    private ArrayList<Client> Tab_client;
    
    public Salon(String id_salon, String nom_salon){
        
        this.id_salon = id_salon;
        this.nom_salon = nom_salon;
        this.Tab_client = new ArrayList<Client>();
        
    }
    
    public void Entrer_salon(Client client){
        
        this.Tab_client.add(client);
        
    }
    
    public void Sortir_salon(Client client){
        
        if(this.Tab_client.contains(client)){
            this.Tab_client.remove(client);
        }
        
    }
    
    public String Get_id_salon(){
        
        return this.id_salon;        
    }
    
    public String Get_nom_salon(){
        
        return this.nom_salon;        
    }
    
    public Client Get_client(int i){
        
        return this.Tab_client.get(i);
        
    }
    
    public int Get_nb_client(){
        
        return this.Tab_client.size();
        
    }
    

}
