JDK = Java Development Kit > It's the complete toolkit you need to develop and run Java programs.


JDK contains
├── JRE         → Provides the JVM + required Java libraries to run Java applications.
│   └── JVM     → Executes Java bytecode (.class) on your machine.
├── javac       → Java compiler
├── java        → Runs Java programs
├── javadoc     → Generates documentation
└── other tools
The important distinction

JRE + development tools, especially the compiler (javac).
Used when you're actually writing Java code.
Simple flow
Main.java
   ↓
javac Main.java       ← JDK compiler
   ↓
Main.class
   ↓
java Main             ← JVM
   ↓
Program runs


> Now remeber JVM, <name>.java nothing is platform independent but only the byte-code(<name>.class) is  Platform independent.
> Hello World Example -> 
    file name : Hello.java
      
        class Hello{
            public static void main(string args[]){
                System.out.println("Hello World"); //Print then cursor go to next line
                System.out.print("Hello"); // only print
                System.out.print("World");
                System.out.print("Hello\nWorld"); //line break
            }
        }


> send Arguments in run time (Command line Arguments)
   
        public class Main {
            public static void main(String[] args) {
                System.out.println(args[0]);
                System.out.println(args[1]);
            }
        }

        > java Main Hello World ↵
        