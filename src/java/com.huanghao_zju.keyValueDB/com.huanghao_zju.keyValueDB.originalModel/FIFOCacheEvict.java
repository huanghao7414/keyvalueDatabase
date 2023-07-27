import java.util.LinkedList;
import java.util.Queue;

/**
 *  实现接口，使用FIFO 策略删除
 * @author huanghao
 * @since 2023/7/27 22:14
 */
public class FIFOCacheEvict<K,V> implements myCacheEvict<K,V>{
    private Queue<K> queue = new LinkedList<>();
    @Override
    public void evict() {
        //实现FIFO策略
    }
}
