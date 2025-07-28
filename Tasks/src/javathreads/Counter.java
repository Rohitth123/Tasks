package javathreads;

class RunnableCounter implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Count: " + i);
            try {
                Thread.sleep(500); // Optional: add delay of 0.5 sec to observe output better
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableCounter counter = new RunnableCounter();
        Thread t = new Thread(counter); // Wrap Runnable in a Thread
        t.start();
	}

}
