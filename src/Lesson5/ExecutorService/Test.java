package Lesson5.ExecutorService;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();

        Future<String> submit = service.submit(Test::getHi);

        service.shutdown();

        System.out.println("Before getting future");
        String s = submit.get();
        System.out.println("End main");

    }

    private static String getHi(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hi";
    }
}
