// String in Java
// String = sequence of characters.
// String is a class in Java (java.lang.String).
// Strings are immutable : once created, their value cannot be changed.

String s1 = "Hello";              // String literal
String s2 = new String("Hello");  // using new

// Common methods
s.length();          // 11
s.charAt(0);         // 'H'
s.toUpperCase();     // "HELLO WORLD"
s.toLowerCase();     // "hello world"
s.substring(0, 5);   // "Hello"
s.contains("World"); // true
s.equals("Hello");   // false
s.indexOf("World");  // 6
s.replace("World", "Java"); // "Hello Java"
s.hashcodr(); //returns an integer (int) value representing an object, mainly used in collections like HashMap and HashSet.


//String Comparison -> Use .equals() for content comparison:
String a = "Hello";
String b = "Hello";
System.out.println(a.equals(b)); // true
// == compares references, not String content.

/* Important
* String : Immutable -> its existing object cannot be modified; the reference can point to a new String.
* StringBuilder : Mutable, faster for frequent modifications
* StringBuffer : Mutable + Thread-safe
*/


// StringBuilder is a mutable sequence of characters.
// You can modify the same object using append(), insert(), delete(), etc.
// Faster than StringBuffer because it is not thread-safe.
// Use it when multiple threads are not modifying the same string.

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        // Add at the end
        sb.append(" World");
        // Insert
        sb.insert(5, " Java");
        // Replace
        sb.replace(0, 5, "Hi");
        // Delete
        sb.delete(2, 7);
        System.out.println(sb);
    }
}


// StringBuffer works almost like StringBuilder, but its methods are synchronized, making it thread-safe.
public class Main {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        sb.insert(5, " Java");

        System.out.println(sb);
    }
}