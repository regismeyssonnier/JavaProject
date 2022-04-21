/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mvc;

/**
 *
 * @author Régis
 */
import java.awt.event.AdjustmentEvent;
import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Régis
 */
public class Fenetre3 extends JFrame implements Observer{
    
    private Scrollbar s = new Scrollbar(Scrollbar.HORIZONTAL);
    private Modeletemperature mt;

    public Fenetre3(Modeletemperature mt){

            this.mt = mt;
            this.setTitle("Farenheit");
            this.setSize(200,50);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            
            s.setMaximum(110);
            s.setValue((int)this.mt.getTemperatureF());
            
            s.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
                public void adjustmentValueChanged(AdjustmentEvent e) {
                    ChangeValueScroll(e);                    
                }
            });
            
            this.add(s);
                        
            this.setVisible(true);




    }
    
    public void ChangeValueScroll(AdjustmentEvent e) {
        
        this.mt.setTempF(s.getValue());
        
    }

    @Override
    public void update(Observable o, Object arg) {
            // TODO Auto-generated method stub
        
        if(o == this.mt)
        {
            s.setValue((int)this.mt.getTemperatureF());
        }
        
    }

}

