/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
package applet;
import javax.swing.*;
import java.applet.*;


public class Exemple extends Applet {
 
    
    public Exemple(){
        
    }
   
    public void init(){
        
        String mois = getParameter("mois");
        String annee = getParameter("annee");
        System.out.println("Date:" + mois + "/" + annee);
        int anneesuiv;
        anneesuiv = Integer.parseInt(annee) + 1;
        System.out.println("annee suivante:" + anneesuiv);
        
    }
    
    public void start(){
        
        System.out.println("applet lancé");
        
    }
    
    public void stop(){
        
        System.out.println("applet arrete");
        
    }
    
    public void destroy(){
        
        System.out.println("Destruction de l'applet");
        
    }
   
}
 *
 **/
/*
import java.awt.*;
import java.util.*; //pour Calendar
import java.applet.*;

public class Exemple extends Applet implements Runnable{

  Thread tr;
  Image imgTmp;
  Graphics gTmp;

  public Exemple() {
    if (tr == null) {
        tr = new Thread(this);
        tr.start();
    }
  }

  public void run(){
    while (true) {
      repaint();
      try { Thread.sleep(1000);
      } catch(InterruptedException e){
        }
    }
  }

  public void init() {
    Dimension dim = getSize();
    imgTmp = createImage(dim.width, dim.height);
    gTmp = imgTmp.getGraphics();

    setBackground(Color.white);
  }

  public void update(Graphics g) {
    paint(g);
  }

  public void paint(Graphics gsp) {

    Calendar d  = Calendar.getInstance();

    int[] tPolygonX = new int[4];
    int[] tPolygonY = new int[4];
    Color cFond = new Color(232,232,232);

    double n,z,u,x0,y0,x1,y1,x2,y2,x3,y3;

    int h = d.get(Calendar.HOUR);
    int m = d.get(Calendar.MINUTE);
    int s = d.get(Calendar.SECOND);

    gTmp.setPaintMode();

    gTmp.setColor(cFond);
    gTmp.fillOval(2,2,118,118);
    gTmp.setColor(Color.black);
    gTmp.drawOval(2,2,118,118);

    gTmp.drawString("12",55,16);
    gTmp.drawString("6",58,116);
    gTmp.drawString("3",108,66);
    gTmp.drawString("9",8,66);

    //Aiguille des secondes
    n = s*200/60;
    z = n/100*Math.PI;
    u = (n+50)/100*Math.PI;

    x0 = Math.sin(z)*50;
    y0 = -Math.cos(z)*50;

    x1 = -Math.sin(z)*10;
    y1 = Math.cos(z)*10;

    x2 = Math.sin(u)*2;
    y2 = -Math.cos(u)*2;

    x3 = -Math.sin(u)*2;
    y3 = Math.cos(u)*2;

    tPolygonX[0] = (int)x1+60;
    tPolygonX[1] = (int)x2+60;
    tPolygonX[2] = (int)x0+60;
    tPolygonX[3] = (int)x3+60;

    tPolygonY[0] = (int)y1+60;
    tPolygonY[1] = (int)y2+60;
    tPolygonY[2] = (int)y0+60;
    tPolygonY[3] = (int)y3+60;

    gTmp.setColor(Color.red);
    gTmp.fillPolygon(tPolygonX, tPolygonY, 4);
    gTmp.setColor(Color.black);
    gTmp.drawPolygon(tPolygonX, tPolygonY, 4);

    //Aiguille des minutes
    n = m*200/60;
    z = n/100*Math.PI;
    u = (n+50)/100*Math.PI;

    x0 = Math.sin(z)*50;
    y0 = -Math.cos(z)*50;

    x1 = -Math.sin(z)*10;
    y1 = Math.cos(z)*10;

    x2 = Math.sin(u)*4;
    y2 = -Math.cos(u)*4;

    x3 = -Math.sin(u)*4;
    y3 = Math.cos(u)*4;

    tPolygonX[0] = (int)x1+60;
    tPolygonX[1] = (int)x2+60;
    tPolygonX[2] = (int)x0+60;
    tPolygonX[3] = (int)x3+60;

    tPolygonY[0] = (int)y1+60;
    tPolygonY[1] = (int)y2+60;
    tPolygonY[2] = (int)y0+60;
    tPolygonY[3] = (int)y3+60;

    gTmp.setColor(Color.yellow);
    gTmp.fillPolygon(tPolygonX, tPolygonY, 4);
    gTmp.setColor(Color.black);
    gTmp.drawPolygon(tPolygonX, tPolygonY, 4);

    //Aiguille des heures
    n = h*200/12 + m*200/60/12;
    z = n/100*Math.PI;
    u = (n+50)/100*Math.PI;

    x0 = Math.sin(z)*35;
    y0 = -Math.cos(z)*35;

    x1 = -Math.sin(z)*10;
    y1 = Math.cos(z)*10;

    x2 = Math.sin(u)*4;
    y2 = -Math.cos(u)*4;

    x3 = -Math.sin(u)*4;
    y3 = Math.cos(u)*4;

    tPolygonX[0] = (int)x1+60;
    tPolygonX[1] = (int)x2+60;
    tPolygonX[2] = (int)x0+60;
    tPolygonX[3] = (int)x3+60;

    tPolygonY[0] = (int)y1+60;
    tPolygonY[1] = (int)y2+60;
    tPolygonY[2] = (int)y0+60;
    tPolygonY[3] = (int)y3+60;

    gTmp.setColor(Color.green);
    gTmp.fillPolygon(tPolygonX, tPolygonY, 4);
    gTmp.setColor(Color.black);
    gTmp.drawPolygon(tPolygonX, tPolygonY, 4);

    gsp.drawImage(imgTmp,0,0,this);
  }
}
*/

package applet;

import java.awt.Graphics;

class Exemple extends java.applet.Applet
{
   public void paint (Graphics g)
   {
      g.drawString("!!! Bonjour aux visiteurs du site AllProg !!!",5,25);
   }
}
