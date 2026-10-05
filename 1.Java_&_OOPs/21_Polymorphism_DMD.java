// Polymorphism = "One thing, many forms."
// In Java, there are 2 types:
// Polymorphism
// ├── 1. Compile-time  → Method Overloading
// └── 2. Runtime       → Method Overriding


//Dynamic Method Dispatch = Runtime Polymorphism. They are essentially the same concept in Java.
//  Type of Parent and Object of Child
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override 
    void sound() {
        System.out.println("Bark");
    }
}

class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();  // Bark
    }
}