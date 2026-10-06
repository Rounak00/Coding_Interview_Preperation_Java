// abstract means "incomplete / must be implemented by the child class."


// Abstract Class
abstract class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

//You cannot do:
Animal a = new Animal(); // ❌
//Instead, a child class extends it:
class Dog extends Animal { ... }

Dog d = new Dog(); // ✅
// Dynamic Method Dispatch possible here, only child-type and child-instance can call parent funcs,
// issue here is cant initilize a obj of Abstract class
// we can create obj of a abstract class only if it's a anonymous inner class



// Abstract Method : An abstract method is a method that has no body.
// Can only use inside Abstract Class.
// Child class always have to define abstract methods, it's compulsory.
// Until child or it's parent class define all abstract class's methods, till then we can't make the object.
abstract class Animal {
    abstract void sound();
}
//The child class must provide the implementation:
class Dog extends Animal { //concrete class
    @Override
    void sound() {
        System.out.println("Bark");
    }
}


