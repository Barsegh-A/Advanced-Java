package Lesson5;

import java.util.concurrent.locks.ReentrantLock;

public class Counter {

    ReentrantLock reentrantLock = new ReentrantLock();

    public void count(String name){
        reentrantLock.lock();
        for (int i = 1; i < 11; i++) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void finishLock(){
        System.out.println("Finishing lock");
        reentrantLock.unlock();
    }
}
