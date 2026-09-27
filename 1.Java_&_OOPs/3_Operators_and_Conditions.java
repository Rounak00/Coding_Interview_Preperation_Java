// Java Operators
1. Arithmetic: + - * / %
2. Assignment: = += -= *= /= %=
3. Relational: == != > < >= <=  // (always returns a true or false)
4. Logical: && || !
5. Unary: ++ -- + - !
6. Bitwise: & | ^ ~
7. Shift: << >> >>>  // >>  signed right shift(preserves sign) , >>>  unsigned right shift(fills with 0)
8. Ternary: condition ? true : false
9. instanceof: obj instanceof Class


// Conditional Statement
// 1. if
if (age >= 18) {
    System.out.println("Adult");
}

// 2. if-else
if (age >= 18)
    System.out.println("Adult");
else
    System.out.println("Minor");

// 3. if-else-if
if (marks >= 90)
    System.out.println("A");
else if (marks >= 60)
    System.out.println("B");
else
    System.out.println("C");

// 4. Switch
int day = 2;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid day");
}

// new switch format
switch (day) {
    case 1 -> System.out.println("Monday");
    case 2 -> System.out.println("Tuesday");
    default -> System.out.println("Invalid");
}


// Ternary operator:
String result = age >= 18 ? "Adult" : "Minor";