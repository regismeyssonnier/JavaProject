/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package convertisseur;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author rm188766
 */
public class Cadre extends JFrame implements ActionListener{
    
    private JTextField celsius;
    private JTextField degre;
    private JLabel cels_lab;
    private JLabel deg_lab;
    private JCheckBox case1;
    private JLabel cd_lab;
    private JLabel dc_lab;
    private JCheckBox case2;
    private JButton convertir;
    
    
    public Cadre(){
        
        celsius = new JTextField();
        celsius.setPreferredSize(new Dimension(50, 20));
                        
        degre = new JTextField();
        degre.setPreferredSize(new Dimension(50, 20));
                
        cels_lab = new JLabel("Celsius");
        deg_lab = new JLabel("Degre");
       
        case1 = new JCheckBox();
        case2 = new JCheckBox();
        
        cd_lab = new JLabel("Celsius vers degre");
        dc_lab = new JLabel("Degre vers celsius");
                
        convertir = new JButton("Convertir");
        
        JPanel deg_cel = new JPanel();
        deg_cel.add(celsius);
        deg_cel.add(degre);
        
        JPanel deg_cel2 = new JPanel();
        deg_cel2.add(cels_lab);
        deg_cel2.add(deg_lab);
        
        JPanel pancheck = new JPanel();
        pancheck.add(case1);
        pancheck.add(case2);
        
        JPanel panbout = new JPanel();
        panbout.add(convertir);
        
        this.setLayout(new GridLayout(5, 5));
        this.add(deg_cel);
        this.add(deg_cel2);
        this.add(pancheck);
        this.add(panbout);
        
        convertir.addActionListener(this);
        
        
    }
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == convertir){
            
            double d = Math.round(Float.valueOf(celsius.getText()) * 2.73);
            degre.setText(String.valueOf(d));
            
        }
        
        
    }
    
    
    

}
