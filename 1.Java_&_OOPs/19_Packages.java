// ./college/Student.java
package college;

public class Student {
    public void display() {
        System.out.println("Student class");
    }
}

// ./Main.java
import college.Student;
// import college.*; -> can do this also for multiple or all | * means files only not folders


public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}