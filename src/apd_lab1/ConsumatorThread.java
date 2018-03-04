

package apd_lab1;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author PoLson
 */
public class ConsumatorThread extends Thread{
    private LinkedList<Integer> coada;

    ConsumatorThread(LinkedList<Integer> coada){
         this.coada = coada;
    }
    public void run(){
         while(true){
              synchronized(coada){
                 if(coada.size() > 0)
                 {
                     coada.remove();
                 }
                 for(int i=0;i<coada.size(); i++){
                     System.out.print(coada.get(i)+" ");
                 }
                 System.out.print("\n");
             }
             try {
                 sleep(200);
             } catch (Exception e) {
                 System.out.print(e);
             }
         }
    }    
}
