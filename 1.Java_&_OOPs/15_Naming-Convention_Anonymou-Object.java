class StudentDetails {

    // Constant
    static final int MAX_AGE = 100;

    // Instance variable
    String studentName;
    int studentAge;

    // Constructor
    StudentDetails(String studentName, int studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    // Method
    void displayStudentDetails() {
        System.out.println(studentName);
    }
}

// class and interfaces start with caputal
// variable and methods starts with smaller letter
// Constants all capital
// but if variable, class, methods have more than one word then it would be fully camel case




// Anonymous Object in Java
class Student {
    void display() {
        System.out.println("Hello Rounak");
    }
}

class Main {
    public static void main(String[] args) {
       new Student().display();
    }
}

//When useful?
//Mostly when you need an object only once:
new Student().display();