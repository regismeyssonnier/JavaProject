/*
 * Executive.java
 *
 * Created on 6 octobre 2008, 17:21
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package employee;

/**
 *
 * @author rm188766
 */
public class Executive extends Manager{
    
    private double SharesOfStock;
    private double dividend;
    /** Creates a new instance of Executive */
    public Executive(String name, double salary, String Secretaire, double SharesOfStock) {
        
        super(name, salary, Secretaire);
        this.SharesOfStock = SharesOfStock;
        this.bonus = 0;
        
        
    }
    
    public double WeeklyPay(){
        
        this.dividend = this.SharesOfStock * 0.001;
        return super.WeeklyPay() + this.dividend;
        
    }
    
    public void giveRaise(double p){
        
        super.giveRaise(p);
        this.SharesOfStock += this.SharesOfStock * p;
        
    }
    
}
