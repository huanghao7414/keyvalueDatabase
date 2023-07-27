
/**
 * 过期策略
 * @author huanghao
 * @since 2023/7/27 23:14
 */
public interface myCacheExpire<K,V> {
    /**
       有可能的情况：
     1  key 不存在，不用做；
     2 不用提供新建key 指定过期时间的方式，不符合；不设置就是永久；
     3 删除的策略：
        3-1 惰性删除： 在执行某些方法时进行删除； 但是要考虑数据不一致的问题；
        3-1 定时删除： 启动一个定时任务，每次随机选择指定的key 进行过期判断，类似于redis；默认使用ttl作为比较基准，
     * @author huanghao
     * @since 2023/7/27 23:22
     */

    void expire(K key,long millsSecond);
    //指定时间点
    void expireAfter(K key, long millsSecond);

}
