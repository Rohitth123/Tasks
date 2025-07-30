package javamultithreading;


class UnsafeCounter {
    int count = 0; 
}

class UnsafeCounterThread extends Thread {
    UnsafeCounter counter;

    public UnsafeCounterThread(UnsafeCounter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.count++; 
        }
    }
}

public class UnsafeCounterDemo {
    public static void main(String[] args) {
        UnsafeCounter counter = new UnsafeCounter();

        UnsafeCounterThread t1 = new UnsafeCounterThread(counter);
        UnsafeCounterThread t2 = new UnsafeCounterThread(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        System.out.println("Final count: " + counter.count);
    }
}
