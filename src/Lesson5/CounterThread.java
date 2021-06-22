package Lesson5;

public class CounterThread extends Thread {
    private String name;
    private Counter counter;

    public CounterThread(String name, Counter counter) {
        this.name = name;
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.count(name);
        System.out.println("Count is finished");
        counter.finishLock();
    }
}
