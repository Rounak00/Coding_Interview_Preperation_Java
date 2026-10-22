// Threads : A thread is the smallest unit of execution within a process.
/**
 * Concurrency: Multiple tasks make progress during overlapping periods.
 * Parallelism: Multiple tasks execute at exactly the same time on different processing cores.
 */

/**
 * Why do we need threads?
 * Imagine you're downloading a file in an application.
 * Without multithreading:
 * 1. Start downloading the file.
 * 2. The application waits for the download to finish.
 * 3. Only then can it perform other tasks.
 * With multithreading:
 * - Thread 1: Downloads the file.
 * - Thread 2: Handles user interactions.
 * - Thread 3: Processes other data.
 * The application can remain responsive while the download runs.
 */

//Method 1: Extend the Thread class
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}
class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}

//Method 2: Implement the Runnable interface
class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Task is running");
    }
}
class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTask());
        t1.start();
    }
}

// Multiple Thread in a code 
class ThreadOne extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread One: " + i);
        }
    }
}
class ThreadTwo extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread Two: " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();

        t1.start();
        t2.start();
         // both auto prallel based on JVM
    }
}

/*
Thread Priority in Java
Thread priority tells the JVM which thread is preferred for execution when scheduling threads.
- Priority range: 1 to 10
- Thread.MIN_PRIORITY = 1
- Thread.NORM_PRIORITY = 5 (default)
- Thread.MAX_PRIORITY = 10
- Use setPriority() to set priority and getPriority() to retrieve it.
Important: Higher priority does not guarantee that a thread executes first. Scheduling depends on the JVM and operating system.
---------------------------------------------------------------------------------------------------------------------------------
Thread Sleep in Java
Thread.sleep() pauses the currently executing thread for a specified duration.
- Thread.sleep(1000) pauses for approximately 1 second.
- It is a static method of the Thread class.
- It throws InterruptedException, so you must handle or declare it.
- Sleeping does not release any locks the thread holds.
*/

class ThreadOne extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread One: " + i);

            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class ThreadTwo extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread Two: " + i);

            try {
                Thread.sleep(500); // Pause for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();

        // Set thread priorities
        t1.setPriority(Thread.MAX_PRIORITY); // 10
        t2.setPriority(Thread.MIN_PRIORITY); // 1
        //t1.setPriority(8); // Custom priority
        //t2.setPriority(3); // Custom priority

        System.out.println("T1 Priority: " + t1.getPriority());
        System.out.println("T2 Priority: " + t2.getPriority());

        t1.start();
        t2.start();
    }
}

/**
 * Why need Runnable when we have Thread ?
 * The main reason is Java supports extending only one class, but you can implement multiple interfaces.
 * Here, your class already extends Thread. If you also need to extend another class, 
 * you cannot do it because Java doesn't support multiple class inheritance.
 * class MyTask extends OtherClass, Thread { } // Invalid
 * 
 * 
 * Thats why need runnable.
 */
class MyTask extends OtherClass implements Runnable {
    public void run() {
        System.out.println("Task running");
    }
}

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTask());
        t1.start();
    }
}

// Runnable with anonymous class
public class Main {
    public static void main(String[] args) {

        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        };

        Thread t1 = new Thread(task);
        t1.start();
    }
}
// Runnable with lambda expression 
public class Main {
    public static void main(String[] args) {

        Runnable task = () -> {
            System.out.println("Thread is running");
        };

        Thread t1 = new Thread(task);
        t1.start();
        // more shorter => new Thread(() -> System.out.println("Thread is running")).start();
    }
}