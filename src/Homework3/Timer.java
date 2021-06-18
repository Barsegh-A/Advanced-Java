package Homework3;

public class Timer implements Runnable{

    private int minutes;
    private int seconds;

    public Timer(int minutes, int seconds) {
        this.minutes = minutes;
        this.seconds = seconds;
    }

    @Override
    public void run() {
        StringBuilder sb;
        while(minutes >= 0){
            while(seconds >= 0){
                sb = new StringBuilder();
                if(minutes < 10) sb.append(0);
                sb.append(minutes);
                sb.append(":");
                if(seconds < 10) sb.append(0);
                sb.append(seconds);
                seconds--;
                System.out.println(sb);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            seconds = 59;
            minutes--;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
