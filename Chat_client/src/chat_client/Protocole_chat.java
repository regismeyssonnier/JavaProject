/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package chat_client;

/**
 *
 * @author Régis
 */
public class Protocole_chat {
    
    private Composant_Fen_client Fen_cli;
    private Client client;
    
    public Protocole_chat(Composant_Fen_client fen_cli, Client client){
        
        this.Fen_cli = fen_cli;
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
            this.client.Set_id_client(Integer.parseInt(prot[1]));
            
        }
        else if(prot[0].equals("Salon"))
        {
            Fen_cli.Reponse_serveur_area.setText(Fen_cli.Reponse_serveur_area.getText() + "\nNb Salon : " + prot[1]);
            
            //Fen_cli.List_item_salon = new Liste_item_salon();
            
            for(int i=2;i < prot.length;i++)
            {
                String[] salon = prot[i].split(":");
                Fen_cli.List_item_salon.addItem(salon[1]);
                
                
            }
            
            Fen_cli.Liste_salon.setModel(Fen_cli.List_item_salon);
            
        }
        
        
        return reponse;
        
    }

}
