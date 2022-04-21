/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package chat_client;

/**
 *
 * @author Régis
 */
public class Client {
    
    private int id_client;
    private String pseudonyme;
    
    public Client(int id_client, String pseudonyme){
        
        this.id_client = id_client;
        this.pseudonyme = pseudonyme;
        
    }
    
    public Client(String pseudonyme){
        
        this.pseudonyme = pseudonyme;
        
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
    

}
