/*
 * Main.java
 *
 * Created on 6 octobre 2008, 15:47
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package employee;

/**
 *
 * @author rm188766
 */
public class Main {
    
    /** Creates a new instance of Main */
    public Main() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Employee[] te = new Employee[5];
        
        Employee e = new Employee();
        System.out.println(e.getName() + " " + e.WeeklyPay());
        te[0] = e;
        
        Employee e2 = new Employee("Thierry", 250000);
        System.out.println(e2.getName() + " " + e2.WeeklyPay());
        
        
        e2.giveRaise(0.23);
        System.out.println(e2.getName() + " " + e2.WeeklyPay());
        te[1] = e2;
        
        Manager m = new Manager("Meyssonnier", 1000000, "Alice");
        System.out.println(m.getName() + " " + m.WeeklyPay());
        m.giveRaise(0.5);
        System.out.println(m.getName() + " " + m.WeeklyPay());
        te[2] = m;
        
        Executive ex = new Executive("Louis", 100000, "Martine", 10000);
        System.out.println(ex.getName() + " " + ex.WeeklyPay());
        ex.giveRaise(0.1);
        System.out.println(ex.getName() + " " + ex.WeeklyPay());
        te[3] = ex;
        
        HourlyEmployee h = new HourlyEmployee("Martin", 10000, 38, 0.2);
        System.out.println(h.getName() + " " + h.WeeklyPay());
        h.giveRaise(0.1);
        System.out.println(h.getName() + " " + h.WeeklyPay());
        te[4] = h;
        
        System.out.println("-----------"); 
        double som = 0;
        for(int i = 0;i < te.length;i++)
        {
            double sal = te[i].WeeklyPay();
            System.out.println(sal);
            som += sal;
            System.out.println("somme:"+som);
            System.out.println(te[i].getName() + ":" + sal); 
            
        }
        
        System.out.println("Masse salariale = " + som);
        
    }
    
}
