package javainhertence;


class Animal {
 
 public void sound() {
     System.out.println("Some generic animal sound");
 }
}


class Dog extends Animal {
 @Override
 public void sound() {
     System.out.println("Dog barks: Woof Woof");
 }
}


class Cat extends Animal {
 @Override
 public void sound() {
     System.out.println("Cat meows: Meow Meow");
 }
}


class Cow extends Animal {
 @Override
 public void sound() {
     System.out.println("Cow moos: Moo Moo");
 }
}


public class AnimalSoundTest {
 public static void main(String[] args) {
     
     Animal a;

     a = new Dog();
     a.sound();  // Outputs: Dog barks

     a = new Cat();
     a.sound();  // Outputs: Cat meows

     a = new Cow();
     a.sound();  // Outputs: Cow moos
 }
}

