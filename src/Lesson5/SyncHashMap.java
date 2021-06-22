package Lesson5;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SyncHashMap {
    Map<String, String> map = new HashMap<>();
    ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    Lock writeLock = readWriteLock.writeLock();
    Lock readLock = readWriteLock.readLock();

    public void put(String k, String v){
        try{
            writeLock.lock();
            map.put(k, v);
        }finally {
            writeLock.unlock();
        }
    }

    public void remove(String k){
        try{
            writeLock.lock();
            map.remove(k);
        }finally {
            writeLock.unlock();
        }
    }

    public String get(String k){
        try{
            readLock.lock();
            return map.get(k);
        }finally {
            readLock.unlock();
        }
    }
}
