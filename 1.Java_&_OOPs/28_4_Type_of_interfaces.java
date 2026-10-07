/*
INTERFACE
|
|--- Normal Interface
|      |--- Multiple abstract methods
|
|--- Functional Interface
|         |--- Exactly ONE abstract method
|                   |--- Can use Lambda
|
|--- Marker Interface
          |--- ZERO methods
                  |--- Only marks a class
*/


// 2. Functional Interface (SAM - Single Abstract Method)
@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}
//Because it has one abstract method, you can use a lambda:
Calculator calculator = (a, b) -> a + b;
System.out.println(calculator.add(10, 20)); // 30




// 3. Marker Interface 
interface Serializable { }
class Student implements Serializable {
    String name;
}
// A famous real Java example is java.io.Serializable.