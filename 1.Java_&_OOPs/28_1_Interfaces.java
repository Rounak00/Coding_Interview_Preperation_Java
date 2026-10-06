// Interface : An interface is a contract/blueprint that defines what a class must do, without necessarily defining how it does it.

/**
 * Key Points:
 * 1. Interface is a contract/blueprint.
 * 2. Class uses implements.
 * 3. Interface cannot be instantiated Object.
 * 4. Interface methods are public abstract by default , Unless they are default, static, or private.
 * 5. Interface variables are public static final by default.
 * 6. A class can implement multiple interfaces.     //class Dog implements Animal, Runnable {...}
 * 7. An interface can extend multiple interfaces. // interface C extends A, B {...}
 * 8. Implementing class must implement all abstract methods, unless the class itself is abstract.
 */
interface Animal {
    int age=22; // static and final
    void sound(); // abstract method
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Animal.age); // as static so can do direct with interface name
        Animal a = new Dog();
        a.sound();
    }
}

//Interface to class  can't inherit 
// Class to class or interface to interface -> extends
// class to interface -> implements 