package java.com.huanghao_zju.keyValueDB.impl;

import java.com.huanghao_zju.keyValueDB.api.myCacheExpireInterface;
import java.com.huanghao_zju.keyValueDB.api.myCacheInterface;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class myCache implements myCacheInterface {
    @Override
    public myCacheInterface expire(Object key, long timeInMills) {
        return null;
    }

    @Override
    public myCacheInterface expireAfter(Object key, long timeInMills) {
        return null;
    }

    @Override
    public myCacheExpireInterface expire() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }
}
