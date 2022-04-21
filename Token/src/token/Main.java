/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package token;
import java.util.StringTokenizer;


/**
 *
 * @author rm188766
 */
public class Main {

    
    public static String[] Decoupe(String s)
    {
        int i = 0;
        StringTokenizer st = new StringTokenizer(s);
        String[] mot = new String[st.countTokens()];
        while(st.hasMoreTokens())
        {
            mot[i] = st.nextToken();
            i++;
        }
        
        return mot;
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String phrase = "Bonjour comment ca va bien ?";
        String mots[] = Decoupe(phrase);
               
        for(int j=0;j < mots.length;j++)
            System.out.println(mots[j]);
        
        
    }

}
