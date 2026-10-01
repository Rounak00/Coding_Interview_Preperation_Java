public class Main {
    public static void main(String[] args) {

        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};
        // int numbers[] = {10, 20, 30, 40, 50}; this also valid
        // int num[]=new int[3]; //intialize with size and insert values later
        // Access array element using index (starts from 0)
        System.out.println(numbers[0]); // 10
        System.out.println(numbers[2]); // 30

        // Change an element
        numbers[1] = 25;

        // Array length
        System.out.println(numbers.length); // 5

        // Loop through the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}


// 2D Array
public class Main {
    public static void main(String[] args) {

        // 2D array = rows and columns
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        // Access element: [row][column]
        System.out.println(matrix[0][1]); // 20

        // Change an element
        matrix[1][2] = 65;

        // Traverse using nested loops
        for (int i = 0; i < matrix.length; i++) {          // rows
            for (int j = 0; j < matrix[i].length; j++) {   // columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


// Drawbacks of array
Fixed size : cannot grow/shrink after creation.
Same data type : stores only one type of element.
Insertion/deletion is costly : elements may need shifting.
Memory can be wasted : if allocated size is larger than needed.
Limited functionality : fewer built-in operations compared to collections like ArrayList.

// Array of objects
class Student {
    String name;

    Student(String name) { //Constructor
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {

        // Array of Student objects
        Student[] students = {
            new Student("Rahul"),
            new Student("Amit"),
            new Student("Riya")
        };
        // Access object
        System.out.println(students[0].name); // Rahul
    }
}



// Enhanced for loop
// 1D Array
for (int num : numbers) {
    System.out.println(num);
}

// 2D Array
for (int[] row : matrix) {
    for (int num : row) {
        System.out.print(num + " ");
    }
    System.out.println();
}