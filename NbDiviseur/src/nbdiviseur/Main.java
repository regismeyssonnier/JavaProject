/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nbdiviseur;
import java.util.Scanner;

/**
 *
 * @author rm188766
 */
public class Main {

    
    public static int NbDiviseur(int n)
    {
        int nb = 0;
        
        for(int i = 1; i <= n;i++)
        {
            if((n % i) == 0)
            {
                System.out.println(i);
                nb++;
            }
            
        }
        
        return nb;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int nb = NbDiviseur(n);
        System.out.println(n + " a " + nb + " diviseurs");
        
        
    }

}
