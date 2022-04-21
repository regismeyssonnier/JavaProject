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
public class Thread_serveur extends Thread {
    
    private Socket sock;
    private PrintWriter out;
    private BufferedReader in;
    private boolean connexion = true;
    private ArrayList<Salon> Salon_chat;
    private ArrayList<Client> Client_chat;
    private Protocole_chat protocole;
    private Client client;
    
    
    public Thread_serveur(Socket sock, ArrayList<Salon> salon_c, ArrayList<Client> client_c,int id_client){
        
        this.sock = sock;
        this.Salon_chat = salon_c;
        this.Client_chat = client_c;
        this.client = new Client(id_client, this);
        this.protocole = new Protocole_chat(this.Salon_chat, this.Client_chat, client);
        
        this.Client_chat.add(this.client);
        
        
    }
    
    public void run(){
        
        try{
        
            out = new PrintWriter(this.sock.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(this.sock.getInputStream()));
            
            
             
            while(connexion){
                
                String in_str = in.readLine();
                System.out.println(in_str);
                String reponse = this.protocole.Analyse_chaine(in_str);
                out.println(reponse);
                
               
                
                
            }
            
            in.close();
            out.close();
            this.sock.close();
            
        }
        catch(SocketException e) {
	    System.out.println(e.toString());
	}
        catch(IOException e) {
	    e.printStackTrace();
	}

        
    }
    
    
    
    

}
