package Lesson3;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
//        MyThread t1 = new MyThread("T1");
//        t1.start();
//
//        MyThread t2 = new MyThread("T2");
//        t2.start();
//
//        Thread t3 = new Thread(new MyRunnable("T3"));
//        t3.start();

//        Thread t4 = new Thread(Main::extracted);
//        t4.run();

        Thread maxThread = new Thread(() -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 1; i < a.length; i++) {
                if(max < a[i]) max = a[i];
            }
        });

        Thread minThread = new Thread(() -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 1; i < a.length; i++) {
                if(min > a[i]) min = a[i];
            }
        });

        maxThread.start();
        minThread.start();

        try {
            minThread.join();
            maxThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("Main ended");
    }

    static int[] a = {3, 52, 234, 1 , -334, -11};
    static int max = a[0];
    static int min = a[0];


    public static boolean isCorrect(String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '{' || c == '[' || c == '('){
                st.push(c);
            }else if(c == '}' || c == ']' || c == ')'){
                if(st.isEmpty()) return false;
                char p = st.pop();
                if(!((c == '}' && p == '{') || (c == ']' && p == '[') || (c == ')' && p == '('))) return false;
            }
        }

        return st.isEmpty();
    }

    private static void extracted() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("T4" + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
