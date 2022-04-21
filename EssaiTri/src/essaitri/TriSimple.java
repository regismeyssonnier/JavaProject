/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package essaitri;

/**
 *
 * @author rm188766
 */
public class TriSimple {

    private int capacite;
    private int increment;
    private int max;
    private int[] tab;
    
    public TriSimple(){
        
        tab = new int[5];
        max = 0;
        capacite = 5;
        increment = 5;
        
    }
    
    public TriSimple(int capacite, int increment){
        
        tab = new int[capacite];
        max = 0;
        this.capacite = capacite;
        this.increment = increment;
        
    }
    
    public void Inserer(int entier){
        
        if(max == capacite)
        {
            //System.out.println("nouveau tableau");
            
            capacite += increment;
            int[] t = new int[capacite];
            for(int i=0;i < max;i++)
                t[i] = tab[i];
            
            tab = t;
            
        }
        
        int i;
        for(i=0;(i < max) && (entier > tab[i]);i++);
        
        for(int j = max-1;j >= i;j--)
        {
            tab[j+1] = tab[j];
            
        }
        
        tab[i] = entier;
        max++;
                
        
    }
    
    public void Supprimer(int entier){
        
        for(int i=0;i < max;i++)
        {
            if(tab[i] == entier)
            {
                for(int j = i;j < max-1;j++)
                    tab[j] = tab[j+1];
                
                max--;
                
                break;
            }
        }
     
        int f = capacite-max;
        int k = increment * 2;
        
        //System.out.println("cap-max:"+f+" i*2:" + k);
       
        if((capacite-max) >= increment*2)
        {
            //System.out.println("nouveau tableau supprimer");
            
            capacite = max + increment;
            int[] t = new int[capacite];
            for(int i = 0;i < max;i++)
                t[i] = tab[i];
            
            tab = t;
            
            
        }
        
    }
    
    public String toString(){
        
        String s = "";
        
        for(int i = 0;i < max;i++)
            s += String.valueOf(tab[i]) + " ";
        
        return s;
        
    }
    
    
}
