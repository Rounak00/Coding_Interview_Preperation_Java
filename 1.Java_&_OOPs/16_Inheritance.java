// Why do we need Inheritance in Java?
// Inheritance allows one class to acquire the properties and methods of another class.
// It is mainly used for code reusability and creating a logical parent-child relationship between classes.


// Types of Inheritance in Java
// Java mainly supports 4 practical types of inheritance.
// Multiple inheritance with classes is not supported.

// 1. Single Inheritance : One child class inherits from one parent class.
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // inherited
        d.bark();  // own method
    }
}

// 2. Multilevel Inheritance : A class inherits from another child class, creating a chain.
class Animal {
    void eat() { System.out.println("Eating"); }
}

class Dog extends Animal {
    void bark() { System.out.println("Barking"); }
}

class Puppy extends Dog {
    void play() { System.out.println("Playing"); }
}

public class Main {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.eat();   // Animal
        p.bark();  // Dog
        p.play();  // Puppy
    }
}


//3. Hierarchical Inheritance : Multiple child classes inherit from the same parent.
class Animal { void eat() { System.out.println("Eating"); }}
class Dog extends Animal { void bark() { System.out.println("Barking"); }}
class Cat extends Animal { void meow() { System.out.println("Meowing"); }}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}


//4. Multiple Inheritance — Not Supported with Classes : Java does not allow this:
class A {}
class B {}

// ❌ Not allowed
class C extends A, B {
}
//Because it can create ambiguity.

// Instead, Java supports multiple inheritance through interfaces:

interface A { void showA(); }

interface B { void showB(); }

class C implements A, B {

    public void showA() {
        System.out.println("A");
    }

    public void showB() {
        System.out.println("B");
    }
}