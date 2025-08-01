package javawrapperclass;


class Box<T> {
 private T value;

 public void setValue(T value) {
     this.value = value;
 }

 
 public T getValue() {
     return value;
 }
}

public class GenericBoxDemo {
 public static void main(String[] args) {
     
     Box<Integer> intBox = new Box<>();
     Box<Double> doubleBox = new Box<>();

     
     intBox.setValue(100);        
     doubleBox.setValue(99.99);   

     
     int intValue = intBox.getValue();       
     double doubleValue = doubleBox.getValue(); 

     
     System.out.println("Integer value from Box: " + intValue);
     System.out.println("Double value from Box: " + doubleValue);
 }
}

