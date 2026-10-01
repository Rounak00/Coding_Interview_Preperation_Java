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