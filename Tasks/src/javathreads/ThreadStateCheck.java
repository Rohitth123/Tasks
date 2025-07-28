package javathreads;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread is running... " + i);
            try {
                Thread.sleep(500); // 0.5 second delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class ThreadStateCheck {
    public static void main(String[] args) {
        MyThread t = new MyThread();

        
        System.out.println("Before start: " + t.isAlive());  // false

        t.start();

        
        System.out.println("After start: " + t.isAlive());   // true

        try {
            t.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        System.out.println("After join: " + t.isAlive());    // false
    }
}

