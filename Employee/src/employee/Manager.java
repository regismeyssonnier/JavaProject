/*
 * Manager.java
 *
 * Created on 6 octobre 2008, 16:15
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package employee;

/**
 *
 * @author rm188766
 */
public class Manager extends Employee{
    
    protected String SecretaryName;
    protected double bonus;
    
    /** Creates a new instance of Manager */
    public Manager(String name, double salary, String SecretaryName) {
        
        super(name, salary);
        this.SecretaryName = SecretaryName;
        this.bonus =  0;
        
    }
    
    public double WeeklyPay(){
        
        return super.WeeklyPay() + bonus;
        
    }
    
    public void giveRaise(double p){
        
        super.giveRaise(p);
        this.bonus = salary * 0.1;
        
    }
    
    
}
