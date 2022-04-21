/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mvc;

/**
 *
 * @author Régis
 */
import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Régis
 */
public class Fenetre2 extends JFrame implements Observer{
    
    private JPanel pan = new JPanel();
    private JButton incrementer = new JButton("+");
    private JButton decrementer = new JButton("-");
    private JTextField text = new JTextField();
    private Modeletemperature mt;

    public Fenetre2(Modeletemperature mt){

            this.mt = mt;
            this.setTitle("Celsius");
            this.setSize(200,200);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            pan.setBackground(Color.white);
            pan.setLayout(new BorderLayout());
            text.setText(String.valueOf(mt.getTemperatureC()));

            pan.add(BorderLayout.WEST, incrementer);
            pan.add(BorderLayout.EAST, decrementer);

            this.add(pan, BorderLayout.SOUTH);
            this.add(text, BorderLayout.NORTH);
            
            incrementer.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    IncrementerActionPerformed(evt);
                }
            });
            
            decrementer.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    DecrementerActionPerformed(evt);
                }
            });
            
            this.setVisible(true);




    }
    
    public void IncrementerActionPerformed(java.awt.event.ActionEvent evt) {
       
        this.mt.setTempC(this.mt.getTemperatureC()+1);
       
    }
    
    public void DecrementerActionPerformed(java.awt.event.ActionEvent evt) {
              
       this.mt.setTempC(this.mt.getTemperatureC()-1);
       
    }

    @Override
    public void update(Observable o, Object arg) {
            // TODO Auto-generated method stub
        
        if(o == this.mt)
        {
            text.setText(String.valueOf(this.mt.getTemperatureC()));
        }

    }

}

