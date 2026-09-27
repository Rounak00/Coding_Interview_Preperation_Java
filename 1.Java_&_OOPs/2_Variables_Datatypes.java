// Variables 
<Variable_Type> Variable-name = variable-value;

//Data Types / Variable Types
// 1. Primitive Datatype
byte    -> 1 byte [(-2^7) to  (2^7)+ 1]
short   -> 2 byte
int     -> 4 byte
long    -> 8 byte
float   -> 4 byte 
double  -> 8 byte
char    -> 2 byte (unicode and note ascii value) [uses single quotes here '']
boolean -> can not use 0/1 as we use in CPP/C 

// 2. Non-Primitive / Reference data types
String
Arrays
Classes
Objects
Interfaces
Enums

/*
* Primitive → stores the actual value
* Reference → stores a reference to an object in memory.
*/

//Usage
int a = 7;
float 7 = 8.6;



/* 
** Literals and Type Conversaions
*  Literals -> Values that we assign in a Variable is Literals
*  Type Conversions -> Converting a value from one data type to another.
*/

// Literals
  In a "int" we can store Integer value, Binary, Octal and even Hexa Decimal values.
      we can also store int like this for proper count of zeros -> int a = 1_00_00_000;

  long b = 100L;        // Long literal
  float c = 10.5f;      // Float literal (Defailt is always double)

// Type Conversions
// Automatic : Smaller type → larger type
// Manual :  larger type → Smaller type  (Casting)
//           in type casting you may loose some values 
    double a = 10.5;
    int b = (int) a; //like here we loose precision values


// Type Promotions 
byte a = 10;
byte b = 20;
int c = a + b;

System.out.println(c);