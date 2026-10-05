// Constructors in Java
// - A constructor is a special method used to initialize an object when it is created.
/*
Key points :-
 - Constructor name must be the same as the class name.
 - It has no return type, not even void.
 - It runs automatically when an object is created using new.
 - Mainly used to initialize object variables.
 - Constructors can be overloaded.
 - If a class has multiple constructors, only one constructor is selected and executed for each new object creation, based on the arguments you provide.
*/


// 1. Default Constructor : If you don't create any constructor, Java provides a default constructor automatically.
class Student {
    String name;
    int age;
}
class Main {
    public static void main(String[] args) {
        Student s = new Student();  // default constructor
    }
}

// 2. Parameterized Constructor : Used to initialize an object with values.
class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Main {
    public static void main(String[] args) {
        Student s = new Student("Rounak", 25);

        System.out.println(s.name);
        System.out.println(s.age);
    }
}

// 3. Constructor Overloading : Multiple constructors with different parameters.
// Same as Method Overloading
class Student {
    String name;
    int age;
    Student() {
        name = "Unknown";
        age = 0;
    }
    Student(String name) {
        this.name = name;
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

Student s1 = new Student();
Student s2 = new Student("Rounak");
Student s3 = new Student("Rounak", 25);