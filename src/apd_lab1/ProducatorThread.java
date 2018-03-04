package apd_lab1;

import java.util.LinkedList;

/**
 *
 * @author PoLson
 */
public class ProducatorThread extends Thread 
{
     private Generator generator;
     private LinkedList<Integer> coada;

     ProducatorThread(LinkedList<Integer> coada ){
            this.coada = coada;
            generator = new Generator(10);
     }
     public void run(){
         while(true){
             int element = (int) generator.next();
             synchronized(coada){
                 if(coada.size() < 10)
                 {
                     coada.add(element);
                 }
                 for(int i=0;i<coada.size(); i++){
                     System.out.print(coada.get(i)+" ");
                 }
                 System.out.print("\n");
             }
                          try {
                 sleep(100);
             } catch (Exception e) {
                 System.out.print(e);
             }
         }
     }
}
