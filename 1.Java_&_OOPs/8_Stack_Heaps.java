Stack vs Heap in Java
                    Stack	                                                 Heap
Stores method calls, local variables, references	          Stores objects and instance variables
Each thread has its own stack	                                       Shared among threads
Memory is automatically cleared when method ends	          Objects are removed by Garbage Collector (GC)
Faster	                                                                Relatively slower
Smaller memory	                                                          Larger memory

Example:
class Car {
    String color;
}
public class Main {
    public static void main(String[] args) {
        int x = 10;
        Car c = new Car();
        c.color = "Red";
    }
}

// Conceptually:

STACK                  HEAP
------                 ------
x = 10                 Car object
c ───────────────────> color = "Red"
x → local variable → Stack
c → reference variable → Stack
new Car() → object → Heap
color → instance variable inside object → Heap

Easy rule:
Stack = execution & local data | Heap = objects