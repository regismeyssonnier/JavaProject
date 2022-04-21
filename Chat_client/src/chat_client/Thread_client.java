/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package chat_client;

import java.net.*;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author rm188766
 */
public class Thread_client extends Thread{
    
    private Socket sock;
    private JTextArea Reponse_serveur_area;
    
    private PrintWriter out;
    private BufferedReader in;
    
    private String IP_Serveur;
    private int Port_Serveur;
    
    private Composant_Fen_client Comp_fen_client;
    
    private boolean connexion = true;
    
    private Protocole_chat protocole;
    
    private Client client;
    
    public Thread_client(String ip_serv, int port_serv, Composant_Fen_client cfc, Client client){
        
        try{
        
            this.IP_Serveur = ip_serv;
            this.Port_Serveur = port_serv;
            this.sock = new Socket(this.IP_Serveur, this.Port_Serveur );
            this.Comp_fen_client = cfc;
            this.client = client;
            this.protocole = new Protocole_chat(this.Comp_fen_client, this.client);
            

            
        
        }
        catch(UnknownHostException e)
        {
            this.Reponse_serveur_area.setText(e.toString());

        }
        catch(IOException e) {
	    e.printStackTrace();
	}

        
        
        
    }
    
     public void run(){
        
        try{
        
            out = new PrintWriter(this.sock.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(this.sock.getInputStream()));
            
            out.println("Bonjour|" + this.client.Get_pseudonyme());
            
            String s = in.readLine();
            this.Comp_fen_client.Reponse_serveur_area.setText(this.Comp_fen_client.Reponse_serveur_area.getText() + "\n" + s);
            this.protocole.Analyse_chaine(s);
            
            out.println("Recherche_salon");
            
            s = in.readLine();
            this.Comp_fen_client.Reponse_serveur_area.setText(this.Comp_fen_client.Reponse_serveur_area.getText() + "\n" + s);
            this.protocole.Analyse_chaine(s);
            
             
            while(connexion){
                
               
                
                
            }
            
        }
        catch(SocketException e) {
	    this.Comp_fen_client.Reponse_serveur_area.setText(this.Comp_fen_client.Reponse_serveur_area.getText() + "\n" + e.toString());
	}
        catch(IOException e) {
	    e.printStackTrace();
	}

        
    }
    
    

}
