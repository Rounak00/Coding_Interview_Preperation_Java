//Loops

// for loop - Used when you know how many times to repeat.
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}

// while loop - Runs while a condition is true.
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}

//do-while loop - Executes at least once, then checks the condition.
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);

/*
* break > completely stops the loop.
* continue > skips the current iteration and moves to the next one.
*/

// break
for (int i = 1; i <= 5; i++) {
    if (i == 3)
        break;
    System.out.println(i); // 1 2
}

// continue
for (int i = 1; i <= 5; i++) {
    if (i == 3)
        continue;
    System.out.println(i);// 1 2 4 5
}