/**
 * Inner Class
 * Anonymous Inner Class
 * Abstract Anonymous Inner Class
 **/

// Inner Class in Java : An inner class is a class defined inside another class.
class Car {
    String brand = "BMW";
    class Engine {
        void start() {
            System.out.println(brand + " engine started");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car.Engine engine = car.new Engine();
        engine.start();
    }
}

/* Java generally has 4 types:

  Type	                         Declared inside	   Key point
  Member Inner Class	             Class	           Non-static   -> simple previous example
  Static Nested Class	             Class	             static
  Local Inner Class	               Method/block	    Exists within method
  Anonymous Inner Class	            Expression	       No class name
*/

// 2. Static Nested Class
class Outer { // can't never make a outer class static
    static class Inner {
        void show() {
            System.out.println("Hello");
        }
    }
}
// No outer object is needed:
Outer.Inner i = new Outer.Inner();



// 3. Local Inner Class : A class declared inside a method
class Outer {
    void test() { //Inner can only be used within test().
        class Inner {
            void show() {
                System.out.println("Hello");
            }
        }

        Inner i = new Inner();
        i.show();
    }
}


// 4. Anonymous Inner Class : A class without a name, usually used for one-time implementations.
class A {
    public void show(){
        System.out.println("Hello this is from A");
    }
}

class Func{ 

    public static void main(String args[]){
        A obj=new A() // difinition of show
        { // anonymous class opening
           @Override
           public void show(){
                System.out.println("Hello this is from A's Object creation");
            }
        };
        obj.show();
    }
}


// Abstract anonymous inner class
abstract class Animal {
    abstract void sound();
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            void sound() {
                System.out.println("Bark");
            }
        };
        dog.sound();
    }
}