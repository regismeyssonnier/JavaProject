/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package classe;

/**
 *
 * @author rm188766
 */
public class Tableau {
    
   private int[] elements;
   private int max_elements;
   private int nb_elements;
   
   public Tableau(int nb_elements){
       int[] tab;
       elements=new int[nb_elements];
       this.max_elements=nb_elements;
       this.nb_elements=0;
       
   }

   public void Ajouter(int nb)
   {
       if (nb_elements<max_elements){
       elements[this.nb_elements] = nb;
       this.nb_elements++;
       }
   }
   
   public void Supprimer(){
       
       this.nb_elements--;
   }
   
   public void Remplacer(int nb){
       
       Supprimer();
       Ajouter(nb);
   
   }
   
   
   public void Afficher(){
       
       for(int i=0;i < this.nb_elements;i++)
           System.out.print(elements[i] + " ");
       
       
   }
   
   
}
