import java.util.*;
import java.lang.*;

public class thread_1 {
    // main or primary thread is main function
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t);
        // change name of thread
        t.setName("CU");
        System.out.println(t);
        // only name of thread
        System.out.println(t.getName());
        // set priority of thread
        t.setPriority(7);
        // print priority
        System.out.println(t.getPriority());
    }
}

// the output [main,5,main] where 1st argument is name of the thread, 2nd tells priority we can set priority between 1 and 10 where 10 is max and 3rd represents thr group of thread.