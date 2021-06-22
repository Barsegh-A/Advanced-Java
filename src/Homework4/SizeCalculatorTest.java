package Homework4;

public class SizeCalculatorTest {

    public static void main(String[] args) {
        String path = "./";

        SizeCalculator sc = new SizeCalculator(path);

        Thread t1 = new Thread(sc);
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(t1.isAlive()) {
                    if(sc.getSize() == 0) continue;
                    System.out.println("In progress ... " + sc.getSize() + " bytes.");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Result: " + sc.getSize() + " bytes (" + sc.getSizeGB() + " gegabytes.)");

    }
}
