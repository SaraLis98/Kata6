
package kata6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Histogram<T> {
    
    private Map <T, Integer>map;
    
    public Histogram(Iterator<T> iterator){
        this(iterableOf(iterator));
    }
    
    
    public Histogram(Iterable<T> iterator) {
        this.map = new HashMap<T, Integer>();
        for( T item : iterator)add(item);
    }
    
    private static <X> Iterable<X> iterableOf(Iterator <X> iterator){
        return new Iterable<X>(){
            @Override
            public Iterator<X> iterator(){
                return iterator;
            }
        };
    }
    
    private void add(T item){
        map.put(item,get(item)+1);
    }
    
    private int get( T item){
        return map.containsKey(item) ? map.get(item) :0;
    }
}
