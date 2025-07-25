package javainterface;

interface RemoteControl {
    void turnOn();
    default void batteryStatus() {
        System.out.println("Battery is 80% charged.");
    }
    static void info() {
        System.out.println("This is a RemoteControl interface.");
    }
}

class TV implements RemoteControl {
    public void turnOn() {
        System.out.println("TV is now ON.");
    }
}

public class InterfaceDemo2 {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.turnOn();
        tv.batteryStatus();

        // Calling static method from interface
        RemoteControl.info();
    }
}

