package javainterface;

interface RemoteControl {
    void turnOn();  // Abstract method

    default void batteryStatus() {
        System.out.println("Battery is 80% charged.");
    }
}

class TV implements RemoteControl {
    public void turnOn() {
        System.out.println("TV is now ON.");
    }
}

public class InterfaceDemo1 {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.turnOn();           // Abstract method implementation
        tv.batteryStatus();    // Default method
    }
}

