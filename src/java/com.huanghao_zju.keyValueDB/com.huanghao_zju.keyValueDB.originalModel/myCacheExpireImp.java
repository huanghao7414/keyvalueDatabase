import java.util.HashMap;
import java.util.Map;

/**
 实现 过期时间；
 * @author huanghao
 * @since 2023/7/27 23:29
 */
public class myCacheExpireImp<K,V> implements myCacheExpire<K,V> {
    private final Map<K, Long> expireMap = new HashMap<>();

    @Override
    public void expire(K key, long millsSecond) {
        long expireTime = System.currentTimeMillis() + millsSecond;
        expireAfter(key,expireTime);
    }

    @Override
    public void expireAfter(K key, long expireTime) {
        expireMap.put(key,expireTime);
    }
}
