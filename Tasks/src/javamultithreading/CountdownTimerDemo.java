package javamultithreading;


class CountdownTimer extends Thread {
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Countdown: " + i);
            try {
                Thread.sleep(1000); // Pause 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Time’s up!");
    }
}

public class CountdownTimerDemo {
    public static void main(String[] args) {
        CountdownTimer timer = new CountdownTimer();
        timer.start();
    }
}

