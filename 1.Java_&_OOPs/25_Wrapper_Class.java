//A Wrapper Class is a Java class that converts a primitive data type into an object.
// Primitive → Wrapper
// Primitive	Wrapper Class
// byte	Byte
// short	Short
// int	Integer
// long	Long
// float	Float
// double	Double
// char	Character
// boolean	Boolean


/**
 * Why do we need Wrapper Classes? -> Some Java features work only with objects, not primitives.
 * For example, ArrayList cannot store int directly: ArrayList<int> numbers; // ❌
 *                                                   ArrayList<Integer> numbers = new ArrayList<>();
 */


/**
 * Boxing : Converting primitive → wrapper object is called Boxing. similarly unboxing also there.
 * int x = 10;
 * Integer obj = Integer.valueOf(x); |or,| Integer obj = x;
 * assign directly and not using intValue() or valueOf() function java do it as auto-boxing & auto-unboxing
 */

/**
 * object/reference.
 * Therefore, Integer also gives you useful methods:
 * Integer x = 100;
 * System.out.println(x.toString());
 * System.out.println(Integer.parseInt("123"));
 * System.out.println(Integer.max(10, 20));
 */


public class Main {

    public static void main(String[] args) {

        // 1. BOXING
        // Primitive → Wrapper manually
        int a = 10;
        Integer b = Integer.valueOf(a);

        System.out.println("Boxing:");
        System.out.println("Primitive: " + a);
        System.out.println("Wrapper: " + b);


        // 2. UNBOXING
        // Wrapper → Primitive manually
        Integer c = Integer.valueOf(20);
        int d = c.intValue();

        System.out.println("\nUnboxing:");
        System.out.println("Wrapper: " + c);
        System.out.println("Primitive: " + d);


        // 3. AUTOBOXING
        // Primitive → Wrapper automatically
        int e = 30;
        Integer f = e;

        System.out.println("\nAutoboxing:");
        System.out.println("Primitive: " + e);
        System.out.println("Wrapper: " + f);


        // 4. AUTO-UNBOXING
        // Wrapper → Primitive automatically
        Integer g = 40;
        int h = g;

        System.out.println("\nAuto-unboxing:");
        System.out.println("Wrapper: " + g);
        System.out.println("Primitive: " + h);
    }
}