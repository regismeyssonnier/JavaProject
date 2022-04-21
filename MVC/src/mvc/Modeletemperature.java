/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mvc;

/**
 *
 * @author Régis
 */
import java.util.Observable;


public class Modeletemperature extends Observable{
	
	private double tempF = 32;
	private double tempC;
	
	Modeletemperature(){
            super();
		
	}
	
	public double getTemperatureF(){
		
            return this.tempF;
		
	}
	
	public double getTemperatureC(){
		
            this.tempC = ((this.tempF-32.0)*5.0)/9.0;
            return this.tempC;
		
	}
	
	public void setTempF(double tempF){
		
            this.tempF = tempF;
            this.setChanged();
            this.notifyObservers();
		
	}
	
	public void setTempC(double tempC){
			
            this.tempF = (((tempC*9)/5.0) + 32.0);
            this.setChanged();
            this.notifyObservers();
		
	}

}
