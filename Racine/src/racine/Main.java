/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package racine;
import java.util.Scanner;
/**
 *
 * @author rm188766
 */
public class Main {

    
    public static double Racine(double n, double precision)
    {
        double a=0, b, m, c;
        
        b = n;
        m = (a+b) / 2;
        while(b-a > precision)
        {
            c = m * m;
            
            if(c > n)
                b = m;
            else 
                a = m;
            
            m = (a+b) / 2;
            
        }
        
        return m;
        
        
    }
    
    public static void SecDeg(int a, int b, int c)
    {
        double x1, x2;
        int delta = (b * b) - 4 * a * c;
        
        if(delta > 0)
        {
           x1 = (-b - Racine(delta, 0.0001)) / (2 * a);
           x2 = (-b + Racine(delta, 0.0001)) / (2 * a);
           
           System.out.println("2 solutions - " + x1 + " " + x2);
        }
        
        if(delta == 0)
        {
            x1 = -b / (2*a);
            
            System.out.println("1 solution - " + x1);
            
        }
        
        if(delta < 0)
        {
            System.out.println("Pas de solution");
        }
        
    }
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double n = 9;
        double precision = 0.000000001;
        
        double rac = Racine(n, precision);
        
        //System.out.println("La racine de " + n + " est " + rac);
        
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        SecDeg(a, b, c);
        
        
        
    }

}
