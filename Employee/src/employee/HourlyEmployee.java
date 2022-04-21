/*
 * HourlyEmployee.java
 *
 * Created on 6 octobre 2008, 17:36
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package employee;

/**
 *
 * @author rm188766
 */
public class HourlyEmployee extends Employee{
    
    private double hoursWorked;
    private double overtimeRate;
    
    /** Creates a new instance of HourlyEmployee */
    public HourlyEmployee(String name, double salary, double nbr_heures, double p) {
        
        super(name, salary);
        this.hoursWorked = nbr_heures;
        this.overtimeRate = p;
        
        
        
    }
    
    public double WeeklyPay(){
        
        if(this.hoursWorked < 40)
        {
            this.salary = this.hoursWorked * this.salary;
        }
        else
        {
            this.salary = 40 * this.salary + (this.hoursWorked-40) * this.salary * this.overtimeRate;
                   
        }
        
        return this.salary;
        
    }
    
    
}
