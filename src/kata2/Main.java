package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author alvaroafonsolopez
 */
public class Main {
    
    public static void main(String[] args) {
        
        int data[] = {1,2,3,1,5,6,4,8,9,10,8,12,8,44,9};

        Histogram histo = new Histogram(data);
                
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        Iterator<Map.Entry<Integer, Integer>> entries = histogr.entrySet().iterator();
        
        while(entries.hasNext()){
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        }
        
    }
    
}
