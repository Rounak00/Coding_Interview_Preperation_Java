// you mainly need to know Scanner and BufferedReader, plus BufferedInputStream / custom fast input for competitive programming.
// we have "System.in.read()" this give ASCII value of the input

//1. Scanner - easiest and beginner-friendly
// Good for: learning Java, small programs, basic coding.
// Downside: relatively slow for huge input.
/**
 * sc.nextInt();       // int
 * sc.nextLong();      // long
 * sc.nextDouble();    // double
 * sc.nextFloat();     // float
 * sc.nextBoolean();   // boolean
 * sc.next();          // one word
 * sc.nextLine();      // complete line
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        double salary = sc.nextDouble();
        String name = sc.next();

        System.out.println(age);
        System.out.println(salary);
        System.out.println(name);

        sc.close();
    }
}
/**
 * Input: 
 * Rounak Mukherjee
 * 
 * sc.next();       // Rounak
 * sc.nextLine();   // Rounak Mukherjee
 */


// 2. BufferedReader - faster and very common
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );
        String name = br.readLine();
        int age = Integer.parseInt(br.readLine()); // Notice that readLine() always returns a String.
        System.out.println(name);
        System.out.println(age);
        br.close(); // always close a resouce
    }
}

// 3. BufferedReader + StringTokenizer
// This is important for DSA/competitive programming. Suppose input is: 10 20 30 40 50

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        System.out.println(a + b + c + d + e);
    }
}

//4. BufferedInputStream - very fast
//   For serious competitive programming, you can read directly from System.in.
//   But this is byte-level input, so it's more complicated. You generally don't need this for normal Java development.
import java.io.*;
class Main {
    public static void main(String[] args) throws Exception {

        BufferedInputStream in = new BufferedInputStream(System.in);

        int c = in.read();
        System.out.println((char)c);
    }
}