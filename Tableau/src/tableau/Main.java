/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tableau;

/**
 *
 * @author rm188766
 */
public class Main {

    
    public static void Tri_a_bulle(int[] tab)
    {
        
        int i = 0;
        while(i < tab.length - 1)
        {
            if(tab[i] > tab[i+1])
            {
                int memo = tab[i];
                tab[i] = tab[i+1];
                tab[i+1] = memo;
                i = 0;
            }
            i++;
        }
        
        
    }
    
    public static void Tri_insertion(int[] tab, int max, int nb)
    {
        int i;
        for(i=0;(i < max) && (nb > tab[i]);i++);
        
        
        for(int j = max;j >= i;j--)
            tab[j+1] = tab[j];
        
        tab[i] = nb;
        
        
        
    }
    
    public static void Tri_Selection(int[] tab)
    {
        int min = 0;
        int ind = 0;
        
        for(int i=0;i < tab.length - 1;i++)
        {
            min = i;
            
            for(int j = i+1;j < tab.length;j++)
            {
                if(tab[j] < tab[min])
                    min = j;
                
                
            }
            
            if(min != i)
            {
                int memo = tab[i];
                tab[i] = tab[min];
                tab[min] = memo;
            }
            
        }
            
       
        
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
        
        System.out.println("-----Tri a bulle-------");
        int tab[] = { 1, 6, 4 ,3, 2, 14 };
        Tri_a_bulle(tab);
        
        Aff_tab(tab);
        
        System.out.println("----Tri Insertion-------");
        
        
        int[] tab2 = new int[20];
        for(int i=0;i<20;i++)tab2[i] = 0;
        
        int max = 0;
        Tri_insertion(tab2, max, 2);max++;
         
        Tri_insertion(tab2, max, 1);max++;
        
        Tri_insertion(tab2, max, 3);max++;
        
        Tri_insertion(tab2, max, 64);max++;
        
                
        Aff_tab(tab2);
        
        System.out.println("----Tri selection------------");
        
        int tab3[] = { 1, 6, 4 ,3, 2, 14 };
        Tri_Selection(tab3);
        Aff_tab(tab3);
        
        
    }

}
