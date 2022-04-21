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
public class Client {
    
    private int id_client;
    private String pseudonyme;
    private Thread_serveur th_serv;
    private ArrayList<Salon> salon;
    
    public Client(int id_client, String pseudonyme, Thread_serveur th_serv){
        
        this.id_client = id_client;
        this.pseudonyme = pseudonyme;
        this.th_serv = th_serv;
        this.salon = new ArrayList<Salon>();
        
    }
    
    public Client(int id_client, Thread_serveur th_serv){
        
        this.id_client = id_client;
        this.th_serv = th_serv;
        this.salon = new ArrayList<Salon>();
        
    }
    
    public void Set_id_client(int id_client){
        
        this.id_client = id_client;
        
    }
    
    public int Get_id_client(){
        
        return this.id_client;
        
    }
    
    public void Set_pseudonyme(String pseudonyme){
        
        this.pseudonyme = pseudonyme;
        
    }
    
    public String Get_pseudonyme(){
        
        return this.pseudonyme;
        
    }
    
    public void Ajouter_salon(Salon s){
        
        this.salon.add(s);
        
    }
    
    public void Retirer_salon(String id_salon){
        
        for(int i=0;i < this.salon.size();i++)
        {
            if(this.salon.get(i).Get_id_salon().equals(id_salon))
            {
                this.salon.remove(i);
                break;
                
            }
        }
        
    }

}
