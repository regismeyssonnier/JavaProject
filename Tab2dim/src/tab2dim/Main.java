/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tab2dim;
import java.math.*;
/**
 *
 * @author rm188766
 */
public class Main {

    
    
    
    public static void Remplir_tab(int[][] tab)
    {
        for(int i=0;i < tab.length;i++)
        {
            for(int j=0;j < tab[i].length;j++)
            {
                tab[i][j] = i;//(int)Math.random();
            }
        }
        
    }
    
    public static void Afficher_tab(int[][] tab)
    {
        for(int i=0;i < tab.length;i++)
        {
            for(int j=0;j < tab[i].length;j++)
            {
                System.out.println(tab[i][j]);
            }
        }
        
    }
    
    
    public static int[] Calculer_Somme(int[][] tab)
    {
        int somme = 0;
        int[] t = new int[tab.length];
        int x = 0;
        for(int i=0;i < tab.length;i++)
        {
            somme = 0;
            for(int j=0;j < tab[i].length;j++)
            {
                somme += tab[i][j];
                
            }
            t[x] = somme;
            x++;
            
        }
        
        return t;
    }
    
    public static void Aff_tab(int[] t)
    {
        for(int i=0;i < t.length;i++)
            System.out.println(t[i]);
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int tab[][];
        tab = new int[3][3];
                              
        Remplir_tab(tab);
        Afficher_tab(tab);
        
        System.out.println("-----------");
        
        int t[] = Calculer_Somme(tab);
        Aff_tab(t);
        
       
        
    }
    
    

}
