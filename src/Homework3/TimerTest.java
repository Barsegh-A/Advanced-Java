package Homework3;

import java.util.Scanner;

public class TimerTest {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Minutes: ");
        int min = sc.nextInt();
        System.out.print("Seconds: ");
        int sec = sc.nextInt();

        Timer timer = new Timer(min, sec);

        Thread t = new Thread(timer);
        t.start();
    }
}
