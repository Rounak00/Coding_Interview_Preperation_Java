/**
 * An annotation in Java is metadata about your code.
 * Think of it as a label/instruction attached to a class, method, variable, etc.
 */

// Why do we use annotations?
// Annotations can tell:
// 1. the compiler to check something
// 2. the JVM/runtime to do something
// 3. frameworks/libraries how to treat your code
// They generally don't directly execute logic themselves.

@Override //Here, @Override is an annotation.
public void run() {
    System.out.println("Running");
}

// Common built-in annotations : @Override, @Deprecated, @SuppressWarnings(''), @FunctionalInterface

// Creating your own annotation - You can define your own annotation using @interface

@interface MyAnnotation {
    String name();
    int age() default 25; // default
}

@MyAnnotation(name = "Rounak") // using
class Developer {
}





// Retention - very important : Annotations can have different lifetimes.
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
}
/*
There are three major retention policies:
Retention	                        Meaning
SOURCE	          Exists only in source code; removed during compilation
CLASS	          Stored in .class file but generally unavailable at runtime
RUNTIME	          Available through reflection at runtime
*/

// Target - You can restrict where your annotation can be used.
// Common targets -> ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.CONSTRUCTOR
@Target(ElementType.METHOD)
@interface MyAnnotation {
}