// Upcasting and Downcasting in Java : Both are related to inheritance + polymorphism.

//         Animal
//           ^
//           |
//          Dog

// Dog is an Animal.

// Upcasting ⬆️ : Child object - Parent reference
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Bark");
    }
}

class Main {
    public static void main(String[] args) {

        Animal a = new Dog();  // Upcasting

        a.sound();             // ✅
        // a.bark();           // ❌
    }
}


// Downcasting ⬇️ : Parent reference - Child reference

Animal a = new Dog();
Dog d = (Dog) a;   // Downcasting
d.sound();         // ✅
d.bark();          // ✅


/*
Safe way to Downcast
Use instanceof:

Animal a = new Dog();

if (a instanceof Dog) {
    Dog d = (Dog) a;
    d.bark();
}
*/