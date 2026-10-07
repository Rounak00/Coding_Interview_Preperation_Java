/*
* The keyword static means the member belongs to the class, not to individual objects.
* Normally, every object gets its own copy of an instance variable/method context. With static, there is one class-level member shared by all objects.
* There are several important uses:
* 1> Static variable
* 2> Static method
* 3> Static block
* 4> Static nested class
* 5> static final constants
* 6> Static import
*/

// Static Variable : A normal variable belongs to an object.
class Student {
    String name;          // instance variable
    static String college = "ABC College";  // static variable
}
Student s1 = new Student();
Student s2 = new Student();
s1.name = "Rounak";
s2.name = "Rahul";

System.out.println(s1.name);      // Rounak
System.out.println(s2.name);      // Rahul
System.out.println(Student.college); // ABC College
Student.college = "XYZ College";
System.out.println(s1.college); // XYZ College
System.out.println(s2.college); // XYZ College


// Static Method : A static method belongs to the class, so you don't need an object to call it.
// static methods only use arguments and static variables not instance variables
// Why static method cant access instance variables? -> bcz dont know which objects variable needed to point
class Calculator {
    static int add(int a, int b) {
        return a + b;
    }
}

int result = Calculator.add(10, 20);
System.out.println(result); // 30


// Static Block : A static block is used to execute code when the class is initialized.
// we can also use it as constructor but for static variable of a class.
class Main {
    static {
        System.out.println("Static block"); //can be multiple static blocks
    }
    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
/*
Output
Static block
Main method
*/
/*
** // Extra theories 
** // java has class loader and object instance and class loader did only once when a object is created.
** // so if object not created and class will not load but still wanna use a static block so we have 
** // Class.forName("className"); //throws ClassNotFound Exception thats it, it will load the class.
*/

// static final - Constants : One of the most common uses of static is with final.
class MathConstants {
   static final double PI = 3.14159;
}
/*
Why both?
static: One shared value for the class
final: Cannot be changed
*/


//Static Nested Class : Java allows a class inside another class.
//Because the nested class does not require an instance of the outer class.
class Outer {
    static class Inner {
        void show() {
            System.out.println("Hello");
        }
    }
}
Outer.Inner obj = new Outer.Inner();
obj.show();




//Static Import : You can import static members directly.
import static java.lang.Math.*;
  System.out.println(sqrt(25)); //instead of use Math.sqrt(25)
  System.out.println(PI);



//Why is main() static?
// The JVM needs to call main() without creating an object of your class.

// For example:
class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}

// The JVM can directly call:
Main.main(args);
//Conceptually, without doing:
Main obj = new Main();
obj.main(args);

// -> That's why main() is static.



