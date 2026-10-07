// Encapsulation in Java
// Encapsulation means wrapping data (variables) and methods together inside a class and controlling direct access to that data.
// Usually:
// Variables - private
// Access - public getter/setter methods

class Student {
    // Private variables - cannot be accessed directly outside class
    private String name;
    private int age;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Rounak");
        s.setAge(25);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}