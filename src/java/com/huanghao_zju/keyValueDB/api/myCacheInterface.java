package java.com.huanghao_zju.keyValueDB.api;

import java.util.Map;

public interface myCacheInterface<K,V> extends Map<K,V> {

    //缓存过期
    myCacheInterface<K,V> expire(final K key, final long timeInMills);

    myCacheInterface<K,V> expireAfter(final K key, final long timeInMills);

    //过期处理类
    myCacheExpireInterface<K,V> expire();




}
