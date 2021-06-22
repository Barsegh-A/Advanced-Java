package Lesson5;

public class DeadLockTest {
    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread1();
        Thread t2 = new Thread2();
        t1.start();
        t2.start();
    }

    static class Thread1 extends Thread {
        @Override
        public void run() {
            synchronized (lock1){
                System.out.println("Thread 1 gains lock 1");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1 trying to gain lock 2");
                synchronized (lock2){
                    System.out.println("Thread 1 gains lock 1 and lock 2");
                }
            }
        }
    }

    static class Thread2 extends Thread {
        @Override
        public void run() {
            synchronized (lock2){
                System.out.println("Thread 2 gains lock 2");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2 trying to gain lock 1");
                synchronized (lock1){
                    System.out.println("Thread 2 gains lock 1 and lock 2");
                }
            }
        }
    }
}
