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
        
        Map<Integer, Integer> histogram = new HashMap<Integer,Integer>();
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        Iterator<Map.Entry<Integer,Integer>> entries = histogram.entrySet().iterator();
        
        while(entries.hasNext()){
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        }
        
    }
    
}
