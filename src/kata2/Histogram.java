package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author alvaroafonsolopez
 */
public class Histogram {

    int data[];

    public Histogram(int data[]) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public Map<Integer,Integer> getHistogram(){
        Map<Integer,Integer> histogram = new HashMap<Integer, Integer>();
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        return histogram;
    }
}
