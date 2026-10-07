/*
*  
* *  
* * *  
* * * *  
* * * * *  
*/
class Main {
    static void printStar(int an){
        for(int i=0; i<5; i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        printStar(5);
    }
}

/*
* * * * *  
* * * *  
* * *  
* *  
* 
*/
class Main {
    static void printStar(int an){
        for(int i=0; i<5; i++){
            for (int j=5;j>i;j--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        printStar(5);
    }
}

/*
    * 
   ** 
  *** 
 **** 
***** 
*/

class Main {
    static void printStar(int an){
        for(int i=1; i<=5; i++){
            for(int j=1;j<=an-i;j++){ System.out.print(" ");}
            for (int j = 1; j <= i; j++) { System.out.print("*"); }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        printStar(5);
    }
}


/*
1  
1 2  
1 2 3  
1 2 3 4  
1 2 3 4 5 
*/
class Main {
    static void printStar(int an){
        for(int i=0; i<5; i++){
            for (int j=1;j<=i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        printStar(5);
    }
}

/*
1  
2 2  
3 3 3  
4 4 4 4  
5 5 5 5 5  
*/
class Main {
    static void printStar(int an){
        int pr=1;
        for(int i=0; i<5; i++){
            for (int j=1;j<=i+1;j++){ System.out.print(pr+" ");}
            pr+=1;
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        printStar(5);
    }
}

/**
    1  
    2 3  
    4 5 6  
    7 8 9 10  
    11 12 13 14 15  
 */
class Main {
    static void printStar(int an){
        int pr=1;
        for(int i=0; i<5; i++){
            for (int j=1;j<=i+1;j++){ System.out.print(pr+" "); pr+=1;}
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        printStar(5);
    }
}