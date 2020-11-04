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

        String data[] = {"Hola","que","tal","Hola","bien","y","tal"};

        Histogram histo = new Histogram(data);
                
        Map<String, Integer> histogr = histo.getHistogram();
        
        Iterator<Map.Entry<String, Integer>> entries = histogr.entrySet().iterator();
        
        while(entries.hasNext()){
            Map.Entry<String, Integer> entry = entries.next();
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        }
        
    }
    
}
