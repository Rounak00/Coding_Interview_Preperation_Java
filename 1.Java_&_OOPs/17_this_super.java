// super - Parent Class : super refers to the parent class object/members.
// when we create a object it always call sub and parent class both constructor
class Parent {
    Parent() { System.out.println("Parent Constructor"); }
}
class Child extends Parent {
    Child() {
        // super(); is automatically added by Java : default a blank super
        System.out.println("Child Constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        // When Child object is created:
        // 1. Parent constructor is called first
        // 2. Child constructor is called second
    }
}

// Another Example
class A { // here A's constructor also have super() thats point to Object Class (actually every class in java extends Object class)
    // Normal / No-argument constructor
    A() { System.out.println("A Normal Constructor"); }
    // Parameterized constructor
    A(int x) { System.out.println("A Parameterized Constructor: " + x); }
}

class B extends A { // here B dont extend Object it only Extends A and A enxtends Object so kind of multilevel
    // Normal / No-argument constructor
    B() {
        super(); // Calls A's normal constructor
        System.out.println("B Normal Constructor");
    }

    // Parameterized constructor
    B(int x) {
        //  default will have super() and it will call A's defaut constructor
        super(x); // Calls A's parameterized constructor
        System.out.println("B Parameterized Constructor: " + x);
    }
}

public class Main {
    public static void main(String[] args) {
        // Normal constructors
        B obj1 = new B();
        System.out.println();
        // Parameterized constructors
        B obj2 = new B(10);
    }
}



// difference of super and this
class Animal {
    String name = "Animal";
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    String name = "Dog";
    void show() {
        System.out.println(this.name);  // Dog
        System.out.println(super.name); // Animal
        super.eat(); // calls parent method
    }
}




// Another example where B's both constructor and A's only one constructor calls
class A {
    A() {
        System.out.println("A Normal Constructor");
    }

    A(int x) {
        System.out.println("A Parameterized Constructor");
    }
}

class B extends A {
    // B Constructor 1
    B() {
        super(); // Calls A()
        System.out.println("B Normal Constructor");
    }
    // B Constructor 2
    B(int x) {
        // super(x); // Calls A(int)
        this(); // calls default constructor
        System.out.println("B Parameterized Constructor");
    }
}
