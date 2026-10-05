// Class -> A blueprint/template that defines properties and behaviors.
// Object -> A real instance of a class created in memory.

class Car {
    String color;

    void drive() {
        System.out.println("Car is driving");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();  // Object
        c1.color = "Red";
        c1.drive();
    }
}


// OOPS in java
/*
4 Pillars of OOP in Java
OOP (Object-Oriented Programming) has 4 main pillars:

Pillar                                             Meaning                                                  Java concept
Encapsulation                Binding data + methods together and controlling access                   private, getters/setters
Inheritance                   Child class gets properties/methods from parent                                  extends
Polymorphism                       One interface/name, different behavior                              Overloading & Overriding
Abstraction                  Hide implementation details, show only what is necessary                     abstract, interface
*/