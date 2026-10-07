// Lambda Function
@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}
Calculator calculator = (a, b) -> { return a + b; } ;
System.out.println(calculator.add(10, 20)); // 30


/*
// Expression lambda --> implicit return (only when one statement)
(a, b) -> a + b;
// Block lambda --> explicit return required
(int a,int b) -> {
    return a + b;
};
*/



// We can send lambda expression in Argument.
@FunctionalInterface
interface Calculator { int calculate(int a, int b); }

static void calculateAndPrint(int a, int b, Calculator calculator) { System.out.println(calculator.calculate(a, b)); }
public static void main(String[] args) { calculateAndPrint(10, 20, (a, b) -> a + b); }