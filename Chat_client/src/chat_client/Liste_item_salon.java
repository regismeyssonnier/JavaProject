/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package chat_client;

import javax.swing.*;
import java.util.*;

/**
 *
 * @author Régis
 */
public class Liste_item_salon extends AbstractListModel {
    
    
    ArrayList<String> Liste_item;
    
    public Liste_item_salon(){
        
        Liste_item = new ArrayList<String>();
        
    }
    
    public int getSize() {
        
        return Liste_item.size(); 
    
    }
    public Object getElementAt(int i) {
        
        return Liste_item.get(i);
    
    }
    
    public Object addItem(String s) {
        
        return Liste_item.add(s);
    
    }
    
    public Object removeItem(int i) {
        
        return Liste_item.remove(i);
    
    }

    
}
