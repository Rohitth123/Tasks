package javathreads;


class NumberPrinter extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread1: " + i);
            try {
                Thread.sleep(1000); // 1 second delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class Join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberPrinter t1 = new NumberPrinter();
        t1.start(); // Start Thread1

        try {
            t1.join(); // Main thread waits for Thread1 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread done.");
	}

}
