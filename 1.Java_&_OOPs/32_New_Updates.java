
// 1. JDK 21
// Hello World printing
void main() {
    System.out.println("Hello World");
}

// 2. Var (Local Variable Type Inference) [Java 10]
// var allows Java to infer the type of a local variable from the value assigned to it.
var name = "Rounak";
var age = 25;
var salary = 34850.0;
var list = new ArrayList<String>();


// 3. Sealed Classes [Java 17] -> A sealed class lets you control which classes are allowed to extend it.
// in between of final and abstract class
// sub-class of a sealed class can be sealed, non-sealed, final
// in one line after "extends" then "implments" then at the end "permits"
// sealed can use with interfaces as well
sealed class Animal permits Dog, Cat {...}

final class Dog extends Animal {...}

final class Cat extends Animal {...}

non-sealed class Cat extends Animal {...} // not sealded for that branch only

// ------------------------
sealed class Animal permits Cat {
    void eat() {
        System.out.println("Eating");
    }
}
non-sealed class Cat extends Animal {
    void meow() {
        System.out.println("Meow");
    }
}
class Puppy extends Cat {
    void bark() {
        System.out.println("Bark");
    }
}

Puppy puppy = new Puppy();
puppy.eat();   // ✅ inherited from Animal
puppy.meow();  // ✅ inherited from Cat
puppy.bark();  // ✅ Puppy method



// 4. Record Classes [Java 17] - A record is a special type of class designed to hold immutable data with less boilerplate code.
// uses for : For things like DTOs, API response objects, configuration/data objects, records can be very useful.
// Normal class Without a record:A lot of boilerplate.
class User {
    private final String name;
    private final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
// Record : The same basic data carrier can be written as:
record User(String name, int age) {}
// Java automatically provides: Constructor, name(), age(), equals(), hashCode(), toString()
// However, record immutability is shallow. If a record contains a mutable object such as List, that list itself can still be modified unless you protect/copy it.
// Can records extend classes? > No, a record implicitly extends java.lang.Record, so it cannot extend another class.. But it can implement interfaces

// Example
record User(String name, int age) {

    // Custom method
    boolean isAdult() {
        return age >= 18;
    }
}

public class Main {

    public static void main(String[] args) {
        // Creating record object
        User user = new User("Rounak", 25);

        // Accessing record components
        System.out.println("Name: " + user.name());
        System.out.println("Age: " + user.age());

        // Calling custom method
        System.out.println("Adult: " + user.isAdult());

        // toString()
        System.out.println(user);
    }
}