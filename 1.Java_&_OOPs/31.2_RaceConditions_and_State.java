/*
Race Condition in Java
A race condition occurs when multiple threads access and modify shared data at the same time,
and the final result depends on the order in which they execute.
*/

// Example: Two threads increment the same counter, but some increments may be lost.
// Code without synchronization
class Counter {
    int count = 0;

    void increment() {
        count++; // Race condition
    }
}
//Solution: synchronized
class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}

/**
 * Key Notes
- Cause: Multiple threads modify shared data.
- Problem: Incorrect or unpredictable results.
- Solution: Use synchronized or AtomicInteger.
- Thread.sleep() does not prevent race conditions.
 */


//Alternative: AtomicInteger
//Java also provides atomic classes for thread-safe operations.
import java.util.concurrent.atomic.AtomicInteger;

class Counter {
    AtomicInteger count = new AtomicInteger(0);

    void increment() {
        count.incrementAndGet();
    }
}

// 
//join() Method in Java
//Definition: The join() method makes the current thread wait until the specified thread finishes execution.
// Join throws this exception "InterruptedException"
class Main {
    public static void main(String[] args)
            throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println(i);
            }
        });
        t1.start();
        t1.join();
        System.out.println("Main thread finished");
    }
}




// States of Thread
//Thread States in Java - Java has 6 thread states, defined in Thread.State.
//State                	Meaning
//NEW	                    Thread is created but not started.
//RUNNABLE	            Thread is running or ready to run.
//BLOCKED	                Waiting to acquire a monitor lock.
//WAITING	                Waiting indefinitely for another thread's action.
//TIMED_WAITING	        Waiting for a specified time, e.g. sleep().
//TERMINATED	            Thread execution has finished.

public class Main {
    public static void main(String[] args)
            throws InterruptedException {

        Thread t = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        System.out.println(t.getState()); // NEW

        t.start();
        System.out.println(t.getState()); // Usually RUNNABLE

        Thread.sleep(100);
        System.out.println(t.getState()); // TIMED_WAITING

        t.join();
        System.out.println(t.getState()); // TERMINATED
    }
}
/* 
start() > typically moves from NEW to RUNNABLE.
sleep() > TIMED_WAITING.
wait() or join() without a timeout > WAITING.
Waiting to acquire a synchronized lock > BLOCKED.
run() finishes > TERMINATED.
*/

// stop and notify also there.
// stop() - Deprecated. It forcibly stops a thread and can leave shared data in an inconsistent state.
// notify() - Not deprecated. It wakes up one thread waiting on that object's monitor.
// notifyAll() - Not deprecated. It wakes all threads waiting on that object's monitor.