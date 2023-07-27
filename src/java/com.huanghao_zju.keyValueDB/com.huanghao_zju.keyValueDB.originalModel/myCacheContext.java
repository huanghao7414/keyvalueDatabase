import java.util.Map;

/**
 * 缓存上下文
 * @author huanghao
 * @since 2023/7/27 22:38
 */
public interface myCacheContext<K,V> {
    //一个缓存需要有哪些东西？
    int size();
    myCacheEvict cacheEvict();
    Map<K,V> map();
}
