/*
 * Employee.java
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
public class Employee {
    
    protected String name;
    protected double salary;
    
    /** Creates a new instance of Employee */
    public Employee() {
        
        this.name = "Meyssonnier";
        this.salary = 1000000;
        
    }
    
    public Employee(String name, double salary){
        
        this.name = name;
        this.salary = salary;
        
    }
    
    public String getName(){
        
        return name;
        
    }
    
    public double WeeklyPay(){
        
        return salary / 52;
        
    }
    
    public void giveRaise(double p){
        
        salary += salary * p;
        
    }
    
    
    
}
