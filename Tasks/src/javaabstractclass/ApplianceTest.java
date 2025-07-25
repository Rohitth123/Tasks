package javaabstractclass;


abstract class Appliance {
 
 abstract void turnOn();
}


interface Connectable {
 void connect();
}


class SmartTV extends Appliance implements Connectable {

 @Override
 public void turnOn() {
     System.out.println("SmartTV is now ON.");
 }

 @Override
 public void connect() {
     System.out.println("SmartTV connected to Wi-Fi.");
 }
}


public class ApplianceTest {
 public static void main(String[] args) {
     SmartTV tv = new SmartTV();
     tv.turnOn();
     tv.connect();
 }
}
