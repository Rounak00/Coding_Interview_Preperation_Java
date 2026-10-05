// Method Overriding in Java : When a child class provides its own implementation of a method already defined in the parent class.
// Happens at runtime - Runtime Polymorphism
class A {
    void show() {
        System.out.println("A's show()");
    }
}

class B extends A {
    @Override
    void show() {
        System.out.println("B's show()");
    }
}

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();  // B's show()
    }
}


// Exception  : Method Overloading 
class A{
    public void show(int a){
        System.out.println(a+" from A class.");
    }
}
class B extends A{
   public void show(int a, int b){
       System.out.println(a + " from B class.");
   }
}
class Main {
    public static void main(String[] args) {
      B ob=new B();
      ob.show(1); // calls A
    }
}