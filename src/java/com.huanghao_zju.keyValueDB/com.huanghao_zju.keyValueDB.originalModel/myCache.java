import java.util.HashMap;
import java.util.Map;

public final class myCache<K,V> implements myCacheExpire {
    private myCache(){};
    public static <K,V>myCache <K,V>newInstance(){
        return new myCache<>();
    }
    private Map<K,V> map = new HashMap<>();
    private int size = Integer.MAX_VALUE;

    private myCacheEvict<K,V> evict = new FIFOCacheEvict<>();

    public myCache<K,V> setMap(Map<K,V> map) {
        this.map = map;
        return this;
    }

    public myCache<K,V> setSize(int size) {
        this.size = size;
        return this;
    }

    public myCache<K,V> setEvict(myCacheEvict<K, V> evict) {
        this.evict = evict;
        return this;
    }

    public myCache<K,V> build(){
        return this;
    }

    public void put(K key, V vaule){
        this.map.put(key,vaule);
    }






    public static void main(String[] args) {
        myCache<String,String> cache  = myCache.<String,String>newInstance()
                .setSize(2)
                .build();
        cache.put("1","v1");
        cache.put("2","v2");
        cache.put("3","v3");
        cache.put("4","v4");
        System.out.println(cache.map);
    }


    @Override
    public void expire(Object key, long millsSecond) {

    }

    @Override
    public void expireAfter(Object key, long millsSecond) {

    }
}
