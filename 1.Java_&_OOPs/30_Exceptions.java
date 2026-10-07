
//All types of errors
//1. Compile-Time Error : Error detected by the compiler before the program runs.
//   Syntax errors, Wrong data types, Missing ;, Undefined variables

// 2. Runtime Error: Program successfully compiles, but crashes or behaves incorrectly while running.
// Examples: Division by zero, Null reference, Array index out of bounds, File not found

// 3. Logical Error: Program runs successfully, but produces the wrong result.

/*
Type	                Detected	   Program runs?
Compile-time	        Compiler	       ❌
Runtime	             JVM while running	   ✅ > may crash
Logical	             Developer/testing	   ✅
*/
// Exceptions : Exceptions are runtime errors.
int a = 10;
int b = 0;
System.out.println(a / b); // ArithmeticException

/*Common Java exceptions (Runtime Exceptions)
 * ArithmeticException       → 10 / 0
 * NullPointerException      → using null object
 * ArrayIndexOutOfBoundsException → invalid array index
 * NumberFormatException     → "abc" → Integer.parseInt()
*/

//And this leads directly to exception handling: try,catch,finally,throw,throws
/**
 * Java Exception Hierarchy

Everything starts from Throwable:

                 Throwable
                /         \
           Exception       Error
              |
     RuntimeException
              |
       -------|---------------
       |      |               |
 Arithmetic  NullPointer   ArrayIndexOutOfBounds
 Exception   Exception        Exception
 */

//1. Exception : Problems that a program can generally handle/recover from.
try { // try can have multiple catch blocks one by one
    int x = 10 / 0;
} catch (ArithmeticException e) { //Exception e (as Exception is Parent class)
    System.out.println("Cannot divide by zero");
}

//2. Error : Serious problems generally not meant to be handled by application code.
//Examples: OutOfMemoryError, StackOverflowError, Important distinction


// Exception Hirarchy
Throwable [class]
|- Exception[class]  > application-level problems
|   |-- RuntimeException --> these called uncheck exceptions
|   |-- Other different exceptions like SQL etc --> these are called checked exceptions (ie. handle the exceptions)
|-Error[class]      > serious JVM/system problems, mostly we can not handle


//throw is used to manually create and throw an exception.
// throw new ExceptionType("message"); -> uses inside try block, not exact but propogate
int age = 15;
if (age < 18) {
    throw new IllegalArgumentException("Age must be 18 or above");
}


//throws -- declares that a method may throw an exception
void test() throws IOException { ... }
void readFile() throws IOException, SQLException { ... }


//Custom Exceptions  : A custom exception is an exception class that you create yourself for your application's specific situation.
class InvalidAgeException extends Exception { // class MyException extends RuntimeException - for an unchecked custom exception.
    InvalidAgeException(String message) {
        super(message);
    }
}
class Main {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Eligible");
    }
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}


// finally is a block that normally executes whether an exception occurs or not.
try {
    int x = 10 / 0;
}
catch (ArithmeticException e) {
    System.out.println("Exception occurred");
}
finally {
    System.out.println("Finally executed");
}

/*
* Output : 
* Exception occurred
* Finally executed
*/


