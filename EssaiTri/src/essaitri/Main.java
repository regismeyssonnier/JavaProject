/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package essaitri;
import java.util.Scanner;
/**
 *
 * @author rm188766
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        int n = 0;
        
        TriSimple t = new TriSimple(10,2);
        
        while(n != 3)
        {
            
            System.out.println("1 - Inserer\n2 - Supprimer\n3 - Quitter");
            n = s.nextInt();
                        
            if(n == 1)
            {
                System.out.println("Inserer un nombre :");
                t.Inserer(s.nextInt());
                System.out.println(t.toString());
            }
            if(n == 2)
            {
                System.out.println("Supprimer un nombre :");
                t.Supprimer(s.nextInt());
                System.out.println(t.toString());
            }
            
            
        }
        
        /*
        TriSimple t = new TriSimple(10,2);
        t.Inserer(10);
        t.Inserer(1);
        t.Inserer(2);
        t.Inserer(11);
        t.Inserer(0);
        t.Inserer(20);
        System.out.println(t.toString());
     
        t.Supprimer(20);
        t.Supprimer(0);
        t.Supprimer(1);
        t.Supprimer(2);
        
        System.out.println(t.toString());
        */
        
    }

}
