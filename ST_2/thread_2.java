import java.util.*;
import java.lang.*;

class abc extends Thread {
    public void run () {
        System.out.println("Thread");
    }
}

public class thread_2 {
    public static void main(String[] args) {
        abc t1 = new abc();
        t1.start();
        System.out.println("Bye");
        System.out.println(t1);
    }
}

// first executes bye and then thread due to time taken in switching.

// problem:- simplest code we can't do multiple inheritence