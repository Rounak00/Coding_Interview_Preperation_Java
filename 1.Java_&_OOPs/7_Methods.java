class Calculator {

    // No return value
    public void greet() { System.out.println("Hello"); }
    // Returns int
    public int add(int a, int b) { return a + b; }
    // Returns double
    public double divide(double a, double b) { return a / b; }
    // Returns String
    public String getName() { return "Calculator"; }
    // Returns boolean
    public boolean isPositive(int n) { return n > 0; }
}

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.greet();                       // void
        System.out.println(c.add(10, 5));       // int
        System.out.println(c.divide(10, 3));    // double
        System.out.println(c.getName());        // String
        System.out.println(c.isPositive(10));   // boolean
    }
}


// Method Overloading -> Defining multiple methods with the same name but different parameters (number, type, or order).
class Calculator {
    public int add(int a, int b) { return a + b; }
    public int add(int a, int b, int c) { return a + b + c; }
    public double add(double a, double b) {return a + b; }
}

Calculator c = new Calculator();
c.add(2, 3);          // int, int
c.add(2, 3, 4);       // int, int, int
c.add(2.5, 3.5);      // double, double