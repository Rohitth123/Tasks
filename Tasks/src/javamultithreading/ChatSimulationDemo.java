package javamultithreading;


class ChatBox {
    boolean senderTurn = true; 
    public synchronized void send(String msg) {
        while (!senderTurn) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sender: " + msg);
        senderTurn = false;
        notify(); 
    }

    
    public synchronized void receive(String msg) {
        while (senderTurn) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Receiver: " + msg);
        senderTurn = true;
        notify(); 
    }
}

class Sender extends Thread {
    private ChatBox chat;

    private String[] messages = {
        "Hi!",
        "How are you?",
        "What are you doing?",
        "Want to grab lunch?",
        "Bye!"
    };

    public Sender(ChatBox chat) {
        this.chat = chat;
    }

    public void run() {
        for (String msg : messages) {
            chat.send(msg);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Receiver extends Thread {
    private ChatBox chat;

    private String[] replies = {
        "Hello!",
        "I’m fine.",
        "Just working.",
        "Sure, let’s go.",
        "See you!"
    };

    public Receiver(ChatBox chat) {
        this.chat = chat;
    }

    public void run() {
        for (String msg : replies) {
            chat.receive(msg);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ChatSimulationDemo {
    public static void main(String[] args) {
        ChatBox chat = new ChatBox();

        Sender sender = new Sender(chat);
        Receiver receiver = new Receiver(chat);

        sender.start();
        receiver.start();
    }
}

