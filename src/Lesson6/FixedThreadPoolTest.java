package Lesson6;

import Lesson5.ExecutorService.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

public class FixedThreadPoolTest {

    private List<Callable<String>> callables = new ArrayList<>();


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<String> a = service.submit(FixedThreadPoolTest::function2);
        Future<String> b = service.submit(FixedThreadPoolTest::function3);
        Future<String> c = service.submit(FixedThreadPoolTest::function2);
        Future<String> d = service.submit(FixedThreadPoolTest::function3);
        service.shutdown();

        System.out.println(a.get());
        System.out.println(b.get());
        System.out.println(c.get());
        System.out.println(d.get());
    }


    private static String function1(){
        return "Hi 2";
    }


    private static String function2(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hi 2";
    }

    private static String function3(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hi 3";
    }

}
