
package apd_lab1;

import java.util.LinkedList;


public class APD_lab1 {
    private static LinkedList<Integer> coada = new LinkedList<Integer>();
    public static void main(String[] args) {
       Thread thread1 = new ProducatorThread(coada);
       Thread thread2 = new ConsumatorThread(coada);
       thread1.start();
       thread2.start();
       try{
        thread1.join();
        thread2.join();
       }
       catch(Exception e){
           System.out.print(e);
       }
       
    }
    
}
