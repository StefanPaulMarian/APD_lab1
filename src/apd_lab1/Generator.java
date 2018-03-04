
 
package apd_lab1;
import  java.util.Random ;

/**
 *
 * @author PoLson
 */
public class Generator {
   
    private Random randomGenerator;
    private int max,n_max;
    
    
    Generator(int valueofmax){
        randomGenerator= new Random();
        max=valueofmax+1;
        n_max=numberdigits(max);
    }
     
    public float next() {
        int x=randomGenerator.nextInt(max);
        return (float)x/(float)Math.pow(10,n_max-1);
    }
      public int seedvalue() {
        return 0;
    }

    private int numberdigits(int x)
    {
        int n;
        n=0;
        while(x!=0){
            x=x/10;
            n++;
        }
        return n;
    }
}