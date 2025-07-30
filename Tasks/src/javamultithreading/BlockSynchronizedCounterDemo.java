package javamultithreading;


class BlockSynchronizedCounter {
    int count = 0; 
    public void increment() {
        synchronized (this) {
            count++;
        }
    }
}

class BlockSyncCounterThread extends Thread {
    BlockSynchronizedCounter counter;

    public BlockSyncCounterThread(BlockSynchronizedCounter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment(); 
        }
    }
}

public class BlockSynchronizedCounterDemo {
    public static void main(String[] args) {
        BlockSynchronizedCounter counter = new BlockSynchronizedCounter();

        BlockSyncCounterThread t1 = new BlockSyncCounterThread(counter);
        BlockSyncCounterThread t2 = new BlockSyncCounterThread(counter);

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
