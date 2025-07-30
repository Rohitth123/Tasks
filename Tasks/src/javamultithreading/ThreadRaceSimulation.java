package javamultithreading;


import java.util.Random;

class Racer extends Thread {
    private String racerName;
    private Random random = new Random();

    public Racer(String name) {
        this.racerName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(racerName + ": running... lap " + i);
            try {
                Thread.sleep(random.nextInt(1000)); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(racerName + ": finished the race!");
    }
}

public class ThreadRaceSimulation {
    public static void main(String[] args) {
        Racer tortoise = new Racer("Tortoise");
        Racer rabbit = new Racer("Rabbit");
        Racer dog = new Racer("Dog");

        tortoise.start();
        rabbit.start();
        dog.start();
    }
}

