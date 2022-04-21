/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package chat_serveur;

import java.net.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author rm188766
 */
public class Serveur {
    
    private ServerSocket ServeurSock;
    private boolean ecoute = true;
    private int port_ecoute;
    
    private ArrayList<Salon> Salon_chat;
    private ArrayList<Client> Client_chat;
    
    private int id_client;
    
    public Serveur(int port){
        
        try
        {
            this.port_ecoute = port;
            this.Salon_chat = new ArrayList<Salon>();
            this.Client_chat = new ArrayList<Client>();
            this.ServeurSock = new ServerSocket(this.port_ecoute);
            this.id_client = 1;
            
            System.out.println("Serveur lancer\nEcoute sur le port " + this.ServeurSock.getLocalPort());
            
            //Protocole_chat p = new Protocole_chat();
            //System.out.println(p.Analyse_chaine("regismeyssonnier"));
            Salon s = new Salon("Salon1", "Salon de merde");
            Salon_chat.add(s);
                       
                      
            while(ecoute)
            {
                new Thread_serveur(this.ServeurSock.accept(), this.Salon_chat, this.Client_chat, this.id_client).start();
                this.id_client++;
                //System.out.println("id_client:" + this.id_client);

            }


            this.ServeurSock.close();
        
        }
        catch(IOException e)
        {
            System.err.println(e.toString());
            System.exit(1);
                       
        }
        
        
        
        
        
    }
    
    

}
