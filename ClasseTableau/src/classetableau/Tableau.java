/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package classetableau;

/**
 *
 * @author rm188766
 */
public class Tableau {
    
    static int taille;
    static int max;
    static int[] t;
        
    public Tableau(int taille)
    {
        this.taille = taille;
        this.t = new int[taille];
        
                
    }
    
    public static void Tri_insertion(int nb)
    {
        int i;
        for(i=0;(i < max) && (nb > t[i]);i++);
        
        
        for(int j = max;j >= i;j--)
            t[j+1] = t[j];
        
        t[i] = nb;
        
        max++;
        
    }
    
        
    public static void Aff_tab()
    {
        for(int i=0;i < max;i++)
            System.out.println(t[i]);
        
    }
    
   
    

}
